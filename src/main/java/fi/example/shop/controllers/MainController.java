package fi.example.shop.controllers;


import fi.example.shop.entities.Car;
import fi.example.shop.entities.Product;
import fi.example.shop.entities.Telephon;
import fi.example.shop.services.AutoService;
import fi.example.shop.services.ProductService;
import fi.example.shop.services.TelephonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MainController {
    //http://localhost:8189/app/index корень нашего приложения находится здесь


    private ProductService productService;    //ссылочные переменные
    private AutoService autoService;         //ссылочные переменные
    private TelephonService telephonService; //ссылочные переменные



    //***@Autowired***** ВАЖНО: СОЗДАНИЕ Bean (объекта)  ****************//
    @Autowired
    public MainController(ProductService productService, AutoService autoService, TelephonService telephonService) {
        this.productService = productService;
        this.autoService = autoService;
        this.telephonService = telephonService;
    }

    @GetMapping("/index")
    public String homePage(){
        return"index";
    }

    @GetMapping("/shop")
    // (Model model) это ссылка на данные каторые будут прокидыватся на html страницу
    public String shopPage(Model model){
        //запрос у сервиса наличие всех продуктыов
        List<Product> allProducts = productService.getAllProducts();
        //отображение их на страничк "shop"
        model.addAttribute("products_", allProducts);
        return "shop";
    }


    @GetMapping("/details/{id}")
    // (Model model) это ссылка на данные каторые будут прокидыватся на html страницу
    public String detailsPage(Model model, @PathVariable ("id") Long id) {
        //запрос у сервиса o наличие определённого продукта по ID
        Product selectedProduct = productService.getProductById(id);
        //отображение этого продукта на страничке "shop"
        model.addAttribute("selectedProduct", selectedProduct);
        return "details";
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id){
        // удаление продукта по ID
        productService.deleteProductById(id);
        return "redirect:/shop";
    }


    @GetMapping("/auto")
    public String showAuto( Model model){
        //запрос у сервиса наличие всех автомобилей
       List<Car> allCar = autoService.getAllAuto();
        //отображение их на страничк "Autoshop"
       model.addAttribute("auto_", allCar);

        return "autoshop";
    }


    @GetMapping("/puhelin")
    public String puhelin(Model model){
        //запрос у сервиса наличие всех телефонов
        List<Telephon> allTelephons = telephonService.getAllTetelphon();
        //отображение их на страничк "puhelinShop"
        model.addAttribute("puhelin_", allTelephons);

        return"puhelinshop";
    }
}

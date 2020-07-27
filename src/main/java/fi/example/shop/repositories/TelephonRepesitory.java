package fi.example.shop.repositories;

import fi.example.shop.entities.Car;
import fi.example.shop.entities.Product;
import fi.example.shop.entities.Telephon;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

//этот класс отвечает за работу с продуктами (удаление, добовление, и т.д.)
// симуляция БД (где хранятся товары)

@Component
public class TelephonRepesitory {

    private ProductRepository   productRepository;

    public TelephonRepesitory(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private List<Telephon> telefons;

    public List<Telephon> getTelefons() {
        return telefons;
    }

    @PostConstruct
    public void TelefonAll(){

        telefons = new ArrayList<>();

        telefons.add(new Telephon(1, "IPHONE", 1100));
        telefons.add(new Telephon(2, "NOKIA", 600));
        telefons.add(new Telephon(3, "SAMSUNG", 800));
        telefons.add(new Telephon(4, "SONY", 650));
        telefons.add(new Telephon(5, "LG", 300));

    }

        public void getById(Long id) {
        //поиска объекта
        for (Telephon n : telefons) {
            if (n.getId() == id) {
                productRepository.products.add(new Product(n.getId(), n.getModel(), n.getPrice()));
                return;

            }
        }

    }


}

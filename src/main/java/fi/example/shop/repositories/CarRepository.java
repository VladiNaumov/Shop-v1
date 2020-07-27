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
public class CarRepository {

   private ProductRepository productRepository;

    public CarRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private List<Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

    @PostConstruct
    public void InitAuto() {

        carList = new ArrayList<>();

        carList.add(new Car(1, "VOLVO", 30000));
        carList.add(new Car(2, "BMV", 25000));
        carList.add(new Car(3, "TESLA", 80000));
        carList.add(new Car(4, "BMV", 25000));
        carList.add(new Car(5, "TESLA", 80000));
        carList.add(new Car(6, "BMV", 25000));
        carList.add(new Car(7, "TESLA", 80000));


    }

    public void ById(Long id) {
        //поиска объекта
        for (Car n : carList) {
            if (n.getId() == id) {

                productRepository.products.add(new Product(n.getId(), n.getModel(), n.getPrice()));
                return;

            }
        }

    }
}

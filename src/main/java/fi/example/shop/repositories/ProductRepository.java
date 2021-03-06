package fi.example.shop.repositories;

import fi.example.shop.entities.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

//этот класс отвечает за работу с продуктами (удаление, добовление, и т.д.)
// симуляция БД (где хранятся товары)

@Component
public class ProductRepository {

    public List<Product> products;

    public List<Product> getProducts() {
        return products;
    }


    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L, "MILK", 3));
        products.add(new Product(2L, "MILK", 3));
        products.add(new Product(3L, "BRED", 2));
        products.add(new Product(4L, "BURGER", 7));
        products.add(new Product(5L, "MELONI", 2));
    }


    public void deleteById(Long id) {
        //поиска объекта
        for (Product n : products ) {
            if (n.getId() == id) {
                products.remove(n);
                return;

            }
        }
    }


}


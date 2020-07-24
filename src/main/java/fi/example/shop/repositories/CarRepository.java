package fi.example.shop.repositories;


import fi.example.shop.entities.Car;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

// замена БД (где хранятся товары)
@Component
public class CarRepository {

    private List<Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

    @PostConstruct
    public void InitAuto(){

        carList = new ArrayList<>();

        carList.add(new Car(1, "VOLVO", 30000));
        carList.add(new Car(2, "BMV", 25000));
        carList.add(new Car(3, "TESLA", 80000));
        carList.add(new Car(4, "BMV", 25000));
        carList.add(new Car(5, "TESLA", 80000));
        carList.add(new Car(6, "BMV", 25000));
        carList.add(new Car(7, "TESLA", 80000));


    }

}

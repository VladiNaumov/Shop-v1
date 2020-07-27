package fi.example.shop.services;

import fi.example.shop.entities.Car;
import fi.example.shop.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Этот класс получает задание от класса помеченной аннотацией @Controller и передаёт задание классу помеченной аннотацией @Component

@Service
public class AutoService  {

    private CarRepository carRepository;


    @Autowired
    public AutoService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllAuto(){
        return carRepository.getCarList();
    }


    public void getCarById(Long id){
        carRepository.ById(id);

    }

}

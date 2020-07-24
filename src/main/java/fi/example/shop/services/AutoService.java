package fi.example.shop.services;

import fi.example.shop.entities.Car;
import fi.example.shop.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    private CarRepository carRepository;


   @Autowired
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllAuto(){
        return carRepository.getCarList();
    }


}

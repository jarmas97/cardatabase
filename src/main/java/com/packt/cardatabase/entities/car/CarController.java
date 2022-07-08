package com.packt.cardatabase.entities.car;

import com.packt.cardatabase.entities.car.Car;
import com.packt.cardatabase.entities.car.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    CarRepository carRepository;

    @RequestMapping(value = "/cars")
    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }
}

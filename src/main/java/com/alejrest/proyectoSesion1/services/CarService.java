package com.alejrest.proyectoSesion1.services;

import com.alejrest.proyectoSesion1.entities.typesCar.Car;
import com.alejrest.proyectoSesion1.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public Car getOneRandomCar(String typeCar){
        return carRepository.getRandomCar(typeCar);
    }

    public void saveRandomCar(Car car){
        carRepository.saveCar(car);
    }

    public List<Car> listAllCars(){
        return carRepository.listAllCars();
    }
}

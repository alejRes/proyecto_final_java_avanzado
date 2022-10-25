package com.alejrest.proyectoSesion1.repositories;

import com.alejrest.proyectoSesion1.entities.typesCar.Car;

import java.util.List;

public interface CarRepository {

    Car getRandomCar(String typeCar);
    void saveCar(Car car);
    List<Car> listAllCars();
}

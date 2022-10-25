package com.alejrest.proyectoSesion1.repositories;

import com.alejrest.proyectoSesion1.entities.typesCar.Car;
import com.alejrest.proyectoSesion1.utils.CarFacade;
import com.alejrest.proyectoSesion1.utils.CarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepositoryMemImpl implements CarRepository{
    ArrayList<Car> cars = new ArrayList();

    @Autowired
    CarFacade carFacade;
    @Override
    public Car getRandomCar(String typeCar) {
        return carFacade.getCar(typeCar);
    }

    @Override
    public void saveCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> listAllCars() {
        return cars;
    }

}

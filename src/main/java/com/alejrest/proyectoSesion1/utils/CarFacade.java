package com.alejrest.proyectoSesion1.utils;

import com.alejrest.proyectoSesion1.entities.typesCar.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarFacade {

    CarFactory carFactory;
    @Autowired
    Switchboard switchboard;

    public Car getCar(String typeCar) {
        carFactory = new CarFactory(typeCar);
        try {
            switchboard.StarUp(carFactory.getCarInstance());
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        return carFactory.getCarInstance();
    }
}

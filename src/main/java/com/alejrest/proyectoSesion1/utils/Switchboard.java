package com.alejrest.proyectoSesion1.utils;

import com.alejrest.proyectoSesion1.entities.typesCar.Car;
import org.springframework.stereotype.Component;

@Component
public class Switchboard {

    public void StarUp(Car car){
        car.getAirConditioning().setTurnOn(true);
        car.getBatery().setBateryTurnOn(true);
        car.getMotor().setMotorTurnOn(true);
    }
}

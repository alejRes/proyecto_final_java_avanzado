package com.alejrest.proyectoSesion1.entities.typesCar;

import com.alejrest.proyectoSesion1.entities.partsCar.AirConditioning;
import com.alejrest.proyectoSesion1.entities.partsCar.Batery;
import com.alejrest.proyectoSesion1.entities.partsCar.Injection;
import com.alejrest.proyectoSesion1.entities.partsCar.Motor;


public class CombustionCar extends Car {

    private Injection injection;

    public Injection getInjection() {
        return injection;
    }

    public void setInjection(Injection injection) {
        this.injection = injection;
    }
    public CombustionCar(){
        super();
    }

    public CombustionCar(String carRegistration, String brand, String model, String color, int numberOfDoors, Motor motor, Batery batery, AirConditioning airConditioning, Injection injection) {
        super(carRegistration, brand, model, color, numberOfDoors, motor, batery, airConditioning);
        this.injection = injection;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(getInjection());

        return sb.toString();
    }

}

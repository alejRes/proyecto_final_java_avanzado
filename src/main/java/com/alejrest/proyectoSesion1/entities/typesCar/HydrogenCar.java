package com.alejrest.proyectoSesion1.entities.typesCar;

import com.alejrest.proyectoSesion1.entities.partsCar.AirConditioning;
import com.alejrest.proyectoSesion1.entities.partsCar.Batery;
import com.alejrest.proyectoSesion1.entities.partsCar.HydrogenTank;
import com.alejrest.proyectoSesion1.entities.partsCar.Motor;

public class HydrogenCar extends Car{
    private HydrogenTank hydrogenTank;

    public HydrogenTank getHydrogenTank() {
        return hydrogenTank;
    }

    public void setHydrogenTank(HydrogenTank hydrogenTank) {
        this.hydrogenTank = hydrogenTank;
    }
    public HydrogenCar() {
        super();
    }

    public HydrogenCar(String carRegistration, String brand, String model, String color, int numberOfDoors, Motor motor, Batery batery, AirConditioning airConditioning, HydrogenTank hydrogenTank) {
        super(carRegistration, brand, model, color, numberOfDoors, motor, batery, airConditioning);
        this.hydrogenTank = hydrogenTank;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\n: " + getHydrogenTank());

        return sb.toString();
    }

}


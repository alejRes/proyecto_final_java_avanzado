package com.alejrest.proyectoSesion1.entities.typesCar;

import com.alejrest.proyectoSesion1.entities.partsCar.AirConditioning;
import com.alejrest.proyectoSesion1.entities.partsCar.Batery;
import com.alejrest.proyectoSesion1.entities.partsCar.ElectricBatery;
import com.alejrest.proyectoSesion1.entities.partsCar.Motor;

public class ElectricCar extends Car{
    private ElectricBatery electricBatery;

    public ElectricCar(){
        super();
    }
    public ElectricCar(String carRegistration, String brand, String model, String color, int numberOfDoors, Motor motor, Batery batery, AirConditioning airConditioning) {
        super(carRegistration, brand, model, color, numberOfDoors, motor, batery, airConditioning);
    }

    public ElectricBatery getElectricBatery() {
        return electricBatery;
    }

    public void setElectricBatery(ElectricBatery electricBatery) {
        this.electricBatery = electricBatery;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\n: " + getElectricBatery());

        return sb.toString();
    }

}

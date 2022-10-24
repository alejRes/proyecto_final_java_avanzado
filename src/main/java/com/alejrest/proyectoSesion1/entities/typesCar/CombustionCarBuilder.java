package com.alejrest.proyectoSesion1.entities.typesCar;

import com.alejrest.proyectoSesion1.entities.partsCar.AirConditioning;
import com.alejrest.proyectoSesion1.entities.partsCar.Batery;
import com.alejrest.proyectoSesion1.entities.partsCar.Injection;
import com.alejrest.proyectoSesion1.entities.partsCar.Motor;

public class CombustionCarBuilder {

    private CombustionCar combustionCar;

    public CombustionCarBuilder(){
        combustionCar = new CombustionCar();
    }

    public CombustionCarBuilder setInjection(Injection injection){
        combustionCar.setInjection(injection);
        return this;
    }

    public CombustionCarBuilder setCarRegistration(String carRegistration){
        combustionCar.setCarRegistration(carRegistration);
        return this;
    }

    public CombustionCarBuilder setBrand(String brand){
        combustionCar.setBrand(brand);
        return this;
    }

    public CombustionCarBuilder setModel(String model){
        combustionCar.setModel(model);
        return this;
    }

    public CombustionCarBuilder setColor(String color){
        combustionCar.setColor(color);
        return this;
    }

    public CombustionCarBuilder setNumberOfDoors(int number){
        combustionCar.setNumberOfDoors(number);
        return this;
    }

    public CombustionCarBuilder setMotor(Motor motor){
        combustionCar.setMotor(motor);
        return this;
    }

    public CombustionCarBuilder setBatery(Batery batery){
        combustionCar.setBatery(batery);
        return this;
    }

    public CombustionCarBuilder setAirConditioning(AirConditioning airConditioning){
        combustionCar.setAirConditioning(airConditioning);
        return this;
    }

    public CombustionCar builder(){
        return combustionCar;
    }
}

package com.alejrest.proyectoSesion1.entities.typesCar;

import com.alejrest.proyectoSesion1.entities.partsCar.*;

public class ElectricCarBuilder {
    private ElectricCar electricCar;

    public ElectricCarBuilder(){
        electricCar = new ElectricCar();
    }

    public ElectricCarBuilder setElectricBatery(ElectricBatery electricBatery){
        electricCar.setElectricBatery(electricBatery);
        return this;
    }

    public ElectricCarBuilder setCarRegistration(String carRegistration){
        electricCar.setCarRegistration(carRegistration);
        return this;
    }

    public ElectricCarBuilder setBrand(String brand){
        electricCar.setBrand(brand);
        return this;
    }

    public ElectricCarBuilder setModel(String model){
        electricCar.setModel(model);
        return this;
    }

    public ElectricCarBuilder setColor(String color){
        electricCar.setColor(color);
        return this;
    }

    public ElectricCarBuilder setNumberOfDoors(int number){
        electricCar.setNumberOfDoors(number);
        return this;
    }

    public ElectricCarBuilder setMotor(Motor motor){
        electricCar.setMotor(motor);
        return this;
    }

    public ElectricCarBuilder setBatery(Batery batery){
        electricCar.setBatery(batery);
        return this;
    }

    public ElectricCarBuilder setAirConditioning(AirConditioning airConditioning){
        electricCar.setAirConditioning(airConditioning);
        return this;
    }

    public ElectricCar builder(){
        return electricCar;
    }
}

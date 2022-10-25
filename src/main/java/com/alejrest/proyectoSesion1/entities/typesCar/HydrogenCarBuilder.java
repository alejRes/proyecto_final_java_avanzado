package com.alejrest.proyectoSesion1.entities.typesCar;

import com.alejrest.proyectoSesion1.entities.partsCar.*;

public class HydrogenCarBuilder {
    private HydrogenCar hydrogenCar;

    public HydrogenCarBuilder(){
        hydrogenCar = new HydrogenCar();
    }

    public HydrogenCarBuilder setHydrogenTank(HydrogenTank hydrogenTank){
        hydrogenCar.setHydrogenTank(hydrogenTank);
        return this;
    }

    public HydrogenCarBuilder setCarRegistration(String carRegistration){
        hydrogenCar.setCarRegistration(carRegistration);
        return this;
    }

    public HydrogenCarBuilder setBrand(String brand){
        hydrogenCar.setBrand(brand);
        return this;
    }

    public HydrogenCarBuilder setModel(String model){
        hydrogenCar.setModel(model);
        return this;
    }

    public HydrogenCarBuilder setColor(String color){
        hydrogenCar.setColor(color);
        return this;
    }

    public HydrogenCarBuilder setNumberOfDoors(int number){
        hydrogenCar.setNumberOfDoors(number);
        return this;
    }

    public HydrogenCarBuilder setMotor(Motor motor){
        hydrogenCar.setMotor(motor);
        return this;
    }

    public HydrogenCarBuilder setBatery(Batery batery){
        hydrogenCar.setBatery(batery);
        return this;
    }

    public HydrogenCarBuilder setAirConditioning(AirConditioning airConditioning){
        hydrogenCar.setAirConditioning(airConditioning);
        return this;
    }

    public HydrogenCar builder(){
        return hydrogenCar;
    }
}

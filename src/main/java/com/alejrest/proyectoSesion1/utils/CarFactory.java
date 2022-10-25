package com.alejrest.proyectoSesion1.utils;

import com.alejrest.proyectoSesion1.entities.partsCar.AirConditioning;
import com.alejrest.proyectoSesion1.entities.typesCar.*;

public class CarFactory {

    private Car car;
    private GenerateInfoCars generateInfoCars;

    private CarFactory(){}

    public CarFactory(String typeCar){
        generateInfoCars = new GenerateInfoCars();
        String brand = generateInfoCars.generateBrand();
        if(typeCar.equalsIgnoreCase("combustion")){
            car = new CombustionCarBuilder()
                    .setCarRegistration(generateInfoCars.generateCarRegistration())
                    .setBrand(brand)
                    .setModel(generateInfoCars.generateModel(brand))
                    .setColor(generateInfoCars.generateColor())
                    .setNumberOfDoors(generateInfoCars.generateNumberDoors())
                    .setMotor(generateInfoCars.generateMotor(typeCar))
                    .setBatery(generateInfoCars.generateBatery())
                    .setAirConditioning(new AirConditioning())
                    .setInjection(generateInfoCars.generateInjection())
                    .builder();
        } else if (typeCar.equalsIgnoreCase("hybrid")) {
            car = new HydrogenCarBuilder()
                    .setCarRegistration(generateInfoCars.generateCarRegistration())
                    .setBrand(brand)
                    .setModel(generateInfoCars.generateModel(brand))
                    .setColor(generateInfoCars.generateColor())
                    .setNumberOfDoors(generateInfoCars.generateNumberDoors())
                    .setMotor(generateInfoCars.generateMotor(typeCar))
                    .setBatery(generateInfoCars.generateBatery())
                    .setAirConditioning(new AirConditioning())
                    .setHydrogenTank(generateInfoCars.generateHydrogenTank())
                    .builder();
        } else if (typeCar.equalsIgnoreCase("electric")) {
            car = new ElectricCarBuilder()
                    .setCarRegistration(generateInfoCars.generateCarRegistration())
                    .setBrand(brand)
                    .setModel(generateInfoCars.generateModel(brand))
                    .setColor(generateInfoCars.generateColor())
                    .setNumberOfDoors(generateInfoCars.generateNumberDoors())
                    .setMotor(generateInfoCars.generateMotor(typeCar))
                    .setBatery(generateInfoCars.generateBatery())
                    .setAirConditioning(new AirConditioning())
                    .setElectricBatery(generateInfoCars.generateElectricBatery())
                    .builder();
        }

    }

    public Car getCarInstance(){
        return car.getCarInstance();
    }
}

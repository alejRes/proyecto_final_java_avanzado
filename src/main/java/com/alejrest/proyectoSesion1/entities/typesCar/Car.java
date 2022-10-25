package com.alejrest.proyectoSesion1.entities.typesCar;

import com.alejrest.proyectoSesion1.entities.partsCar.AirConditioning;
import com.alejrest.proyectoSesion1.entities.partsCar.Batery;
import com.alejrest.proyectoSesion1.entities.partsCar.Motor;

  public class Car {

    private String carRegistration;
    private String brand;
    private String model;
    private String Color;
    private int numberOfDoors;
    private Motor motor;
    private Batery batery;
    private AirConditioning airConditioning;

     Car() {

     }
     Car(String carRegistration, String brand, String model, String color, int numberOfDoors, Motor motor, Batery batery, AirConditioning airConditioning) {
         this.carRegistration = carRegistration;
         this.brand = brand;
         this.model = model;
         Color = color;
         this.numberOfDoors = numberOfDoors;
         this.motor = motor;
         this.batery = batery;
         this.airConditioning = airConditioning;
     }


     public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Batery getBatery() {
        return batery;
    }

    public void setBatery(Batery batery) {
        this.batery = batery;
    }

    public AirConditioning getAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Car registration: " + this.getCarRegistration())
                .append("\nBrand: " + this.getBrand())
                .append("\nModel: " + this.getModel())
                .append("\nColor: " + this.getColor())
                .append("\nDoors: " + this.getNumberOfDoors())
                .append("\nMotor: " + this.getMotor())
                .append("\nBatery: " + this.getBatery())
                .append("\nAir conditioning: " + this.getAirConditioning());

        return sb.toString();
    };

}

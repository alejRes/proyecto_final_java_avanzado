package com.alejrest.proyectoSesion1.entities.partsCar;

public enum TypeMotor {

    DIESEL("Diesel motor"),
    GASOLINE("Gasoline motor"),
    HIBRID("Hybrid motor"),
    ELECTRIC("Electric motor");
    private String motorDescription;

    private TypeMotor(String motorDescription) {
        this.motorDescription = motorDescription;
    }

    public String getMotorDescription() {
        return motorDescription;
    }
}
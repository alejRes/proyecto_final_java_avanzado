package com.alejrest.proyectoSesion1.entities.partsCar;

public class Motor {
    private TypeMotor typeMotor;
    private int horsePower;
    private double cubicCapacity;

    private boolean motorTurnOn;

    public Motor(TypeMotor typeMotor, int horsePower, double cubicCapacity) {
        this.typeMotor = typeMotor;
        this.horsePower = horsePower;
        this.cubicCapacity = cubicCapacity;
    }

    public TypeMotor getTypeMotor() {
        return typeMotor;
    }

    public void setTypeMotor(TypeMotor typeMotor) {
        this.typeMotor = typeMotor;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(double cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public boolean isMotorTurnOn() {
        return motorTurnOn;
    }

    public void setMotorTurnOn(boolean motorTurnOn) {
        this.motorTurnOn = motorTurnOn;
    }

    @Override
    public String toString(){
        return new StringBuilder()
                .append("\n\tType motor : " + this.getTypeMotor().getMotorDescription())
                .append("\n\tHorsePower : " + this.getHorsePower())
                .append("\n\tCubic capacity: " + this.getCubicCapacity())
                .toString();
    }
}

enum TypeMotor {

    DIESEL("Diesel motor"),
    GASOLINE("Gasoline motor"),
    HIBRID("Hybrid motor"),
    ELECTRIC("Electric motor");
    private String motorDescription;

    private TypeMotor(String motorDescription){
        this.motorDescription = motorDescription;
    }

    public String getMotorDescription(){
        return motorDescription;
    }
}

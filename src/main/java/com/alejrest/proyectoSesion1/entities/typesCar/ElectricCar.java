package com.alejrest.proyectoSesion1.entities.typesCar;

import com.alejrest.proyectoSesion1.entities.partsCar.ElectricBatery;

public class ElectricCar extends Car{
    private ElectricBatery electricBatery;

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

    @Override
    public Car getCarInstance() {
        return this;
    }
}

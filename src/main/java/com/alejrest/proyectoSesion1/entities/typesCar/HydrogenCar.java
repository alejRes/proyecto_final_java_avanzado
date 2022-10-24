package com.alejrest.proyectoSesion1.entities.typesCar;

import com.alejrest.proyectoSesion1.entities.partsCar.HydrogenTank;

public class HydrogenCar extends Car{
    private HydrogenTank hydrogenTank;

    public HydrogenTank getHydrogenTank() {
        return hydrogenTank;
    }

    public void setHydrogenTank(HydrogenTank hydrogenTank) {
        this.hydrogenTank = hydrogenTank;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\n: " + getHydrogenTank());

        return sb.toString();
    }

    @Override
    public Car getCarInstance() {
        return this;
    }
}


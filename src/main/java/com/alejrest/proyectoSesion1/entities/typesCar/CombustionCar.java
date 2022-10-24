package com.alejrest.proyectoSesion1.entities.typesCar;

import com.alejrest.proyectoSesion1.entities.partsCar.Injection;

public class CombustionCar extends Car {

    private Injection injection;

    public Injection getInjection() {
        return injection;
    }

    public void setInjection(Injection injection) {
        this.injection = injection;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(getInjection());

        return sb.toString();
    }

    @Override
    public Car getCarInstance() {
        return this;
    }
}

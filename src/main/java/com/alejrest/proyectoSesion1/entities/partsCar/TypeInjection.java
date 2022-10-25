package com.alejrest.proyectoSesion1.entities.partsCar;

public enum TypeInjection {
    DIRECT("Direct injection"),
    INDIRECT("Indirect injection");

    private String injectionDescription;

    private TypeInjection(String injectionDescription) {
        this.injectionDescription = injectionDescription;
    }

    public String getInjectionDescription() {
        return injectionDescription;
    }
}
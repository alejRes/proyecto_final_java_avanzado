package com.alejrest.proyectoSesion1.entities.partsCar;

public class Injection {

    private TypeInjection typeInjection;
    private int numberCylinders;

    public Injection(TypeInjection typeInjection, int numberCylinders) {
        this.typeInjection = typeInjection;
        this.numberCylinders = numberCylinders;
    }

    public TypeInjection getTypeInjection() {
        return typeInjection;
    }

    public void setTypeInjection(TypeInjection typeInjection) {
        this.typeInjection = typeInjection;
    }

    public int getNumberCylinders() {
        return numberCylinders;
    }

    public void setNumberCylinders(int numberCylinders) {
        this.numberCylinders = numberCylinders;
    }

    @Override
    public String toString() {
        return new StringBuilder("\nInjection: ")
                .append("\n\tType injection : " + this.getTypeInjection().getInjectionDescription())
                .append("\n\tNumber cylinders : " + this.getNumberCylinders())
                .toString();
    }

}
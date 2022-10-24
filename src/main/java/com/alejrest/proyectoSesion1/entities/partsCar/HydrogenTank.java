package com.alejrest.proyectoSesion1.entities.partsCar;

public class HydrogenTank {

    private int capacity;

    public HydrogenTank(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString(){
        return new StringBuilder("\nHydrogen tank:")
                .append("\n\tCapacity: " + this.getCapacity())
                .toString();
    }
}

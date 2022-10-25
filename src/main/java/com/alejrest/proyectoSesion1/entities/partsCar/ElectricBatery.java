package com.alejrest.proyectoSesion1.entities.partsCar;

public class ElectricBatery {
    private int capacityKws;
    private int autonomy;

    public ElectricBatery(int capacityKws, int autonomy){
        this.capacityKws = capacityKws;
        this.autonomy = autonomy;
    }

    public int getCapacityKws() {
        return capacityKws;
    }

    public void setCapacityKws(int capacityKws) {
        this.capacityKws = capacityKws;
    }

    public int getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(int autonomy) {
        this.autonomy = autonomy;
    }

    @Override
    public String toString() {
        return new StringBuilder("\nElectric batery: ")
                .append("\n\tCapacity: " + this.getCapacityKws() +" kW")
                .append("\n\tAutonomy: " + this.getAutonomy() + " km")
                .toString();
    }
}

package com.alejrest.proyectoSesion1.entities.partsCar;

public class Batery {
    private int amps;
    private int volts;

    private boolean bateryTurnOn;

    public Batery(int amps, int volts) {
        this.amps = amps;
        this.volts = volts;
    }

    public int getAmps() {
        return amps;
    }

    public void setAmps(int amps) {
        this.amps = amps;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }

    public boolean isBateryTurnOn() {
        return bateryTurnOn;
    }

    public void setBateryTurnOn(boolean bateryTurnOn) {
        this.bateryTurnOn = bateryTurnOn;
    }

    @Override
    public String toString() {
        return new StringBuilder("\namps: " + this.getAmps())
                .append("\nvolts: " + this.getVolts())
                .toString();
    }
}

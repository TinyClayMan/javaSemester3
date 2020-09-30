package com.company;

public class Cezve extends Furniture {
    private int timeToReady;

    public Cezve(boolean isNew, String material) {
        super(isNew, material);
    }

    public void setTimeToReady(int timeToReady) {
        this.timeToReady = timeToReady;
    }

    public int getTimeToReady() {
        return timeToReady;
    }

    @Override
    public String toString() {
        return "Cezve{" +
                "timeToReady=" + timeToReady +
                ", " + super.toString() +
                '}';
    }
}

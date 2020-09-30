package com.company;

public class Bean extends Furniture {
    private int volume;

    public Bean (boolean isNew, String material, int volume) {
        super(isNew, material);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "volume='" + volume + '\'' +
                ", " + super.toString() +
                '}';
    }
}

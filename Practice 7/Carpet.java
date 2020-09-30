package com.company;

public class Carpet extends Furniture {
    private String pattern;

    public Carpet(boolean isNew, String material, String pattern) {
        super(isNew, material);
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "pattern='" + pattern + '\'' +
                ", " + super.toString() +
                '}';
    }
}

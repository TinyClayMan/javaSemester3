package com.company;

public class Circle {
    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getP() {
        return 2*3.14*r;
    }

    //public double getT

    public double getS() {
        return 3.14*r*r/4;
    }

    public double getD() {
        return r*2;
    }
}

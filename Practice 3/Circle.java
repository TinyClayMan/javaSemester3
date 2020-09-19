package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle (String color, boolean filled) {
        super (color, filled);
    }

    public Circle (String color, boolean filled, double radius){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 3.14*2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " " + super.toString() +
                '}';
    }
}

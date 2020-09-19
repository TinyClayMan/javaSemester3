package com.company;

public class Point extends Shape {
    public Point (String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}

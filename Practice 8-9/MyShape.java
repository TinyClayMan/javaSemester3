package com.company;

import javafx.scene.paint.Color;

public abstract class MyShape {
    public Color color;
    public double x;
    public double y;

    public MyShape (double x, double y, Color color) {
        this.x=x;
        this.y=y;
        this.color=color;
    }

    public Color getColor() {
        return color;
    }
}

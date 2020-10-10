package com.company;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MyCircle extends MyShape{
    private double r;

    public MyCircle(double x, double y, Color color, double r){
        super(x, y, color);
        this.r=r;
    }

    public Circle returnCircle(){
        Circle circle = new Circle();
        circle.setCenterX(this.x);
        circle.setCenterY(this.y);
        circle.setRadius(this.r);
        circle.setFill(this.color);

        return circle;
    }
}

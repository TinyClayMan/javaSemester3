package com.company;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MyRectangle extends MyShape{
    private double width;
    private double height;

    public MyRectangle(double x, double y, Color color, double width, double height){
        super(x, y, color);
        this.width=width;
        this.height=height;
    }

    public Rectangle returnRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setX(this.x);
        rectangle.setY(this.y);
        rectangle.setWidth(this.width);
        rectangle.setHeight(this.height);
        rectangle.setFill(this.color);

        return rectangle;
    }
}

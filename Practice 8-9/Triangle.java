package com.company;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Triangle extends MyShape {
    private double x2;
    private double x3;
    private double y2;
    private double y3;


    public Triangle(double x, double y, Color color, double x2, double y2, double x3, double y3){
        super(x, y, color);
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }

    public Polygon returnTriangle(){
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(this.x, this.y,
                this.x2, this.y2,
                this.x3, this.y3);
        triangle.setFill(this.color);

        return triangle;
    }
}

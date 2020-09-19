package com.company;

public class MovableCircle extends Circle implements Movable {
    private double horizontalCoordinate;
    private double verticalCoordinate;

    public MovableCircle (String color, boolean filled, double horizontalCoordinate, double verticalCoordinate){
        super(color, filled);
        this.horizontalCoordinate=horizontalCoordinate;
        this.verticalCoordinate=verticalCoordinate;
    }

    @Override
    public void move(double right, double down) {
        this.horizontalCoordinate+=right;
        this.verticalCoordinate+=down;
    }

    String getCoordinates() {
        return "movableCircle{" +
                "x=" + horizontalCoordinate +
                ", y=" + verticalCoordinate +
                '}';
    };
}

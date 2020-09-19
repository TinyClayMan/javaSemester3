package com.company;

public class MovablePoint extends Point implements Movable {
    private double horizontalCoordinate;
    private double verticalCoordinate;

    public MovablePoint (String color, boolean filled, double horizontalCoordinate, double verticalCoordinate){
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
        return "movablePoint{" +
                "x=" + horizontalCoordinate +
                ", y=" + verticalCoordinate +
                '}';
    };
}

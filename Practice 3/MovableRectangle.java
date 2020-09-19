package com.company;

public class MovableRectangle extends Rectangle implements Movable {
    private double horizontalCoordinate;
    private double verticalCoordinate;

    public MovableRectangle (String color, boolean filled, double horizontalCoordinate, double verticalCoordinate){
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
        return "movableRectangle{" +
                "x=" + horizontalCoordinate +
                ", y=" + verticalCoordinate +
                '}';
    };
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    Square s = new Square("red",true);
        System.out.println(s);
        resize(s, 150);
        System.out.println(s);

        Rectangle r = new Rectangle("violet", true, 8, 10);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.toString());

        Circle c = new Circle("zima blue", false);
        c.setRadius(3);
        System.out.println(c.getPerimeter());
        System.out.println(c.getArea());;
        System.out.println(c.toString());

        MovablePoint movePoint = new MovablePoint("pink", true, 1, 1);
        System.out.println(movePoint.getCoordinates());
        movePoint.move(12,3);
        System.out.println(movePoint.getCoordinates());
    }

    static void resize(Square s, double initSize) {
        s.setSide(initSize*2);
    }
}

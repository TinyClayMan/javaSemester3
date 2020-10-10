package com.company;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import java.util.Random;

public class SceneFill {
    public static Group addObjects(Group group){
        for (int i=0; i<20; i++) {
            Random rand = new Random();
            int flagValue = rand.nextInt(3);

            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);
            Color color = Color.rgb(red,green,blue);

            switch (flagValue) {
                case 0:
                    MyRectangle rectangle = new MyRectangle(rand.nextInt(800), rand.nextInt(600), color, rand.nextInt(200), rand.nextInt(200));
                    group.getChildren().add(rectangle.returnRectangle());
                    break;
                case 1:
                    MyCircle circle = new MyCircle(rand.nextInt(800), rand.nextInt(600), color, rand.nextInt(150));
                    group.getChildren().add(circle.returnCircle());
                    break;
                case 2:
                    Triangle triangle = new Triangle(rand.nextInt(800), rand.nextInt(600), color,
                                                      rand.nextInt(800), rand.nextInt(600),
                                                      rand.nextInt(800), rand.nextInt(600));
                    group.getChildren().add(triangle.returnTriangle());
                    break;
            }
        }

        return group;
    }
}

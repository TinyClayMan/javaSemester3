package com.company;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import static com.company.Animation.rotateIt;
import static com.company.SceneFill.addObjects;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Image image = new Image(new FileInputStream(getParameters().getRaw().get(0)));
        ImageView imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(0);
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        imageView.setPreserveRatio(true);

        Group group = new Group(imageView);
        Scene scene = new Scene(addObjects(group), 800, 600);

        rotateIt(group).play();

        stage.setTitle("Composition II");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // write your code here
        launch(args);
    }
}

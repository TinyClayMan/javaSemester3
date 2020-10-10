package com.company;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static com.company.SceneFill.addObjects;

public class ResetButton extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        javafx.scene.control.Button button = new Button("Reset");
        StackPane.setAlignment(button, Pos.BOTTOM_CENTER);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);
        Scene scene = new Scene(stackPane, 800, 600);
        Group group = new Group();

        Button button2 = new Button("Reset");
        StackPane.setAlignment(button, Pos.BOTTOM_CENTER);
        StackPane stackPane2 = new StackPane();
        Scene scene2 = new Scene(stackPane2, 800, 600);

        button.setOnAction(e -> {
            stackPane2.getChildren().clear();
            stackPane2.getChildren().add(addObjects(group));
            stackPane2.getChildren().add(button2);
            stage.setScene(scene2);}
        );
        button2.setOnAction(e -> stage.setScene(scene));

        stage.setTitle("Pr9");
        stage.setScene(scene);

        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

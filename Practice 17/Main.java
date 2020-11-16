import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.ActionListener;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("John Conway's Game of Life");
        stage.setX(100);
        stage.setY(100);
        Stage stageGame = new Stage();
        stageGame.setX(210);
        stageGame.setY(100);

        Button btnAcc = new Button ("Accept");
        Button btnRes = new Button("Reset");
        Button btnIt = new Button("Iterate");
        //Buttons go into vbox
        VBox vbox = new VBox(10);
        GridPane fieldPane = new GridPane();
        final TextField width = new TextField();
        width.setPromptText("Width");
        width.setPrefColumnCount(5);
        final TextField height = new TextField();
        height.setPromptText("Height");
        height.setPrefColumnCount(5);
        final TextField iterations = new TextField();
        iterations.setPromptText("Iterations");
        iterations.setPrefColumnCount(5);

        //1 == width, 2 == height, 3 == iterations
        int[] parameters = {1, 1, 1};
        Conway2D field = new Conway2D(parameters[0], parameters[1]);
        vbox.getChildren().addAll(width, height, iterations, btnAcc, btnIt, btnRes);

        //Close window on pressing ESC
        stage.addEventHandler(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {
            switch(event.getCode()) {
                case ESCAPE : {
                    stage.close();
                    break;
                }
                case F5 : {
                    field.iterate();
                    fillScene.fillField(fieldPane, field.byteToString(), parameters);
                    break;
                }
                case R : {
                    btnRes.fire();
                    break;
                }
                case ENTER: {
                    btnAcc.fire();
                    break;
                }
                default:  {
                    // nothing happens if not ESC or F5
                }
            }
        });

        //Button that accepts the values
        btnAcc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                field.resetIterations();
                parameters[0] = Integer.parseInt(width.getText());
                parameters[1] = Integer.parseInt(height.getText());
                parameters[2] = Integer.parseInt(iterations.getText());
                field.reInit(parameters[0], parameters[1]);
                field.randomSeed();
                for (int i=0; i<parameters[2]; i++) {
                    StringBuilder stringField = new StringBuilder();
                    field.iterate();
                    for (int j = 0; j < parameters[0] * parameters[1]; j++) {
                        if (j % parameters[0] == 0) stringField.append("\n");
                        stringField.append(field.getData()[j]);
                    }
                    //System.out.println(stringField);
                    fillScene.fillField(fieldPane, field.byteToString(), parameters);
                }

                VBox box = new VBox();
                box.getChildren().addAll(fieldPane);
                Scene sceneGame = new Scene(box, parameters[0]*10, parameters[1]*10);
                stageGame.setScene(sceneGame);
                stageGame.show();
            }
        });

        //Button that iterates the cellular automaton
        btnIt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                field.iterate();
                fillScene.fillField(fieldPane, field.byteToString(), parameters);
            }
        });

        //Button that clears the visualization
        btnRes.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                fieldPane.getChildren().clear();
                field.resetIterations();
            }
        });

        Group group = new Group(vbox); //Everything is here
        Scene sceneMenu = new Scene(group, 85, 210);
        stage.setScene(sceneMenu);
        stage.show();
    }

    public static void main(String[] args) {
        //text version
        //SetFieldAndIterations.doIt(10, 10, 5);
        Application.launch(args);
    }
}

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("John Conway's Game of Life");
        stage.setX(100);
        stage.setY(100);
        Stage stageGame = new Stage();
        stageGame.setX(210);
        stageGame.setY(100);

        Button btnAcc = new Button ("Accept");
        Button btnRes = new Button("Reset");
        Button btnIt = new Button("Iterate once");
        Button btnAddIt = new Button("Iterate more");
        //Buttons go into vbox
        VBox vbox = new VBox(10);
        GridPane fieldPane = new GridPane();
        final TextField width = new TextField();
        width.setPromptText("Width");
        width.setPrefColumnCount(4);
        final TextField height = new TextField();
        height.setPromptText("Height");
        height.setPrefColumnCount(4);
        final TextField iterations = new TextField();
        iterations.setPromptText("Iterations");
        iterations.setPrefColumnCount(4);
        final TextField addIterations = new TextField();
        addIterations.setPromptText("# iterations");
        addIterations.setPrefColumnCount(4);

        //1 == width, 2 == height, 3 == iterations
        int[] parameters = {1, 1, 1};
        Conway2D field = new Conway2D(parameters[0], parameters[1]);
        vbox.getChildren().addAll(width, height, iterations, btnAcc, btnIt, btnRes, addIterations, btnAddIt);

        //Close window on pressing ESC
        stage.addEventHandler(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {
            switch (event.getCode()) {
                case ESCAPE -> stage.close();
                case F5 -> btnIt.fire();
                case R -> btnRes.fire();
                case ENTER -> btnAcc.fire();
                default -> {
                    // nothing happens if not ESC or F5
                }
            }
        });

        //Button that accepts the values
        btnAcc.setOnAction(actionEvent -> {
            stageGame.close();
            field.resetIterations();
            parameters[0] = Integer.parseInt(width.getText());
            parameters[1] = Integer.parseInt(height.getText());
            parameters[2] = Integer.parseInt(iterations.getText());
            field.reInit(parameters[0], parameters[1]);
            field.randomSeed();
            btnIt.fire();
            for (int i=1; i<parameters[2]; i++) {
                field.iterate();
            }
            fillScene.fillField(fieldPane, field.getData(), parameters);

            ScrollPane scrollPane = new ScrollPane();
            scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
            scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
            scrollPane.setContent(fieldPane);
            Scene sceneGame = new Scene(new VBox(scrollPane), parameters[0]*10, parameters[1]*10);
            stageGame.setScene(sceneGame);
            stageGame.show();
        });

        //Button that iterates the cellular automaton
        btnIt.setOnAction(actionEvent -> {
            field.iterate();
            fillScene.fillField(fieldPane, field.getData(), parameters);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        //Button that clears the visualization
        btnRes.setOnAction(actionEvent -> {
            fieldPane.getChildren().clear();
            field.resetIterations();
        });

        btnAddIt.setOnAction(actionEvent -> {
            int iterationsCount = Integer.parseInt(addIterations.getText());
            for (int i=0; i<iterationsCount; i++) {
                field.iterate();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            fieldPane.getChildren().clear();
            fillScene.fillField(fieldPane, field.getData(), parameters);
        });

        Group group = new Group(vbox); //Everything is here
        Scene sceneMenu = new Scene(group, 105, 280);
        stage.setScene(sceneMenu);
        stage.show();
    }

    public static void main(String[] args) {
        //text version
        //SetFieldAndIterations.doIt(10, 10, 5);
        Application.launch(args);
    }
}

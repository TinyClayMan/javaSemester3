import javafx.scene.layout.GridPane;

public class fillScene {
    public static void fillField(GridPane gridPane, byte[] data, int[] parameters) {
        for (int i = 0; i < data.length; i++) {

            gridPane.add(data[i] != 0 ? fillSquare.getRect(true) : fillSquare.getRect(false),
                        i % parameters[0], i / parameters[1]);
        }
    }
}

import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;


public class fillScene {
    public static void fillField(GridPane gridPane, StringBuilder stringField, int[] parameters) {
        for (int i = 0; i < stringField.length(); i++) {
            Rectangle rectGray = new Rectangle();
            Rectangle rectRed = new Rectangle();
            rectGray.setWidth(10);
            rectGray.setHeight(10);
            rectGray.setFill(Color.DARKGRAY);
            rectRed.setWidth(10);
            rectRed.setHeight(10);
            rectRed.setFill(Color.RED);
            gridPane.add((stringField.charAt(i) - '0') != 0 ? rectRed : rectGray, i % parameters[0], i / parameters[1]);
        }
        //return gridPane;
    }
}
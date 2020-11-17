import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class fillSquare {
    public static Rectangle getRect(boolean life) {
        Rectangle cell = new Rectangle();
        cell.setWidth(10);
        cell.setHeight(10);
        if (life) {
            cell.setFill(Color.RED);
        } else {
            cell.setFill(Color.DARKGRAY);
        }
        return cell;
    }
}

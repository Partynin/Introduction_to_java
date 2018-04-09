package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise14_6 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++){
                pane.add(getRectangle(i, j), i, j);
            }
        }

        Scene scene = new Scene(pane, 160, 160);
        primaryStage.setTitle("Exercise14_6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /** Return rectangle fill whit or black */
    public static Rectangle getRectangle(int i, int j) {
        Rectangle rectangle = new Rectangle(20, 20);
        if (i % 2 == 0 && j % 2 == 0)
            rectangle.setFill(Color.WHITE);
        else if (i % 2 == 0 && j % 2 != 0)
            rectangle.setFill(Color.BLACK);
        else if (i % 2 != 0 && j % 2 == 0)
            rectangle.setFill(Color.BLACK);
        else if (i % 2 != 0 && j % 2 != 0)
            rectangle.setFill(Color.WHITE);

        return rectangle;
    }
}

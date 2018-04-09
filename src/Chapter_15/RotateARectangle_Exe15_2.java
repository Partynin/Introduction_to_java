package Chapter_15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RotateARectangle_Exe15_2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(40);
        pane.setAlignment(Pos.CENTER);

        Button btRotate = new Button("Rotate");

        Rectangle rectangle = new Rectangle(80, 40);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        btRotate.setOnAction(event -> rectangle.setRotate(rectangle.getRotate() + 15));

        pane.getChildren().addAll(rectangle, btRotate);

        primaryStage.setScene(new Scene(pane, 200, 200));
        primaryStage.setTitle("RotateARectangle");
        primaryStage.show();
    }
}

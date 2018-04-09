package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a pane tho hold the circle
        Pane pane = new StackPane();

        // Create a circle and set its properties
        Circle circle = new Circle();
        circle.setRadius(59);
        circle.setStroke(Color.BLACK);
        circle.setFill(new Color(0.4706, 0.3882, 0.502, 1));
        pane.getChildren().add(circle); // Add circle to the pane

        // Create a table and set its properties
        Label label = new Label("JavaFX");
        label.setFont(Font.font("Agency FB", FontWeight.BOLD, FontPosture.ITALIC,
                20));
        pane.getChildren().add(label);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("FontDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

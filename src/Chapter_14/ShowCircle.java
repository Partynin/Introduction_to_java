package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a circle and set its properties
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(null); // You may set the color to null to specify that no color is set

        // Create a pane to hold the circle
       // Pane pane = new Pane();
       // pane.getChildren().add(circle);
        Pane pane = new Pane(circle);
//   The getChildren() method returns an instance of javafx.collections.ObservableList.
//   ObservableList behaves very much like an ArrayList for storing a collection of elements.
//   Invoking add(e) adds an element to the list

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

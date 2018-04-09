package Chapter_14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class GeometryInsideAPolygon_Exe14_28 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Create a pane
        Pane pane = new Pane();

        // Create a polygon
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        pane.getChildren().add(polygon);
        ObservableList<Double> list = polygon.getPoints();

        // Prompt the user to enter the coordinates of five points
        System.out.print("Enter five points: ");
        for (int i = 0; i < 8; i++) {
            list.add(input.nextDouble());
        }
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Create a circle
        Circle circle = new Circle(x, y, 5);
        pane.getChildren().add(circle);

        // Create a Text
        Text text = new Text("        The point is " +
                (polygon.contains(x, y) ? "" : "not ") + "inside the polygon  ");

        // Create a vbox
        VBox vbox = new VBox(5);
        vbox.getChildren().addAll(pane, text);

        // Create a Scene and place it in the stage
        Scene scene = new Scene(vbox);
        primaryStage.setTitle("Exercise_14_24"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

package Chapter_18;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class SierpinskiTriangle_Exe18_19 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws Exception {
        SierpinskiTrianglePane trianglePane = new SierpinskiTrianglePane();
        Button btPlus = new Button("+");
        Button btMinus = new Button("-");
        btMinus.setOnAction(e -> trianglePane.setOrder(trianglePane.getOrder() - 1));
        btPlus.setOnAction(e -> trianglePane.setOrder(trianglePane.getOrder() + 1));
        HBox paneForButton = new HBox(5);
        paneForButton.getChildren().addAll(btMinus, btPlus);
        paneForButton.setAlignment(Pos.CENTER);

        // Pane to hold label, text field, and a button
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Enter an order: "), paneForButton);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(trianglePane);
        borderPane.setBottom(hBox);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 210);
        primaryStage.setTitle("SierpinskiTriangle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        scene.widthProperty().addListener(ov -> trianglePane.paint());
        scene.widthProperty().addListener(ov -> trianglePane.paint());
    }

    /** Pane for display triangles */
    public class SierpinskiTrianglePane extends Pane {
        private int order = 0;

        public int getOrder() {
            if (order == 0)
                return 1;
            else
                return order;
        }

        /** Set a new order */
        public void setOrder(int order) {
            this.order = order;
            paint();
        }

        SierpinskiTrianglePane() {
        }

        protected void paint() {
            // Select three point in proportion to the pane size
            Point2D p1 = new Point2D(getWidth() / 2, 10);
            Point2D p2 = new Point2D(10, getHeight() - 10);
            Point2D p3 = new Point2D(getWidth() - 10, getHeight() - 10);

            this.getChildren().clear(); // Clear the pane before redisplay

            displayTriangle(order , p1, p2, p3);
        }

        private void displayTriangle(int order, Point2D p1, Point2D p2, Point2D p3) {
            if (order < 0)
                return;
            if (order == 0) {
                // Draw a triangle to connect three points
//                Polygon triangle = new Polygon();
//                triangle.getPoints().addAll(p1.getX(), p1.getY(), p2.getX(),
//                        p2.getY(), p3.getX(), p3.getY());
//                triangle.setStroke(Color.BLACK);
//                triangle.setFill(Color.WHITE);
                Line line1 = new Line(p1.getX(), p1.getY(), p2.getX(),p2.getY());
                Line line2 = new Line(p2.getX(), p2.getY(), p3.getX(),p3.getY());
                Line line3 = new Line(p3.getX(), p3.getY(), p1.getX(),p1.getY());

                this.getChildren().addAll(line1, line2, line3);
            }
            else {
                // Get the midpoint on each edge in the triangle
                Point2D p12 = p1.midpoint(p2);
                Point2D p23 = p2.midpoint(p3);
                Point2D p31 = p3.midpoint(p1);

                // Recursively display three triangles
                displayTriangle(order - 1, p1, p12, p31);
                displayTriangle(order - 1, p12, p2, p23);
                displayTriangle(order - 1, p31, p23, p3);
            }
        }
    }
}

package Chapter_18;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class HTreeFractal_Exe18_35 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws Exception {
        HTreePane trianglePane = new HTreePane();
        TextField tfOrder = new TextField();
        tfOrder.setOnAction(
                e -> trianglePane.setOrder(Integer.parseInt(tfOrder.getText())));
        tfOrder.setPrefColumnCount(4);
        tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

        // Pane to hold label, text field, and a button
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Enter an order: "), tfOrder);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(trianglePane);
        borderPane.setBottom(hBox);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 210);
        primaryStage.setTitle("H-tree"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        scene.widthProperty().addListener(ov -> trianglePane.paint());
        scene.widthProperty().addListener(ov -> trianglePane.paint());
    }

    /** Pane for display H-tree */
    public class HTreePane extends Pane {
        private int order = 0;

        /** Set a new order */
        public void setOrder(int order) {
            this.order = order;
            paint();
        }

        HTreePane() {
        }

        protected void paint() {
            // Select forth point in proportion to the pane size
            Point2D p1 = new Point2D(getWidth() / 3, getHeight() / 10 * 3);
            Point2D p2 = new Point2D(getWidth() / 3, getHeight() * 0.7);
            Point2D p3 = new Point2D(getWidth() / 3 * 2, getHeight() / 10 * 3);
            Point2D p4 = new Point2D(getWidth() / 3 * 2, getHeight() * 0.7);

            this.getChildren().clear(); // Clear the pane before redisplay

            displayHTree(order , p1, p2, p3, p4);
        }

        private void displayHTree(int order, Point2D p1, Point2D p2, Point2D p3, Point2D p4) {
            if (order < 0)
                return;
            else {
                Line line1 = new Line(p1.getX(), p1.getY(), p2.getX(),p2.getY());
                Line line2 = new Line(p3.getX(), p3.getY(), p4.getX(),p4.getY());
                Line line3 = new Line(p1.midpoint(p2).getX(), p1.midpoint(p2).getY(),
                        p3.midpoint(p4).getX(), p3.midpoint(p4).getY());

                this.getChildren().addAll(line1, line2, line3);

                Point2D p11 = new Point2D(p1.getX() - ((p3.getX() - p1.getX()) / 4),
                        p1.getY() - ((p2.getY() - p1.getY()) / 4));
                Point2D p21 = new Point2D(p1.getX() - ((p3.getX() - p1.getX()) / 4),
                        p1.getY() + ((p2.getY() - p1.getY()) / 4));
                Point2D p31 = new Point2D(p1.getX() + ((p3.getX() - p1.getX()) / 4),
                        p1.getY() - ((p2.getY() - p1.getY()) / 4));
                Point2D p41 = new Point2D(p1.getX() + ((p3.getX() - p1.getX()) / 4),
                        p1.getY() + ((p2.getY() - p1.getY()) / 4));

                Point2D p12 = new Point2D(p3.getX() - ((p3.getX() - p1.getX()) / 4),
                        p3.getY() - ((p2.getY() - p1.getY()) / 4));
                Point2D p22 = new Point2D(p3.getX() - ((p3.getX() - p1.getX()) / 4),
                        p3.getY() + ((p2.getY() - p1.getY()) / 4));
                Point2D p32 = new Point2D(p3.getX() + ((p3.getX() - p1.getX()) / 4),
                        p3.getY() - ((p2.getY() - p1.getY()) / 4));
                Point2D p42 = new Point2D(p3.getX() + ((p3.getX() - p1.getX()) / 4),
                        p3.getY() + ((p2.getY() - p1.getY()) / 4));

                Point2D p13 = new Point2D(p2.getX() - ((p3.getX() - p1.getX()) / 4),
                        p2.getY() - ((p2.getY() - p1.getY()) / 4));
                Point2D p23 = new Point2D(p2.getX() - ((p3.getX() - p1.getX()) / 4),
                        p2.getY() + ((p2.getY() - p1.getY()) / 4));
                Point2D p33 = new Point2D(p2.getX() + ((p3.getX() - p1.getX()) / 4),
                        p2.getY() - ((p2.getY() - p1.getY()) / 4));
                Point2D p43 = new Point2D(p2.getX() + ((p3.getX() - p1.getX()) / 4),
                        p2.getY() + ((p2.getY() - p1.getY()) / 4));

                Point2D p14 = new Point2D(p4.getX() - ((p3.getX() - p1.getX()) / 4),
                        p4.getY() - ((p2.getY() - p1.getY()) / 4));
                Point2D p24 = new Point2D(p4.getX() - ((p3.getX() - p1.getX()) / 4),
                        p4.getY() + ((p2.getY() - p1.getY()) / 4));
                Point2D p34 = new Point2D(p4.getX() + ((p3.getX() - p1.getX()) / 4),
                        p4.getY() - ((p2.getY() - p1.getY()) / 4));
                Point2D p44 = new Point2D(p4.getX() + ((p3.getX() - p1.getX()) / 4),
                        p4.getY() + ((p2.getY() - p1.getY()) / 4));

                // Recursively display forth H
                displayHTree(order - 1, p11, p21, p31, p41);
                displayHTree(order - 1, p12, p22, p32, p42);
                displayHTree(order - 1, p13, p23, p33, p43);
                displayHTree(order - 1, p14, p24, p34, p44);
            }
        }
    }
}

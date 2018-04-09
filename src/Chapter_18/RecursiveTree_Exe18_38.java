package Chapter_18;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class RecursiveTree_Exe18_38 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws Exception {
        RecursiveTreePane trianglePane = new RecursiveTreePane();
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
        Scene scene = new Scene(borderPane, 400, 400);
        primaryStage.setTitle("RecursiveTree"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        scene.widthProperty().addListener(ov -> trianglePane.paint());
        scene.widthProperty().addListener(ov -> trianglePane.paint());
    }

    /** Pane for display tree */
    public class RecursiveTreePane extends Pane {
        private int order = 0;
        private double length;
        final int ANGLE = 30;

        /** Set a new order */
        public void setOrder(int order) {
            this.order = order;
            paint();
        }

        RecursiveTreePane() {
        }

        protected void paint() {
            getChildren().clear();
            length = 50;
            displayRecursiveTree(200, 300, 90, length, order + 1);
        }

        private void displayRecursiveTree(double x, double y, double angle, double length, int order) {
            if (order <= 0)
                return;

                double x2 = x + length * Math.cos(Math.toRadians(angle));
                double y2 = y - length * Math.sin(Math.toRadians(angle));
                double x3 = x + length * Math.cos(Math.toRadians(angle));
                double y3 = y - length * Math.sin(Math.toRadians(angle));
                getChildren().add(new Line(x, y, x2, y2));
                getChildren().add(new Line(x, y, x3, y3));

                displayRecursiveTree(x2, y2, angle + ANGLE, length * 0.8, order - 1);
                displayRecursiveTree(x3, y3, angle - ANGLE, length * 0.8, order - 1);

        }
    }
}

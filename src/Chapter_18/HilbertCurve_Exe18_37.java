package Chapter_18;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class HilbertCurve_Exe18_37 extends Application {
    private final int UP = 0;
    private final int RIGHT = 1;
    private final int DOWN = 2;
    private final int LEFT = 3;
    Polyline polyline = new Polyline();
    private double x1;
    private double y1;
    double length;

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
        primaryStage.setTitle("HilbertCurve"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        scene.widthProperty().addListener(ov -> trianglePane.paint());
        scene.widthProperty().addListener(ov -> trianglePane.paint());
    }

    /**
     * Pane for display H-tree
     */
    public class HTreePane extends Pane {
        private int order = 0;

        /**
         * Set a new order
         */
        public void setOrder(int order) {
            this.order = order;
            paint();
        }

        HTreePane() {
        }

        protected void paint() {

            this.getChildren().clear(); // Clear the pane before redisplay
            displayHTree(order);
        }

        private void displayHTree(int order) {
            if (order == 0)
                return;

            polyline.getPoints().clear();
            length = 40 / order;
            x1 = Math.min(getWidth(), getHeight()) - 30;
            y1 = x1;
            polyline.getPoints().addAll(x1, y1);
            draw(order, DOWN);
            getChildren().addAll(polyline);
        }

        private void draw(int order, int direction) {
            if (order == 1) {
                switch (direction) {
                    case UP:
                        move(DOWN);
                        move(RIGHT);
                        move(UP);
                        break;
                    case RIGHT:
                        move(LEFT);
                        move(UP);
                        move(RIGHT);
                        break;
                    case DOWN:
                        move(UP);
                        move(LEFT);
                        move(DOWN);
                        break;
                    case LEFT:
                        move(RIGHT);
                        move(DOWN);
                        move(LEFT);
                        break;
                }
            } else if (order > 1) {
                switch (direction) {
                    case UP:
                        draw(order - 1, LEFT);
                        move(DOWN);
                        draw(order - 1, UP);
                        move(RIGHT);
                        draw(order - 1, UP);
                        move(UP);
                        draw(order - 1, RIGHT);
                        break;
                    case RIGHT:
                        draw(order - 1, DOWN);
                        move(LEFT);
                        draw(order - 1, RIGHT);
                        move(UP);
                        draw(order - 1, RIGHT);
                        move(RIGHT);
                        draw(order - 1, UP);
                        break;
                    case DOWN:
                        draw(order - 1, RIGHT);
                        move(UP);
                        draw(order - 1, DOWN);
                        move(LEFT);
                        draw(order - 1, DOWN);
                        move(DOWN);
                        draw(order - 1, LEFT);
                        break;
                    case LEFT:
                        draw(order - 1, UP);
                        move(RIGHT);
                        draw(order - 1, LEFT);
                        move(DOWN);
                        draw(order - 1, LEFT);
                        move(LEFT);
                        draw(order - 1, DOWN);
                        break;
                }
            }
        }

        private void move(int direction) {
            ObservableList<Double> list = polyline.getPoints();
            switch (direction) {
                case UP:
                    list.addAll(x1, y1 -= length);
                    break;
                case RIGHT:
                    list.addAll(x1 += length, y1);
                    break;
                case DOWN:
                    list.addAll(x1, y1 += length);
                    break;
                case LEFT:
                    list.addAll(x1 -= length, y1);
                    break;
            }
        }
    }
}
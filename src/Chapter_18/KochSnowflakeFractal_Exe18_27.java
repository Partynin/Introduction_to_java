package Chapter_18;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class KochSnowflakeFractal_Exe18_27 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws Exception {
       KochFractalPane kochPane = new KochFractalPane();
        TextField tfOrder = new TextField();
        tfOrder.setOnAction(
                e -> {
                    kochPane.setOrder(Integer.parseInt(tfOrder.getText()));
                    kochPane.paint();
                }
        );
        tfOrder.setPrefColumnCount(4);
        tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

        // Pane to hold label, text field, and a button
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Enter an order: "), tfOrder);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(kochPane);
        borderPane.setBottom(hBox);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 600, 600);
        primaryStage.setTitle("SierpinskiTriangle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        scene.widthProperty().addListener(ov -> kochPane.paint());
        scene.widthProperty().addListener(ov -> kochPane.paint());
    }

    /** Pane for display triangles */
    public class KochFractalPane extends BorderPane {
        private int order = 0;
        Pane pane = new Pane();
        ObservableList<Node> list = pane.getChildren();

        public KochFractalPane() {
            pane.setPrefSize(300, 300);
            setCenter(pane);
            setMargin(pane, new Insets(100));

            paint();
        }

        /** Set a new order */
        public void setOrder(int order) {
            this.order = order;
            paint();
        }

        protected void paint() {
            list.clear(); // Clear the pane before redisplay
            double length = 400;
            Line l1 = new Line(200, 0, 200 + length *
                    Math.cos(1 * (Math.PI * 2 / 6)), 0 + length *
                    Math.sin(1 * (Math.PI * 2 / 6)));
            Line l2 = new Line(l1.getEndX(), l1.getEndY(), l1.getEndX() - length, l1.getEndY());
            Line l3 = new Line(l2.getEndX(), l2.getEndY(), l1.getStartX(), l1.getStartY());
            list.addAll(l1, l2, l3);
            paint(order);
        }

        private void paint(int order) {
            if (order == 0)
                return;

            Line[] lines = new Line[list.size()];
            for (int i = 0; i < list.size(); i++) {
                lines[i] = (Line) list.get(i);
            }

            for (Line line : lines) {
                displayKochSnowflake(line);
            }
            paint(order - 1);
        }

        private void displayKochSnowflake(Line line) {
            double distance = distance(line) / 3;

            double dy = (line.getStartY() - line.getEndY());
            double dx = (line.getEndX() - line.getStartX());
            double theta = Math.atan2(dy, dx);

            double x1 = line.getStartX() + distance * Math.cos(theta);
            double y1 = line.getStartY() - distance * Math.sin(theta);

            double x2 = line.getEndX() + distance * Math.cos(theta + Math.toRadians(180));
            double y2 = line.getEndY() - distance * Math.sin(theta + Math.toRadians(180));

            double x3 = x2 + distance * Math.cos(theta + Math.toRadians(120));
            double y3 = y2 - distance * Math.sin(theta + Math.toRadians(120));

            Line l1 = new Line(line.getStartX(), line.getStartY(), x1, y1);
            Line l2 = new Line(x2, y2, line.getEndX(), line.getEndY());
            Line l3 = new Line(l1.getEndX(), l1.getEndY(), x3, y3);
            Line l4 = new Line(l3.getEndX(), l3.getEndY(), x2, y2);

            pane.getChildren().remove(line);
            list.addAll(l1, l2, l3, l4);
            }

        public double distance(double x1, double y1, double x2, double y2) {

            return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        }

        public double distance(Line line) {
            return distance(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY());
        }
    }
}

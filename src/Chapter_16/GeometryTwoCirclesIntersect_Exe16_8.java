package Chapter_16;

import Chapter_10.Circle2D;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GeometryTwoCirclesIntersect_Exe16_8 extends Application {
    private Text textIsCirclesIntersect;

    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        Pane paneForCircles = new Pane();
        paneForCircles.setPrefWidth(300);
        paneForCircles.setPrefHeight(150);
        paneForCircles.setStyle("-fx-border-color: black");
        textIsCirclesIntersect = new Text(90, 20, "Two circles intersect?");
        Circle circle1 = new Circle(80, 80, 30);
        circle1.setFill(Color.color(1, 1, 1, 0));
        circle1.setStroke(Color.BLACK);
        Circle circle2 = new Circle(180, 80, 40);
        circle2.setFill(Color.color(1, 1, 1, 0));
        circle2.setStroke(Color.BLACK);
        paneForCircles.getChildren().addAll(textIsCirclesIntersect, circle1, circle2);

        HBox paneForTables = new HBox(5);

        BorderPane paneForTableCircle1 = new BorderPane();
        Text textEnterCircle1 = new Text("Enter circle 1 info:");
        Text textCenterX1 = new Text("Center X:");
        Text textCenterY1 = new Text("Center Y:");
        Text textRadius1 = new Text("Radius:");
        TextField tfCenterX1 = new TextField();
        tfCenterX1.setPrefColumnCount(3);
        tfCenterX1.setAlignment(Pos.BOTTOM_RIGHT);
        tfCenterX1.setText("80");
        TextField tfCenterY1 = new TextField();
        tfCenterY1.setPrefColumnCount(3);
        tfCenterY1.setAlignment(Pos.BOTTOM_RIGHT);
        tfCenterY1.setText("80");
        TextField tfRadius1 = new TextField();
        tfRadius1.setPrefColumnCount(3);
        tfRadius1.setAlignment(Pos.BOTTOM_RIGHT);
        tfRadius1.setText("30");
        GridPane gridPaneCircle1 = new GridPane();
        gridPaneCircle1.setVgap(3);
        gridPaneCircle1.setHgap(3);
        gridPaneCircle1.add(textCenterX1, 0, 0);
        gridPaneCircle1.add(tfCenterX1, 1, 0);
        gridPaneCircle1.add(textCenterY1, 0, 1);
        gridPaneCircle1.add(tfCenterY1, 1, 1);
        gridPaneCircle1.add(textRadius1, 0, 2);
        gridPaneCircle1.add(tfRadius1, 1,2);
        paneForTableCircle1.setTop(textEnterCircle1);
        paneForTableCircle1.setCenter(gridPaneCircle1);
        paneForTableCircle1.setStyle("-fx-border-color: black");

        BorderPane paneForTableCircle2 = new BorderPane();
        Text textEnterCircle2 = new Text("Enter circle 2 info:");
        Text textCenterX2 = new Text("Center X:");
        Text textCenterY2 = new Text("Center Y:");
        Text textRadius2 = new Text("Radius:");
        TextField tfCenterX2 = new TextField();
        tfCenterX2.setPrefColumnCount(3);
        tfCenterX2.setAlignment(Pos.BOTTOM_RIGHT);
        tfCenterX2.setText("180");
        TextField tfCenterY2 = new TextField();
        tfCenterY2.setPrefColumnCount(3);
        tfCenterY2.setAlignment(Pos.BOTTOM_RIGHT);
        tfCenterY2.setText("80");
        TextField tfRadius2 = new TextField();
        tfRadius2.setPrefColumnCount(3);
        tfRadius2.setAlignment(Pos.BOTTOM_RIGHT);
        tfRadius2.setText("40");
        GridPane gridPaneCircle2 = new GridPane();
        gridPaneCircle2.setVgap(3);
        gridPaneCircle2.setHgap(3);
        gridPaneCircle2.add(textCenterX2, 0, 0);
        gridPaneCircle2.add(tfCenterX2, 1, 0);
        gridPaneCircle2.add(textCenterY2, 0, 1);
        gridPaneCircle2.add(tfCenterY2, 1, 1);
        gridPaneCircle2.add(textRadius2, 0, 2);
        gridPaneCircle2.add(tfRadius2, 1,2);
        paneForTableCircle2.setTop(textEnterCircle2);
        paneForTableCircle2.setCenter(gridPaneCircle2);
        paneForTableCircle2.setStyle("-fx-border-color: black");

        paneForTables.getChildren().addAll(paneForTableCircle1, paneForTableCircle2);

        HBox paneForButton = new HBox();
        Button btRedrawCircles = new Button("Redraw Circles");
        paneForButton.getChildren().add(btRedrawCircles);
        paneForButton.setAlignment(Pos.CENTER);

        pane.setTop(paneForCircles);
        pane.setCenter(paneForTables);
        paneForTables.setAlignment(Pos.CENTER);
        pane.setBottom(paneForButton);

        circle1.setOnMouseDragged(e -> {
            circle1.setCenterX(e.getX());
            circle1.setCenterY(e.getY());
            tfCenterX1.setText(e.getX() + "");
            tfCenterY1.setText(e.getY() + "");
        });

        circle2.setOnMouseDragged(e -> {
            circle2.setCenterX(e.getX());
            circle2.setCenterY(e.getY());
            tfCenterX2.setText(e.getX() + "");
            tfCenterY2.setText(e.getY() + "");
        });

        pane.setOnMouseMoved(e -> {
            paneForCircles.getChildren().remove(textIsCirclesIntersect);
            textIsCirclesIntersect = new Text(90, 20, "Two circles intersect? " +
                    ((overlaps(circle1, circle2)) ? "YES" : "NO") );
            paneForCircles.getChildren().addAll(textIsCirclesIntersect);
        });

        btRedrawCircles.setOnAction(e -> {
            circle1.setCenterX(Double.parseDouble(tfCenterX1.getText()));
            circle1.setCenterY(Double.parseDouble(tfCenterY1.getText()));
            circle1.setRadius(Double.parseDouble(tfRadius1.getText()));

            circle2.setCenterX(Double.parseDouble(tfCenterX2.getText()));
            circle2.setCenterY(Double.parseDouble(tfCenterY2.getText()));
            circle2.setRadius(Double.parseDouble(tfRadius2.getText()));
        });

        return pane;
    }

    /** This method find if the circles overlaps */
    public boolean overlaps(Circle circle1, Circle circle2) {
        double distance = Math.sqrt(Math.pow(circle2.getCenterX() - circle1.getCenterX(), 2) +
                Math.pow(circle2.getCenterY() - circle1.getCenterY(), 2));
        if (distance <= circle1.getRadius() + circle2.getRadius())
            return true;
        else return false;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 280);
        primaryStage.setTitle("TwoCirclesIntersect");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

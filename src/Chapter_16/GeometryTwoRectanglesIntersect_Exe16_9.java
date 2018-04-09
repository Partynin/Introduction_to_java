package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GeometryTwoRectanglesIntersect_Exe16_9 extends Application {
    private Text textIsRectanglesIntersect;

    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        Pane paneForRectangles = new Pane();
        paneForRectangles.setPrefWidth(300);
        paneForRectangles.setPrefHeight(150);
        paneForRectangles.setStyle("-fx-border-color: black");
        textIsRectanglesIntersect = new Text(90, 20, "Two rectangles intersect?");
        Rectangle rectangle1 = new Rectangle(80, 80, 30, 40);
        rectangle1.setFill(Color.color(1, 1, 1, 0));
        rectangle1.setStroke(Color.BLACK);
        Rectangle rectangle2 = new Rectangle(180, 80, 40, 50);
        rectangle2.setFill(Color.color(1, 1, 1, 0));
        rectangle2.setStroke(Color.BLACK);
        paneForRectangles.getChildren().addAll(textIsRectanglesIntersect, rectangle1, rectangle2);

        HBox paneForTables = new HBox(5);

        BorderPane paneForTableCircle1 = new BorderPane();
        Text textEnterRectangle1 = new Text("Enter rectangle 1 info:");
        Text textCenterX1 = new Text("X:");
        Text textCenterY1 = new Text("Y:");
        Text textWidth1 = new Text("Width:");
        Text textHeight1 = new Text("Height");
        TextField tfX1 = new TextField();
        tfX1.setPrefColumnCount(3);
        tfX1.setAlignment(Pos.BOTTOM_RIGHT);
        tfX1.setText("80");
        TextField tfY1 = new TextField();
        tfY1.setPrefColumnCount(3);
        tfY1.setAlignment(Pos.BOTTOM_RIGHT);
        tfY1.setText("80");
        TextField tfWidth1 = new TextField();
        tfWidth1.setPrefColumnCount(3);
        tfWidth1.setAlignment(Pos.BOTTOM_RIGHT);
        tfWidth1.setText("30");
        TextField tfHeight1 = new TextField();
        tfHeight1.setPrefColumnCount(3);
        tfHeight1.setAlignment(Pos.BOTTOM_RIGHT);
        tfHeight1.setText("40");
        GridPane gridPaneRectangle1 = new GridPane();
        gridPaneRectangle1.setVgap(3);
        gridPaneRectangle1.setHgap(3);
        gridPaneRectangle1.add(textCenterX1, 0, 0);
        gridPaneRectangle1.add(tfX1, 1, 0);
        gridPaneRectangle1.add(textCenterY1, 0, 1);
        gridPaneRectangle1.add(tfY1, 1, 1);
        gridPaneRectangle1.add(textWidth1, 0, 2);
        gridPaneRectangle1.add(tfWidth1, 1,2);
        gridPaneRectangle1.add(textHeight1, 0, 3);
        gridPaneRectangle1.add(tfHeight1, 1, 3);
        paneForTableCircle1.setTop(textEnterRectangle1);
        paneForTableCircle1.setCenter(gridPaneRectangle1);
        paneForTableCircle1.setStyle("-fx-border-color: black");

        BorderPane paneForTableCircle2 = new BorderPane();
        Text textEnterRectangle2 = new Text("Enter rectangle 1 info:");
        Text textCenterX2 = new Text("X:");
        Text textCenterY2 = new Text("Y:");
        Text textWidth2 = new Text("Width:");
        Text textHeight2 = new Text("Height");
        TextField tfX2 = new TextField();
        tfX2.setPrefColumnCount(3);
        tfX2.setAlignment(Pos.BOTTOM_RIGHT);
        tfX2.setText("80");
        TextField tfY2 = new TextField();
        tfY2.setPrefColumnCount(3);
        tfY2.setAlignment(Pos.BOTTOM_RIGHT);
        tfY2.setText("80");
        TextField tfWidth2 = new TextField();
        tfWidth2.setPrefColumnCount(3);
        tfWidth2.setAlignment(Pos.BOTTOM_RIGHT);
        tfWidth2.setText("30");
        TextField tfHeight2 = new TextField();
        tfHeight2.setPrefColumnCount(3);
        tfHeight2.setAlignment(Pos.BOTTOM_RIGHT);
        tfHeight2.setText("50");
        GridPane gridPaneRectangle2 = new GridPane();
        gridPaneRectangle2.setVgap(3);
        gridPaneRectangle2.setHgap(3);
        gridPaneRectangle2.add(textCenterX2, 0, 0);
        gridPaneRectangle2.add(tfX2, 1, 0);
        gridPaneRectangle2.add(textCenterY2, 0, 1);
        gridPaneRectangle2.add(tfY2, 1, 1);
        gridPaneRectangle2.add(textWidth2, 0, 2);
        gridPaneRectangle2.add(tfWidth2, 1,2);
        gridPaneRectangle2.add(textHeight2, 0, 3);
        gridPaneRectangle2.add(tfHeight2, 1, 3);
        paneForTableCircle2.setTop(textEnterRectangle2);
        paneForTableCircle2.setCenter(gridPaneRectangle2);
        paneForTableCircle2.setStyle("-fx-border-color: black");

        paneForTables.getChildren().addAll(paneForTableCircle1, paneForTableCircle2);

        HBox paneForButton = new HBox();
        Button btRedrawCircles = new Button("Redraw Rectangles");
        paneForButton.getChildren().add(btRedrawCircles);
        paneForButton.setAlignment(Pos.CENTER);

        pane.setTop(paneForRectangles);
        pane.setCenter(paneForTables);
        paneForTables.setAlignment(Pos.CENTER);
        pane.setBottom(paneForButton);

        rectangle1.setOnMouseDragged(e -> {
            rectangle1.setX(e.getX());
            rectangle1.setY(e.getY());
            tfX1.setText(e.getX() + "");
            tfY1.setText(e.getY() + "");
        });

        rectangle2.setOnMouseDragged(e -> {
            rectangle2.setX(e.getX());
            rectangle2.setY(e.getY());
            tfX2.setText(e.getX() + "");
            tfY2.setText(e.getY() + "");
        });

        pane.setOnMouseMoved(e -> {
            paneForRectangles.getChildren().remove(textIsRectanglesIntersect);
            textIsRectanglesIntersect = new Text(90, 20, "Two rectangles intersect? " +
                    ((overlaps(rectangle1, rectangle2)) ? "YES" : "NO") );
            paneForRectangles.getChildren().addAll(textIsRectanglesIntersect);
        });

        btRedrawCircles.setOnAction(e -> {
            rectangle1.setX(Double.parseDouble(tfX1.getText()));
            rectangle1.setY(Double.parseDouble(tfY1.getText()));
            rectangle1.setWidth(Double.parseDouble(tfWidth1.getText()));
            rectangle1.setHeight(Double.parseDouble(tfHeight1.getText()));

            rectangle2.setX(Double.parseDouble(tfX2.getText()));
            rectangle2.setY(Double.parseDouble(tfY2.getText()));
            rectangle2.setWidth(Double.parseDouble(tfWidth2.getText()));
            rectangle2.setHeight(Double.parseDouble(tfHeight2.getText()));
        });

        return pane;
    }

    /** returns true if the specified rectangle overlaps with this rectangle */
    public boolean overlaps(Rectangle rectangle1, Rectangle rectangle2) {
        double r1x = rectangle1.getX();
        double r1y = rectangle1.getY();
        double r1Width = rectangle1.getWidth();
        double r1Height = rectangle1.getHeight();

        double r2x = rectangle2.getX();
        double r2y = rectangle2.getY();
        double r2Width = rectangle2.getWidth();
        double r2Height = rectangle2.getHeight();

        // Determine whether the second rectangle is inside the first
        if	((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2) &&
                (Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2) &&
                (r1Height / 2 + r2Height / 2 <= r1Height) &&
                (r1Width / 2 + r2Width / 2 <= r1Width))
            return false;
        else if ((r1x + r1Width / 2 > r2x - r2Width) ||
                (r1y + r1Height / 2 > r2y - r2Height))
            return true;
        else
            return false;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 330);
        primaryStage.setTitle("TwoRectangleIntersect");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

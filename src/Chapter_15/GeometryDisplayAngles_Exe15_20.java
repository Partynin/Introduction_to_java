package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GeometryDisplayAngles_Exe15_20 extends Application {
    private double x1 = 50;
    private double y1 = 50;
    private double x2 = 100;
    private double y2 = 100;
    private double x3 = 20;
    private double y3 = 120;
    Circle circle1 = new Circle(x1, y1, 10);
    Circle circle2 = new Circle(x2, y2, 10);
    Circle circle3 = new Circle(x3, y3, 10);
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();


        Line line1 = new Line(x1, y1, x2, y2);
        Line line2 = new Line(x2, y2, x3, y3);
        Line line3 = new Line(x3, y3, x1, y1);
        line1.startXProperty().bind(circle1.centerXProperty());
        line1.startYProperty().bind(circle1.centerYProperty());
        line1.endXProperty().bind(circle2.centerXProperty());
        line1.endYProperty().bind(circle2.centerYProperty());
        line2.startXProperty().bind(circle2.centerXProperty());
        line2.startYProperty().bind(circle2.centerYProperty());
        line2.endXProperty().bind(circle3.centerXProperty());
        line2.endYProperty().bind(circle3.centerYProperty());
        line3.startXProperty().bind(circle3.centerXProperty());
        line3.startYProperty().bind(circle3.centerYProperty());
        line3.endXProperty().bind(circle1.centerXProperty());
        line3.endYProperty().bind(circle1.centerYProperty());
        Text text1 = new Text(x1, y1 - 10, getAngleA());
        Text text2 = new Text(x2, y2 - 10, getAngleB());
        Text text3 = new Text(x3, y3 - 10, getAngleC());

        pane.getChildren().addAll(circle1, circle2, circle3, line1, line2, line3,
                text1, text2, text3);

        circle1.setOnMouseDragged(e -> {
            pane.getChildren().removeAll(text1, text2, text3);
            circle1.setCenterX(e.getX());
            circle1.setCenterY(e.getY());
            text1.setX(e.getX());
            text1.setY(e.getY() - 10);
            text1.setText(getAngleA());
            text2.setText(getAngleB());
            text3.setText(getAngleC());
            pane.getChildren().addAll(text1, text2, text3);
        });

        circle2.setOnMouseDragged(e -> {
            pane.getChildren().removeAll(text1, text2, text3);
            circle2.setCenterX(e.getX());
            circle2.setCenterY(e.getY());
            text2.setX(e.getX());
            text2.setY(e.getY() - 10);
            text1.setText(getAngleA());
            text2.setText(getAngleB());
            text3.setText(getAngleC());
            pane.getChildren().addAll(text1, text2, text3);
        });

        circle3.setOnMouseDragged(e -> {
            pane.getChildren().removeAll(text1, text2, text3);
            circle3.setCenterX(e.getX());
            circle3.setCenterY(e.getY());
            text3.setX(e.getX());
            text3.setY(e.getY() - 10);
            text1.setText(getAngleA());
            text2.setText(getAngleB());
            text3.setText(getAngleC());
            pane.getChildren().addAll(text1, text2, text3);
        });

        primaryStage.setScene(new Scene(pane, 400, 300));
        primaryStage.setTitle("DisplayAngles");
        primaryStage.show();
    }

    // Compute three sides nad angles
    private String getAngleA() {
        double a = Math.sqrt((circle2.getCenterX() - circle3.getCenterX()) *
                (circle2.getCenterX() - circle3.getCenterX())
                + (circle2.getCenterY() - circle3.getCenterY()) * (circle2.getCenterY() -
                circle3.getCenterY()));
        double b = Math.sqrt((circle1.getCenterX() - circle3.getCenterX()) *
                (circle1.getCenterX() - circle3.getCenterX())
                + (circle1.getCenterY() - circle3.getCenterY()) * (circle1.getCenterY()
                - circle3.getCenterY()));
        double c = Math.sqrt((circle1.getCenterX() - circle2.getCenterX()) *
                (circle1.getCenterX() - circle2.getCenterX())
                + (circle1.getCenterY() - circle2.getCenterY()) * (circle1.getCenterY()
                - circle2.getCenterY()));
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)
                / (-2 * b * c)));
        return String.format("%.2f", A);
    }

    private String getAngleB() {
        double a = Math.sqrt((circle2.getCenterX() - circle3.getCenterX()) *
                (circle2.getCenterX() - circle3.getCenterX())
                + (circle2.getCenterY() - circle3.getCenterY()) * (circle2.getCenterY() -
                circle3.getCenterY()));
        double b = Math.sqrt((circle1.getCenterX() - circle3.getCenterX()) *
                (circle1.getCenterX() - circle3.getCenterX())
                + (circle1.getCenterY() - circle3.getCenterY()) * (circle1.getCenterY()
                - circle3.getCenterY()));
        double c = Math.sqrt((circle1.getCenterX() - circle2.getCenterX()) *
                (circle1.getCenterX() - circle2.getCenterX())
                + (circle1.getCenterY() - circle2.getCenterY()) * (circle1.getCenterY()
                - circle2.getCenterY()));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)
                / (-2 * a * c)));
        return String.format("%.2f", B);
    }

    private String getAngleC() {
        double a = Math.sqrt((circle2.getCenterX() - circle3.getCenterX()) *
                (circle2.getCenterX() - circle3.getCenterX())
                + (circle2.getCenterY() - circle3.getCenterY()) * (circle2.getCenterY() -
                circle3.getCenterY()));
        double b = Math.sqrt((circle1.getCenterX() - circle3.getCenterX()) *
                (circle1.getCenterX() - circle3.getCenterX())
                + (circle1.getCenterY() - circle3.getCenterY()) * (circle1.getCenterY()
                - circle3.getCenterY()));
        double c = Math.sqrt((circle1.getCenterX() - circle2.getCenterX()) *
                (circle1.getCenterX() - circle2.getCenterX())
                + (circle1.getCenterY() - circle2.getCenterY()) * (circle1.getCenterY()
                - circle2.getCenterY()));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a)
                / (-2 * a * b)));
        return String.format("%.2f", C);
    }
}

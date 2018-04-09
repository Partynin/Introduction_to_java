package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DragPoints_Exe15_21 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle circle = new Circle(150, 150, 80);
        circle.setFill(null);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(3);

        double randomAngle1 = Math.random() * (2 * Math.PI);
        double x1 = (80 * Math.cos(randomAngle1)) + 150;
        double y1 = (80 * Math.sin(randomAngle1)) + 150;

        double randomAngle2 = Math.random() * (2 * Math.PI);
        double x2 = (80 * Math.cos(randomAngle2)) + 150;
        double y2 = (80 * Math.sin(randomAngle2)) + 150;

        double randomAngle3 = Math.random() * (2 * Math.PI);
        double x3 = (80 * Math.cos(randomAngle3)) + 150;
        double y3 = (80 * Math.sin(randomAngle3)) + 150;

        // Compute three sides
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        // Compute three angles
        double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c)
                / (-2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c)
                / (-2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a)
                / (-2 * a * b)));

        Circle point1 = new Circle(x1, y1, 10);
        Circle point2 = new Circle(x2, y2, 10);
        Circle point3 = new Circle(x3, y3, 10);

        Line line1 = new Line(x1, y1, x2, y2);
        Line line2 = new Line(x2, y2, x3, y3);
        Line line3 = new Line(x3, y3, x1, y1);
        line1.startXProperty().bind(point1.centerXProperty());
        line1.startYProperty().bind(point1.centerYProperty());
        line1.endXProperty().bind(point2.centerXProperty());
        line1.endYProperty().bind(point2.centerYProperty());
        line2.startXProperty().bind(point2.centerXProperty());
        line2.startYProperty().bind(point2.centerYProperty());
        line2.endXProperty().bind(point3.centerXProperty());
        line2.endYProperty().bind(point3.centerYProperty());
        line3.startXProperty().bind(point3.centerXProperty());
        line3.startYProperty().bind(point3.centerYProperty());
        line3.endXProperty().bind(point1.centerXProperty());
        line3.endYProperty().bind(point1.centerYProperty());
        Text text1 = new Text(x1, y1 - 10, getAngleA(point1, point2, point3));
        Text text2 = new Text(x2, y2 - 10, getAngleB(point1, point2, point3));
        Text text3 = new Text(x3, y3 - 10, getAngleC(point1, point2, point3));

        pane.getChildren().addAll(circle, point1, point2, point3, text1, text2, text3,
                line1, line2, line3);

        point1.setOnMouseDragged(e -> {
            if(circle.contains(e.getX(), e.getY())) {
                pane.getChildren().removeAll(text1, text2, text3);
                point1.setCenterX(e.getX());
                point1.setCenterY(e.getY());
                text1.setX(e.getX());
                text1.setY(e.getY() - 10);
                text1.setText(getAngleA(point1, point2, point3));
                text2.setText(getAngleB(point1, point2, point3));
                text3.setText(getAngleC(point1, point2, point3));
                pane.getChildren().addAll(text1, text2, text3);
            }
        });

        point2.setOnMouseDragged(e -> {
            if(circle.contains(e.getX(), e.getY())) {
                pane.getChildren().removeAll(text1, text2, text3);
                point2.setCenterX(e.getX());
                point2.setCenterY(e.getY());
                text2.setX(e.getX());
                text2.setY(e.getY() - 10);
                text1.setText(getAngleA(point1, point2, point3));
                text2.setText(getAngleB(point1, point2, point3));
                text3.setText(getAngleC(point1, point2, point3));
                pane.getChildren().addAll(text1, text2, text3);
            }
        });

        point3.setOnMouseDragged(e -> {
            if(circle.contains(e.getX(), e.getY())) {
                pane.getChildren().removeAll(text1, text2, text3);
                point3.setCenterX(e.getX());
                point3.setCenterY(e.getY());
                text3.setX(e.getX());
                text3.setY(e.getY() - 10);
                text1.setText(getAngleA(point1, point2, point3));
                text2.setText(getAngleB(point1, point2, point3));
                text3.setText(getAngleC(point1, point2, point3));
                pane.getChildren().addAll(text1, text2, text3);
            }
        });

        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.setTitle("DragPoints");
        primaryStage.show();
    }

    // Compute three sides nad angles
    private String getAngleA(Circle circle1, Circle circle2, Circle circle3) {
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

    private String getAngleB(Circle circle1, Circle circle2, Circle circle3) {
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

    private String getAngleC(Circle circle1, Circle circle2, Circle circle3) {
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

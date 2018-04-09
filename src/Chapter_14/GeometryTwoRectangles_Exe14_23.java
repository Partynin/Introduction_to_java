package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class GeometryTwoRectangles_Exe14_23 extends Application {
    private static double WIDTH = 300;
    private static double HEIGHT = 300;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter center coordinates, width and height of first rect: ");
        double centerX1 = scanner.nextDouble();
        double centerY1 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();
        System.out.println("Enter center coordinates, width and height of second rect: ");
        double centerX2 = scanner.nextDouble();
        double centerY2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();

        Pane pane = new Pane();

        Rectangle rectangle1 = new Rectangle(centerX1, centerY1, width1, height1);
        rectangle1.setFill(null);
        rectangle1.setStroke(Color.BLACK);
        Rectangle rectangle2 = new Rectangle(centerX2, centerY2, width2, height2);
        rectangle2.setFill(null);
        rectangle2.setStroke(Color.BLACK);

        pane.getChildren().addAll(rectangle1, rectangle2);

        if (contains(rectangle1, rectangle2) || contains(rectangle2, rectangle1)) {
            pane.getChildren().add(new Text(20, 280, "The rectangles " +
                    "contained in another"));
        }
        else if (overlaps(rectangle1, rectangle2)) {
            pane.getChildren().add(new Text(20, 280, "The rectangles overlap"));
        }
        else pane.getChildren().add(new Text(20, 280, "The rectangles do not" +
                    "overlaps"));

        primaryStage.setScene(new Scene(pane, WIDTH, HEIGHT));
        primaryStage.setTitle("TwoRectangles");
        primaryStage.show();
    }

    /** Returns true if one rectangle is inside the other */
    public boolean contains(Rectangle r1, Rectangle r2) {
        return
                r2.getY() + r2.getHeight() <= r1.getY() + r1.getHeight() &&
                        r2.getX() + r2.getWidth() <= r1.getX() + r1.getWidth() &&
                        r2.getX() > r1.getX() && r2.getY() > r1.getY();
    }

    /** Returns true if the specified rectangles overlap */
    public boolean overlaps(Rectangle r1, Rectangle r2) {
        return getDistance(r1.getX(), r2.getX() + r2.getWidth()) <
                r1.getWidth() + r2.getWidth() &&
                getDistance(r1.getY(), r2.getY() + r2.getHeight()) <
                        r1.getHeight() + r2.getHeight();

    }

    /** Return distance */
    private double getDistance(double p1, double p2) {
        return Math.sqrt(Math.pow(p2 - p1, 2));
    }
}

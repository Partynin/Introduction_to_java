package Chapter_14;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;

public class BeanMachinePane extends Pane {
    // Been pane width and height
    private double w = 270;
    private double h = 300;

    public BeanMachinePane() {
        paintBeanMachine();
    }

    protected void paintBeanMachine() {
        Polyline polyline = new Polyline(130, 50, 130, 80, 60, 215, 60, 250,
                220, 250, 220, 215, 150, 80, 150, 50);

        for (int i = 0; i < 140; i += 20) {
            Line line = new Line(80 + i, 215, 80 + i, 250);
            getChildren().add(line);
        }

        getChildren().addAll(polyline);

        double x = 140;
        for (int i = 0; i < 140; i += 20) {
            for (int j = 0; j < i + 20; j += 20) {
                Circle circle = new Circle(x + j, 90 + i, 5);
                circle.setFill(Color.RED);
                getChildren().add(circle);
            }
            x -= 10;
        }
    }
}

package Chapter_14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlotTheSineAndCosineFunction_Exe_14_19 extends Application {
    private static double width = 400;
    private static double height = 200;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Polyline polylineSin = new Polyline();
        ObservableList<Double> list = polylineSin.getPoints();
        double scaleFactor = 50;
        for (int x = -170; x <= 170; x++) {
            list.add(x + 200.0);
            list.add(100 - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI));
        }
        polylineSin.setStroke(Color.RED);

        Polyline polylineCos = new Polyline();
        ObservableList<Double> list1 = polylineCos.getPoints();
        for (int x = -170; x <= 170; x++) {
            list1.add(x + 200.0);
            list1.add(100 - scaleFactor * Math.cos((x / 100.0) * 2 * Math.PI));
        }
        polylineCos.setStroke(Color.BLUE);

        Line lineY = new Line(200, 10, 200, 190);
        Line lineX = new Line(10, 100, 390, 100);
        Polyline polylineY = new Polyline(195, 15, 200, 10, 205, 15);
        Polyline polylineX = new Polyline(385, 95, 390, 100, 385, 105);
        pane.getChildren().add(new Text(210, 15, "y"));
        pane.getChildren().add(new Text(385, 90, "x"));
        pane.getChildren().add(new Text(205, 113, "0"));
        pane.getChildren().add(new Text(255, 113, "\u03c0"));
        pane.getChildren().add(new Text(355, 113, "2\u03c0"));
        pane.getChildren().add(new Text(155, 113, "-\u03c0"));
        pane.getChildren().add(new Text(55, 113, "-2\u03c0"));

        pane.getChildren().addAll(polylineSin, polylineCos, lineX, lineY,
                polylineX, polylineY);

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("PlotTheSineAndCosine");
        primaryStage.show();
    }
}

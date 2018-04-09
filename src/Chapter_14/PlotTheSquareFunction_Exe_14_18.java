package Chapter_14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlotTheSquareFunction_Exe_14_18 extends Application {
    private static double width = 400;
    private static double height = 300;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.0125;
        for (int x = -100; x <= 100; x++) {
            list.add(x + 200.0);
            list.add((scaleFactor * x * x) + 100);
        }
        polyline.setRotate(180);

        Line lineY = new Line(200, 50, 200, 250);
        Line lineX = new Line(50, 225, 350, 225);
        Polyline polylineY = new Polyline(195,55, 200, 50, 205, 55);
        Polyline polylineX = new Polyline(345,220, 350, 225, 345, 230);
        pane.getChildren().add(new Text(210, 55, "y"));
        pane.getChildren().add(new Text(355, 225, "x"));

        pane.getChildren().addAll(polyline, lineX, lineY, polylineY, polylineX);

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("PlotTheSquareFunction");
        primaryStage.show();
    }
}

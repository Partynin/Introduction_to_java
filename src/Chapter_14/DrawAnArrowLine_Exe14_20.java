package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class DrawAnArrowLine_Exe14_20 extends Application {
    private static double width = 300;
    private static double height = 300;
    private static double arrowDegrees = 0.8;
    private static double arrowLength = 18;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        drawArrowLine(Math.random() * width, Math.random() * height,
                Math.random() * width, Math.random() * height, pane);

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("DrawAnArrowLine");
        primaryStage.show();
    }

    /** Draws an arrow line from a starting point to an ending point in a pane */
    public static void drawArrowLine(double startX, double startY, double endX,
                                     double endY, Pane pane) {
        pane.getChildren().add(new Line(startX, startY, endX, endY));
        double angle = Math.atan2(endY - startY, endX - startX) + Math.PI;
        pane.getChildren().add(new Polyline(endX + arrowLength * Math.cos(angle - arrowDegrees),
                endY + arrowLength * Math.sin(angle - arrowDegrees), endX , endY,
                endX + arrowLength * Math.cos(angle + arrowDegrees),
                endY + arrowLength * Math.sin(angle + arrowDegrees)));
    }
}

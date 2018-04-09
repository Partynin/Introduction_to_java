package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise14_16 extends Application {
    private static double WIDTH = 300;
    private static double HEIGHT = 300;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Line line1H = new Line();
        line1H.setStroke(Color.BLUE);
        line1H.setStrokeWidth(3);
        line1H.startYProperty().bind(pane.heightProperty().divide(3));
        line1H.endXProperty().bind(pane.widthProperty());
        line1H.endYProperty().bind(pane.heightProperty().divide(3));
        Line line2H = new Line();
        line2H.setStroke(Color.BLUE);
        line2H.setStrokeWidth(3);
        line2H.startYProperty().bind(pane.heightProperty().divide(3).multiply(2));
        line2H.endXProperty().bind(pane.widthProperty());
        line2H.endYProperty().bind(pane.heightProperty().divide(3).multiply(2));

        Line line1V = new Line();
        line1V.setStroke(Color.RED);
        line1V.setStrokeWidth(3);
        line1V.startXProperty().bind(pane.widthProperty().divide(3));
        line1V.endXProperty().bind(pane.widthProperty().divide(3));
        line1V.endYProperty().bind(pane.heightProperty());
        Line line2V = new Line();
        line2V.setStroke(Color.RED);
        line2V.setStrokeWidth(3);
        line2V.startXProperty().bind(pane.widthProperty().divide(3).multiply(2));
        line2V.endXProperty().bind(pane.widthProperty().divide(3).multiply(2));
        line2V.endYProperty().bind(pane.heightProperty());

        pane.getChildren().addAll(line1H, line2H, line1V, line2V);

        primaryStage.setScene(new Scene(pane, WIDTH, WIDTH));
        primaryStage.setTitle("Exercise14_16");
        primaryStage.show();
    }
}

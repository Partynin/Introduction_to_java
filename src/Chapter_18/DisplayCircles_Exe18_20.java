package Chapter_18;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DisplayCircles_Exe18_20 extends Application {
    private Pane pane = new Pane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        getCircle(0.45);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("DisplayCircles");
        primaryStage.show();
    }

    public void getCircle(double multiple) {
        if (multiple > 0) {
            Circle circle = new Circle();
            circle.centerXProperty().bind(pane.widthProperty().divide(2));
            circle.centerYProperty().bind(pane.heightProperty().divide(2));
            circle.radiusProperty().bind(pane.heightProperty().multiply(multiple));
            circle.setStroke(Color.BLACK);
            circle.setFill(null);
            pane.getChildren().add(circle);
            getCircle(multiple - 0.05);
        }
    }
}

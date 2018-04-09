package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameEyeHandCoordination_Exe15_19 extends Application {
    private double width = 300;
    private double height = 200;
    private double centX = width / 2;
    private double centY = height / 2;
    private double radius = 10;
    private int count;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Circle circle = new Circle(centX, centY, radius);
        circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        pane.getChildren().add(circle);

        long startTime = System.currentTimeMillis();

        circle.setOnMouseClicked(e -> {
                circle.setCenterX(10 + (Math.random() * (width - 20)));
                circle.setCenterY(10 + (Math.random() * (height - 20)));
                circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                count++;
            if (count == 5) {
                long endTime = System.currentTimeMillis();
                long spendTime = endTime - startTime;
                pane.getChildren().clear();
                pane.getChildren().add(new Text(20, 20, "Time spend is " + spendTime +
                        " milliseconds"));
            }
        });



        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("GameEyeHandCoordination");
        primaryStage.show();
    }
}

package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class GameHangman_Exe14_17 extends Application {
    private static double WIDTH = 500;
    private static double HEIGHT = 400;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Arc arc = new Arc(85, 380, 70, 40, 0, 180);
        arc.setType(ArcType.OPEN);
        arc.setStroke(Color.BLACK);
        arc.setFill(null);
        Line line1 = new Line(85, 50, 85, 340);
        Line line2 = new Line(85, 50, 300, 50);
        Line line3 = new Line(300, 50, 300, 90);
        Circle circle = new Circle(300, 115, 25);
        Line line4 = new Line(300, 140, 300, 240);
        Line line5 = new Line(300, 140, 270, 180);
        Line line6 = new Line(300, 140, 330, 180);
        Line line7 = new Line(300, 240, 270, 300);
        Line line8 = new Line(300, 240, 330, 300);


        pane.getChildren().addAll(arc, line1, line2, line3, circle, line4, line5, line6,
                line7, line8);

        primaryStage.setScene(new Scene(pane, WIDTH, HEIGHT));
        primaryStage.setTitle("GameHangman");
        primaryStage.show();
    }
}

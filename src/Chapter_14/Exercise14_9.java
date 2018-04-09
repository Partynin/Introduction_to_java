package Chapter_14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise14_9 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(5);
        pane.setVgap(5);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                pane.add(getFan(), i, j);
            }
        }

        Scene scene = new Scene(pane, 215, 215);
        primaryStage.setTitle("Exercise14_9");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    /** Create a image fan like a pane */
    public static Pane getFan() {
        Pane paneFan = new Pane();
        Circle circle = new Circle(50, 50,50);
        circle.setStroke(Color.BLACK);
        circle.setFill(null);

        Arc arc1 = new Arc(50, 50, 40, 40, 30, 35);
        arc1.setFill(Color.BLUE);
        arc1.setType(ArcType.ROUND);

        Arc arc2 = new Arc(50, 50, 40, 40, 30 + 90, 35);
        arc2.setFill(Color.BLUE);
        arc2.setType(ArcType.ROUND);

        Arc arc3 = new Arc(50, 50, 40, 40, 30 + 180, 35);
        arc3.setFill(Color.BLUE);
        arc3.setType(ArcType.ROUND);

        Arc arc4 = new Arc(50, 50, 40, 40, 30 + 270, 35);
        arc4.setFill(Color.BLUE);
        arc4.setType(ArcType.ROUND);

        paneFan.getChildren().addAll(circle, arc1, arc2, arc3,arc4);

        return paneFan;
    }
}

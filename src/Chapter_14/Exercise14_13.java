package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_13 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Arc arc10 = new Arc(130, 130, 100, 100, 72, 36);
        arc10.setFill(Color.BLUE);
        arc10.setType(ArcType.ROUND);
        pane.getChildren().add(new Text(100, 20, "Quiz -- 10%"));

        Arc arc20 = new Arc(130, 130, 100, 100, 0, 72);
        arc20.setFill(Color.RED);
        arc20.setType(ArcType.ROUND);

        Arc arc30 = new Arc(130, 130, 100, 100, 108, 108);
        arc30.setFill(Color.GREEN);
        arc30.setType(ArcType.ROUND);

        Arc arc40 = new Arc(130, 130, 100, 100, 216, 144);
        arc40.setFill(Color.ORANGE);
        arc40.setType(ArcType.ROUND);

        pane.getChildren().addAll(arc10, arc20, arc30, arc40);
        pane.getChildren().add(new Text(140, 115, "Project -- 20%"));
        pane.getChildren().add(new Text(10, 130, "Midterm -- 30%"));
        pane.getChildren().add(new Text(130, 200, "Final -- 40%"));

        primaryStage.setScene(new Scene(pane, 260, 260));
        primaryStage.setTitle("Exercise14_13");
        primaryStage.show();
    }
}

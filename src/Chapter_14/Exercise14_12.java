package Chapter_14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise14_12 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 5, 10, 5));
        pane.setAlignment(Pos.BOTTOM_CENTER);
        pane.setHgap(8);
        pane.setVgap(8);
        //pane.setGridLinesVisible(true);

        Rectangle rectangle20 = new Rectangle(85, 40);
        rectangle20.setFill(Color.RED);
        pane.add(new Label("Project -- 20%"), 0, 0);
        pane.add(rectangle20, 0, 1);

        Rectangle rectangle10 = new Rectangle(85, 20);
        rectangle10.setFill(Color.BLUE);
        pane.add(new Label("Quiz -- 10%"), 1, 0);
        pane.add(rectangle10, 1, 1);

        Rectangle rectangle30 = new Rectangle(85, 60);
        rectangle30.setFill(Color.GREEN);
        pane.add(new Label("Midterm -- 30%"), 2, 0);
        pane.add(rectangle30, 2, 1);

        Rectangle rectangle40 = new Rectangle(85, 80);
        rectangle40.setFill(Color.ORANGE);
        pane.add(new Label("Final -- 40%"), 3, 0);
        pane.add(rectangle40, 3, 1);
        GridPane.setValignment(rectangle10, VPos.BOTTOM);
        GridPane.setValignment(rectangle20, VPos.BOTTOM);
        GridPane.setValignment(rectangle30, VPos.BOTTOM);


        primaryStage.setScene(new Scene(pane, 400, 150));
        primaryStage.setTitle("Exercise14_12");
        primaryStage.show();
    }
}

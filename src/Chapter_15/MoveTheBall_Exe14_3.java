package Chapter_15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MoveTheBall_Exe14_3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BallPane2 ball = new BallPane2();

        HBox hBoxButtons = new HBox(5);
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        hBoxButtons.setAlignment(Pos.CENTER);

        btLeft.setOnAction(e -> ball.moveLeft());
        btRight.setOnAction(e -> ball.moveRight());
        btUp.setOnAction(e -> ball.moveUp());
        btDown.setOnAction(e -> ball.moveDown());

        hBoxButtons.getChildren().addAll(btLeft, btRight, btUp, btDown);

        BorderPane pane = new BorderPane();
        pane.setCenter(ball);
        pane.setBottom(hBoxButtons);

        primaryStage.setScene(new Scene(pane, 200, 150));
        primaryStage.setTitle("MoveTheBall");
        primaryStage.show();


    }
}

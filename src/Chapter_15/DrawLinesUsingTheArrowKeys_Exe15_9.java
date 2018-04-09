package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/** Write a program that draws line segments
 using the arrow keys */

public class DrawLinesUsingTheArrowKeys_Exe15_9 extends Application {
    private Pane pane = new Pane();
    private double width = 300;
    private double height = 300;
    private double cX = width / 2;
    private double cY = height / 2;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Line lineStr = new Line(cX, cY, cX, cY);
        lineStr.setStroke(Color.BLACK);

        pane.getChildren().addAll(lineStr);

        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN: keyDown(); break;
                case UP: keyUp(); break;
                case LEFT: keyLeft(); break;
                case RIGHT: keyRight(); break;
            }
        });

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("DrawLinesUsingTheArrowKeys");
        primaryStage.show();

        pane.requestFocus();
    }

    public void keyDown() {
        pane.getChildren().add(new Line(cX, cY, cX, cY + 10));
        cY += 10;
    }

    public void keyUp() {
        pane.getChildren().add(new Line(cX, cY, cX, cY - 10));
        cY -= 10;
    }

    public void keyLeft() {
        pane.getChildren().add(new Line(cX, cY, cX - 10, cY));
        cX -= 10;
    }

    public void keyRight() {
        pane.getChildren().add(new Line(cX, cY, cX + 10, cY));
        cX += 10;
    }
}

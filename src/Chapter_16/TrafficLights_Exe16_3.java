package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TrafficLights_Exe16_3 extends Application {
    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        Pane paneForLights = new Pane();
        Rectangle rectangle = new Rectangle(125, 20, 50, 150);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(null);
        Circle circleRed = new Circle(150,50,20);
        circleRed.setStroke(Color.BLACK);
        circleRed.setFill(null);
        Circle circleYellow = new Circle(150, 95,20);
        circleYellow.setStroke(Color.BLACK);
        circleYellow.setFill(null);
        Circle circleGreen = new Circle(150, 140, 20);
        circleGreen.setStroke(Color.BLACK);
        circleGreen.setFill(null);
        paneForLights.getChildren().addAll(rectangle, circleRed, circleYellow, circleGreen);
        pane.setCenter(paneForLights);

        HBox paneForButton = new HBox(5);
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbGreen = new RadioButton("Green");
        paneForButton.getChildren().addAll(rbRed, rbYellow, rbGreen);
        paneForButton.setAlignment(Pos.CENTER);
        ToggleGroup group = new ToggleGroup();
        rbGreen.setToggleGroup(group);
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);

        rbGreen.setOnAction(e -> {
            circleRed.setFill(null);
            circleYellow.setFill(null);
            circleGreen.setFill(Color.GREEN);
        });

        rbRed.setOnAction(e -> {
            circleGreen.setFill(null);
            circleYellow.setFill(null);
            circleRed.setFill(Color.RED);
        });

        rbYellow.setOnAction(e -> {
            circleGreen.setFill(null);
            circleRed.setFill(null);
            circleYellow.setFill(Color.YELLOW);
        });

        pane.setBottom(paneForButton);

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 270);
        primaryStage.setTitle("TrafficLights");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

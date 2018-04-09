package Chapter_16;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlAGroupOfFans_Exe16_19 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        HBox paneForFans = new HBox(5);
        paneForFans.getChildren().addAll(getFan(), getFan(), getFan());

        HBox paneForButtons = new HBox(5);
        Button buttonStartAll = new Button("Start All");
        Button buttonStopAll = new Button("Stop All");
        paneForButtons.getChildren().addAll(buttonStartAll, buttonStopAll);

        pane.setCenter(paneForFans);
        pane.setBottom(paneForButtons);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForFans.setAlignment(Pos.CENTER);

        buttonStartAll.setOnAction(e -> {

        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 850, 320);
        primaryStage.setTitle("UseScrollBarAndSlider");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public BorderPane getFan() {
        FanPane fanPane = new FanPane(100);

        KeyFrame keyFrame = new KeyFrame(Duration.millis(10), e-> fanPane.spin());

        Timeline fanTimeline = new Timeline(keyFrame);
        fanTimeline.setCycleCount(Timeline.INDEFINITE);

        // Buttons pause, resume, reverse
        Button pause = new Button("Pause");
        pause.setOnAction(e-> fanTimeline.pause());

        Button resume = new Button("Resume");
        resume.setOnAction(e-> fanTimeline.play());

        // Slider for increase and decrease speed
        Slider slider = new Slider(0,5, 0);

        HBox paneSlider = new HBox();
        paneSlider.getChildren().add(slider);
        paneSlider.setPadding(new Insets(10, 10, 10, 10));

        slider.valueProperty().addListener(e -> {
            fanTimeline.setRate(slider.getValue());
        });

        Button reverse = new Button("Reverse");
        reverse.setOnAction(e-> fanPane.increment *= -1);
        HBox hButtons = new HBox(pause, resume, reverse);
        hButtons.setSpacing(10);
        hButtons.setAlignment(Pos.CENTER);
        paneSlider.setAlignment(Pos.CENTER);
        hButtons.setPadding(new Insets(10, 10, 10, 10));

        BorderPane borderPane = new BorderPane(
                fanPane, hButtons, null, paneSlider, null);
        borderPane.setStyle("-fx-border-color: black");

        return borderPane;
    }
}

class FanPane extends Pane {
    private Circle c;
    private Arc[] blades = new Arc[4];
    public double increment = 1;

    FanPane(double radius) {
        setMinHeight(200);
        setMinWidth(250);
        c = new Circle(125,100,radius, Color.TRANSPARENT);
        c.setStroke(Color.BLACK);

        double bladeRadius = radius * 0.9;
        for (int i = 0; i < blades.length; i++) {
            blades[i] = new Arc(
                    c.getCenterX(), c.getCenterY(), // center point
                    bladeRadius, bladeRadius, // X and Y radius
                    (i * 90) + 30, 35); // start angle and length
            blades[i].setFill(Color.RED);
            blades[i].setType(ArcType.ROUND);
        }

        getChildren().addAll(c);
        getChildren().addAll(blades); }

    public void spin() {
        for (Arc blade : blades) {
            double prevStartAngle = blade.getStartAngle();
            blade.setStartAngle(prevStartAngle + increment);
        }
    }

}

package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SliderDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text(20, 20, "JavaFx Programming");

        Slider slHorizontal = new Slider();
        slHorizontal.setShowTickLabels(true);
        slHorizontal.setShowTickMarks(true);

        Slider slVertical = new Slider();
        slVertical.setOrientation(Orientation.VERTICAL);
        slVertical.setShowTickLabels(true);
        slVertical.setShowTickMarks(true);
        slVertical.setValue(100);

        // Create a test in a pane
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);

        // Create a border pane to hold text and scroll bars
        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(slHorizontal);
        pane.setRight(slVertical);

        slHorizontal.valueProperty().addListener(ov ->
        text.setX(slHorizontal.getValue() * paneForText.getWidth() /
        slHorizontal.getMax()));

        slVertical.valueProperty().addListener(ov ->
        text.setY((slHorizontal.getMax() - slVertical.getValue())
        * paneForText.getHeight() / slVertical.getMax()));

        // Create scene and place it in the stage
        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setTitle("SliderDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScrollBarDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text(20, 20, "JavaFX Programming");

        ScrollBar sbHorizontal = new ScrollBar();
        ScrollBar sbVertical = new ScrollBar();
        sbVertical.setOrientation(Orientation.VERTICAL);

        // Create a text in a pane
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);

        // Create a border pane to hold text and scroll bars
        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(sbHorizontal);
        pane.setRight(sbVertical);

        // Listener for horizontal scroll bar value change
        sbHorizontal.valueProperty().addListener(ov ->
        text.setX(sbHorizontal.getValue() * paneForText.getWidth() /
        sbHorizontal.getMax()));

        // Listener for vertical scroll bar value change
        sbVertical.valueProperty().addListener(ov ->
        text.setY(sbVertical.getValue() * paneForText.getHeight() /
        sbVertical.getMax()));

        // Create a scene and place in the stage
        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setTitle("ScrollBarDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

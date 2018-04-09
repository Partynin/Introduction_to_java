package Chapter_15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ControlCircleWithMouseAndKey extends Application {
    private CirclePane circlePane = new CirclePane();
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Hold two buttons in an HBox
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox .getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);

        // Create and register the handler
        btEnlarge.setOnAction(e -> {
                circlePane.enlarge();
                circlePane.requestFocus();
        });
        btShrink.setOnAction(e -> {
            circlePane.shrink();
            circlePane.requestFocus();
        });
        circlePane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                circlePane.enlarge();
            }
            else if (e.getButton() == MouseButton.SECONDARY) {
                circlePane.shrink();
            }
        });

        circlePane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.U) {
                circlePane.enlarge();
            }
            else if (e.getCode() == KeyCode.D) {
                circlePane.shrink();
            }
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        borderPane.setAlignment(hBox, Pos.CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setTitle("ControlCircle");
        primaryStage.setScene(scene);
        primaryStage.show();

        circlePane.requestFocus(); // Request focus on circlePane
    }
}

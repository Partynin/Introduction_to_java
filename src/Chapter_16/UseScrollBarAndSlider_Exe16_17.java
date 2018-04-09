package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UseScrollBarAndSlider_Exe16_17 extends Application {
    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        // Pane for a text
        StackPane stackPane = new StackPane();
        Text text = new Text("Show Colors");
        text.setFont(Font.font(20));
        stackPane.getChildren().add(text);

        // Pane for sliders
        VBox paveForSliders = new VBox(5);
        Slider slRed = new Slider();
        Label lbRed = new Label("Red", slRed);
        lbRed.setContentDisplay(ContentDisplay.RIGHT);
        slRed.setMax(1);
        Slider slGreen = new Slider();
        Label lbGreen = new Label("Green", slGreen);
        lbGreen.setContentDisplay(ContentDisplay.RIGHT);
        slGreen.setMax(1);
        Slider slBlue = new Slider();
        Label lbBlue = new Label("Blue", slBlue);
        lbBlue.setContentDisplay(ContentDisplay.RIGHT);
        slBlue.setMax(1);
        Slider slOpacity = new Slider();
        Label lbOpacity = new Label("Opacity", slOpacity);
        slOpacity.setMax(1);
        lbOpacity.setContentDisplay(ContentDisplay.RIGHT);
        paveForSliders.getChildren().addAll(lbRed, lbGreen, lbBlue, lbOpacity);
        paveForSliders.setAlignment(Pos.CENTER);

        // Place the panes in the main pane
        pane.setCenter(stackPane);
        pane.setBottom(paveForSliders);

        slRed.valueProperty().addListener(e -> {
            text.setFill(Color.color(slRed.getValue(), slGreen.getValue(), slBlue.getValue(),
                    slOpacity.getValue()));
        });

        slGreen.valueProperty().addListener(e -> {
            text.setFill(Color.color(slRed.getValue(), slGreen.getValue(), slBlue.getValue(),
                    slOpacity.getValue()));
        });

        slBlue.valueProperty().addListener(e -> {
            text.setFill(Color.color(slRed.getValue(), slGreen.getValue(), slBlue.getValue(),
                    slOpacity.getValue()));
        });

        slOpacity.valueProperty().addListener(e -> {
            text.setFill(Color.color(slRed.getValue(), slGreen.getValue(), slBlue.getValue(),
                    slOpacity.getValue()));
        });

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 200);
        primaryStage.setTitle("UseScrollBarAndSlider");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

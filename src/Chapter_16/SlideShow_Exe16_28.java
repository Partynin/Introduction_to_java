package Chapter_16;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.util.Scanner;

public class SlideShow_Exe16_28 extends Application {
    private double width = 800;
    private double height = 600;
    private int numImage;
    private Pane pane = new Pane();
    private TextArea textArea = new TextArea();
    @Override
    public void start(Stage primaryStage) throws Exception {
        pane.getChildren().addAll(textArea);

        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(1000), e -> showImage()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        pane.setOnMouseClicked(e -> {
            if (animation.getStatus() == Animation.Status.RUNNING)
                animation.pause();
            else animation.play();
        });

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("SliceShow");
        primaryStage.show();
    }

    private void showImage() {
        String slideText = "";
        try {
            File file = new File("text/slide" + numImage + ".txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                slideText += input.nextLine() + "\n";
            }
        } catch (Exception e) {
            System.out.println("File doesn't found");
        }
        textArea.clear();
        textArea.setText(slideText);
        numImage++;
        if (numImage == 10)
            numImage = 0;
    }
}

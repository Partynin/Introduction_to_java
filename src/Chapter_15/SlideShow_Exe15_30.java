package Chapter_15;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SlideShow_Exe15_30 extends Application {
    private double width = 800;
    private double height = 600;
    private int numImage;
    private Pane pane = new Pane();
    @Override
    public void start(Stage primaryStage) throws Exception {
        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(2000), e -> showImage()));
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
        Image image = new Image("file:/C:/Users/Константин/IdeaProjects/" +
                "Introduction_to_java/src/Chapter_14/image/slide" + numImage + ".jpg");
        ImageView imageView = new ImageView(image);
        pane.getChildren().add(imageView);
        numImage++;
        if (numImage == 25)
            numImage = 0;
    }
}

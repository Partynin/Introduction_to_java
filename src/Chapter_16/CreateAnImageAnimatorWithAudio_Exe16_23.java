package Chapter_16;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CreateAnImageAnimatorWithAudio_Exe16_23 extends Application {
    private final static String URLBase =
            "file:/C:/Users/Константин/IdeaProjects/Introduction_to_java/book/image/";
    private int currentIndex = 0;
    private Animation animation;
    private TextField tfAnimationSpeed;
    private EventHandler<ActionEvent> eventHandler;
    private  TextField tfNumberOfImages;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a pane to hold nodes
         BorderPane pane = new BorderPane();

        StackPane paneForImage = new StackPane();

        HBox paneForButtonStart = new HBox();
        Button btStartAnimation = new Button("Start Animation");
        paneForButtonStart.getChildren().add(btStartAnimation);
        paneForButtonStart.setAlignment(Pos.BOTTOM_RIGHT);

        GridPane paneForMainContent = new GridPane();
        paneForMainContent.setAlignment(Pos.CENTER);
        paneForMainContent.setPadding(new Insets(5, 5, 5, 5));
        paneForMainContent.setHgap(5);
        paneForMainContent.setVgap(5);
        paneForMainContent.add(new Label("Enter information for animation"), 0, 0);
        paneForMainContent.add(new Label("Animation speed in milliseconds"), 0, 1);
        tfAnimationSpeed = new TextField("200");
        tfAnimationSpeed.setPrefColumnCount(30);
        paneForMainContent.add(tfAnimationSpeed, 1,1);
        paneForMainContent.add(new Label("Image file prefix"), 0, 2);
        TextField tfImageFilePrefix = new TextField("L");
        tfImageFilePrefix.setPrefColumnCount(30);
        paneForMainContent.add(tfImageFilePrefix, 1, 2);
        paneForMainContent.add(new Label("Number of images"), 0, 3);
        tfNumberOfImages = new TextField("40");
        tfNumberOfImages.setPrefColumnCount(43);
        paneForMainContent.add(tfNumberOfImages, 1, 3);
        paneForMainContent.add(new Label("Audio file URL"), 0, 4);
        TextField tfAudioFileURL = new TextField
                ("file:/C:/Users/Константин/IdeaProjects/Introduction_to_java/book/audio/anthem0.mp3");
        paneForMainContent.add(tfAudioFileURL, 1, 4);

        MediaPlayer mp = new MediaPlayer(new Media(tfAudioFileURL.getText()));

        eventHandler = e -> {
            paneForImage.getChildren().clear();
            paneForImage.getChildren().add(new ImageView(new Image(URLBase +
            tfImageFilePrefix.getText() + currentIndex + ".gif")));
            currentIndex += 1;
            if (currentIndex == Integer.parseInt(tfNumberOfImages.getText()))
                currentIndex = 0;
        };

        btStartAnimation.setOnAction(e -> {
            mp.play();
            changeSpeed();
            animation.play();
        });

        pane.setTop(paneForButtonStart);
        pane.setCenter(paneForImage);
        pane.setBottom(paneForMainContent);

        // Create a scene and place it in the stage
         Scene scene = new Scene(pane, 650, 650);
         primaryStage.setTitle("CreateAnImageAnimatorWithAudio"); // Set the stage title
         primaryStage.setScene(scene); // Place the scene in the stage
         primaryStage.show(); // Display the stage
    }

    public void changeSpeed() {
        animation = new Timeline(
                new KeyFrame(Duration.millis(Integer.parseInt(tfAnimationSpeed.getText())),
                        eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
    }
}

package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class PlayLoopAndStopASoundClip_Exe16_22 extends Application {
    private final static String URLBase =
            "file:/C:/Users/Константин/IdeaProjects/Introduction_to_java/book";

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        HBox paneForButton = new HBox(5);
        Button btPlay = new Button("Play");
        Button btLoop = new Button("Loop");
        Button btStop = new Button("Stop");
        paneForButton.getChildren().addAll(btPlay, btLoop, btStop);
        paneForButton.setAlignment(Pos.CENTER);

        pane.setCenter(paneForButton);

        /** JavaFX also provides the AudioClip class for creating auto clips. An AudioClip
         object can be created using new AudioClip(URL). An audio clip stores the audio in
         memory. AudioClip is more efficient for playing a small audio clip in the program than
         using MediaPlayer. AudioClip has the similar methods as in the MediaPlayer class. */
        AudioClip audio = new AudioClip(URLBase + "/audio/PingPongBall01.mp3");

        btPlay.setOnAction(e -> audio.play());

        btLoop.setOnAction(e -> {
            audio.setCycleCount(AudioClip.INDEFINITE);
            audio.setRate(0.5);
        });

        btStop.setOnAction(e -> audio.stop());

        Scene scene = new Scene(pane, 150, 50);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PlayLoopAndStopASoundClip");
        primaryStage.show();
    }
}

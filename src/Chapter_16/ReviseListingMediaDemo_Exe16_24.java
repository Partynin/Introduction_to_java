package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ReviseListingMediaDemo_Exe16_24 extends Application {
    private static final String MEDIA_URL =
            "http://cs.armstrong.edu/liang/common/sample.mp4";
    private Slider slTime = new Slider();
    private String totalTime = "";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Media media = new Media(MEDIA_URL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        Button playButton = new Button(">");
        playButton.setOnAction(e -> {
            if (playButton.getText().equals(">")) {
                mediaPlayer.play();
                totalTime = getTimeFormat(mediaPlayer.getStopTime().toMillis());
                slTime.setMax(mediaPlayer.getStopTime().toMillis());
                playButton.setText("||");
            } else {
                mediaPlayer.pause();
                playButton.setText(">");
            }
        });

        Button rewindButton = new Button("<<");
        rewindButton.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));


        slTime.setPrefWidth(150);

        Label lbVideoTime = new Label(getTimeFormat(0), slTime);

        Slider slVolume = new Slider();
        slVolume.setPrefWidth(150);
        slVolume.setMaxWidth(Region.USE_PREF_SIZE);
        slVolume.setMinWidth(30);
        slVolume.setValue(50);
        mediaPlayer.volumeProperty().bind(
                slVolume.valueProperty().divide(100));

        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(playButton, new Label("Time"), lbVideoTime,
                new Label("Volume"), slVolume);

        mediaPlayer.currentTimeProperty().addListener(e -> {
            if (!slTime.isValueChanging()) {
                slTime.setValue(mediaPlayer.getCurrentTime().toMillis());
            }
            lbVideoTime.setText(
                    getTimeFormat(mediaPlayer.getCurrentTime().toMillis())
                            + "/" + totalTime);
        });

        slTime.valueProperty().addListener(ov -> {
            if (slTime.isValueChanging()) {
                mediaPlayer.seek(new Duration(slTime.getValue()));
            }
        });

        BorderPane pane = new BorderPane();
        pane.setCenter(mediaView);
        pane.setBottom(hBox);
        pane.autosize();

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 650, 500);
        primaryStage.setTitle("MediaDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String getTimeFormat(double milliseconds) {
        milliseconds /= 1000;
        String seconds =  formatTwoDigits(milliseconds % 60);
        milliseconds /= 60;
        String minutes = formatTwoDigits(milliseconds % 60);
        milliseconds /= 60;
        String hours =  formatTwoDigits(milliseconds % 24);
        return hours + ":" + minutes + ":" + seconds;
    }

    private String formatTwoDigits(double time) {
        int intTime = (int) time;
        return (intTime > 9) ? intTime + "" : "0" + intTime;
    }
}

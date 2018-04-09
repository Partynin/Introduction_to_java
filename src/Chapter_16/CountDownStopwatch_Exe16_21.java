package Chapter_16;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CountDownStopwatch_Exe16_21 extends Application {
    private final static String URLBase =
            "file:/C:/Users/Константин/IdeaProjects/Introduction_to_java/book";

    public Timeline getAnimation() {
        return animation;
    }

    private Timeline animation;

    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        ClockCountDown clock = new ClockCountDown();

        StackPane paneForTextField = new StackPane();
        TextField tfEnterSeconds = new TextField();
        tfEnterSeconds.setPrefColumnCount(5);
        paneForTextField.getChildren().add(tfEnterSeconds);

        pane.setCenter(paneForTextField);

        MediaPlayer mp = new MediaPlayer(new Media(URLBase + "/audio/anthem1.mp3"));
        MediaView mediaView = new MediaView(mp);
        mp.setAutoPlay(true);
        pane.setBottom(mediaView);

        EventHandler<ActionEvent> eventEventHandler = e -> {
            clock.changeSecond();
            if (clock.getSecond() == 0) {
                animation.pause();
                mp.play();
            }
        };

        animation = new Timeline(
                new KeyFrame(Duration.millis(1000), eventEventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);

        tfEnterSeconds.setOnAction(e -> {
            clock.setSecond(Integer.parseInt(tfEnterSeconds.getText()));
            pane.getChildren().clear();
            pane.setCenter(clock);
            animation.play();
        });



        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 200, 100);
        primaryStage.setTitle("CountDownStopwatch");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class ClockCountDown extends Pane {
    private int second;

    // Clock pane's width and height
    private double w = 100, h = 100;

    /** Construct default clock with the current time = 0*/
    public  ClockCountDown() {
        setCurrentTime();
    }

    /** Construct a clock with specified hour, minute, and second */
    public ClockCountDown(int second) {
        this.second = second;
        paintClock();
    }

    /** Return second */
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;

        paintClock();
    }

    /** Set a new second + 1 */
    public void changeSecond() {
        second -= 1;

        paintClock();
    }

    /** Return clock pane's width */
    public double getW() {
        return w;
    }

    /** Set clock pane's width */
    public void setW(double w) {
        this.w = w;
        paintClock();
    }

    /** Return clock pane's height */
    public double getH() {
        return h;
    }

    /** Set clock pane's height */
    public void setH(double h) {
        this.h = h;
        paintClock();
    }

    /* Set the current time for the clock 0*/
    public void setCurrentTime() {

        second = 0;

        paintClock(); // Repaint the clock
    }

    /** Paint the clock */
    protected void paintClock() {
        getChildren().clear();

        String seconds = getTimeFormat(getSecond());

        Text textTime = new Text(42, 50, seconds);
        textTime.setFont(Font.font(30));

        getChildren().add(textTime);
    }

    private String getTimeFormat(int time) {
        return (time > 9) ? time + "" : "0" + time;
    }

}

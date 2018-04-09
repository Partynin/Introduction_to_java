package Chapter_16;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class CountUpStopwatch_Exe16_20 extends Application {
    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        Clock clock = new Clock();

        HBox paneForButton = new HBox(5);
        Button btStart = new Button("Start");
        Button btClear = new Button("Clear");
        Button btPause = new Button("Pause");
        Button btResume = new Button("Resume");
        paneForButton.getChildren().addAll(btStart, btClear);
        paneForButton.setAlignment(Pos.CENTER);

        pane.setCenter(clock);
        pane.setBottom(paneForButton);

        EventHandler<ActionEvent> eventEventHandler = e -> {
            clock.setSecond();
        };

        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(1000), eventEventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);

        btStart.setOnAction(e -> {
            animation.play();
            paneForButton.getChildren().clear();
            paneForButton.getChildren().addAll(btPause, btClear);
        });

        btPause.setOnAction(e -> {
            animation.pause();
            paneForButton.getChildren().clear();
            paneForButton.getChildren().addAll(btResume, btClear);
        });

        btResume.setOnAction(e -> {
            animation.play();
            paneForButton.getChildren().clear();
            paneForButton.getChildren().addAll(btPause, btClear);
        });

        btClear.setOnAction(e -> {
            animation.pause();
            clock.setCurrentTime();
            paneForButton.getChildren().clear();
            paneForButton.getChildren().addAll(btStart, btClear);
        });

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 200, 100);
        primaryStage.setTitle("CountUpStopwatch");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class Clock extends Pane {
    private int hour;
    private int minute;
    private int second;

    // Clock pane's width and height
    private double w = 100, h = 100;

    /** Construct default clock with the current time = 0*/
    public  Clock() {
        setCurrentTime();
    }

    /** Construct a clock with specified hour, minute, and second */
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        paintClock();
    }

    /** Return hour */
    public int getHour() {
        return hour;
    }

    /** Set a new hour + 1 */
    public void setHour() {
        hour += 1;
        paintClock();
    }

    /** Return minute */
    public int getMinute() {
        return minute;
    }

    /** Set a new minute + 1 */
    public void setMinute() {
        minute += 1;
        if (minute > 60) {
            setHour();
            minute = 0;
        }
        paintClock();
    }

    /** Return second */
    public int getSecond() {
        return second;
    }

    /** Set a new second + 1 */
    public void setSecond() {
        second += 1;
        if (second > 60) {
            setMinute();
            second = 0;
        }
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
        // Construct a calendar for the current date and time
        Calendar calendar = new GregorianCalendar(
                0, 0, 0, 0, 0, 0);

        // Set current hour, minute and second
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        paintClock(); // Repaint the clock
    }

    /** Paint the clock */
    protected void paintClock() {
        getChildren().clear();

        String hours = getTimeFormat(getHour());
        String minutes = getTimeFormat(getMinute());
        String seconds = getTimeFormat(getSecond());

        String time = hours + ":" + minutes + ":" + seconds;
        Text textTime = new Text(42, 50, time);
        textTime.setFont(Font.font(30));

        getChildren().add(textTime);
    }

    private String getTimeFormat(int time) {
        return (time > 9) ? time + "" : "0" + time;
    }

}
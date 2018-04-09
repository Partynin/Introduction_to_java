package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayACalendar_Exe16_29 extends Application {
    private VBox pane = new VBox(5);
    private HBox paneForTitleMonthAndYear = new HBox(5);
    private GridPane paneForDate = new GridPane();
    private HBox paneForButtons = new HBox(5);
    private Button btPrior = new Button("Prior");
    private Button btNext = new Button("Next");
    private Calendar calendar1 = new GregorianCalendar();
    private Calendar calendar = new GregorianCalendar(calendar1.get(Calendar.YEAR),
            calendar1.get(Calendar.MONTH), 1);

    @Override
    public void start(Stage primaryStage) throws Exception {
        paneForTitleMonthAndYear.setAlignment(Pos.CENTER);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForDate.setVgap(10);
        paneForDate.setHgap(10);
        paneForDate.setAlignment(Pos.CENTER);

        paneForButtons.getChildren().addAll(btPrior, btNext);

        showCalendar();

        pane.getChildren().addAll(paneForTitleMonthAndYear, paneForDate, paneForButtons);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 500, 250);
        primaryStage.setTitle("Calendar"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        btPrior.setOnAction(e -> {
            calendar.set(calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH) - 1, 1);
           paneForTitleMonthAndYear.getChildren().clear();
           paneForDate.getChildren().clear();
            showCalendar();
        });

        btNext.setOnAction(e -> {
            calendar.set(calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH) + 1, 1);
            paneForTitleMonthAndYear.getChildren().clear();
            paneForDate.getChildren().clear();
            showCalendar();
        });
    }

    /** Show dates of a month */
    public void showCalendar() {
        Calendar priorCalendar = new GregorianCalendar(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH) - 1, 1);
        printMonthTitle(calendar);
        printWeekday();
        printMonthBody(calendar, priorCalendar);
    }

    /** Print month title, e.g., March 2012 */
    public void printMonthTitle(Calendar calendar) {
        paneForTitleMonthAndYear.getChildren().add(
                new Text((getMonthName(calendar.get(Calendar.MONTH))) + ","));
        paneForTitleMonthAndYear.getChildren().add(
                new Text(Integer.toString(calendar.get(Calendar.YEAR))));
    }

    /** Print name of weekday */
    public void printWeekday() {
        paneForDate.add(new Text("Sunday"), 0, 0);
        paneForDate.add(new Text("Monday"), 1, 0);
        paneForDate.add(new Text("Tuesday"), 2, 0);
        paneForDate.add(new Text("Wednesday"), 3, 0);
        paneForDate.add(new Text("Thursday"), 4, 0);
        paneForDate.add(new Text("Friday"), 5, 0);
        paneForDate.add(new Text("Saturday"), 6, 0);
    }

    /** Print month body */
    public void printMonthBody(Calendar calendar, Calendar priorCalendar) {
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        int row = 1;
        int dayOfWeek = startDay;
        for (int j = 1; j <= numberOfDaysInMonth; j++) {
            paneForDate.add(new Label(j + ""), dayOfWeek, row);
            dayOfWeek++;

            if ((j + startDay) % 7 == 0) {
                row++;
                dayOfWeek = 0;
            }
        }

        int dayMonth = 1;
        for (int k = startDay + numberOfDaysInMonth; k < 35; k++) {
            Label day = new Label(dayMonth + "");
            day.setStyle("-fx-text-fill: darkgray");
            paneForDate.add(day, dayOfWeek, row);
            dayOfWeek++;
            dayMonth++;
        }

        int lastDayPriorMonth = priorCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int f = 1; f <= startDay; f++) {
            Label day = new Label(lastDayPriorMonth + "");
            day.setStyle("-fx-text-fill: darkgray");
            paneForDate.add(day, startDay - f, 1);
            lastDayPriorMonth--;
        }
    }

    /** Get the English name for the month */
    public String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 0: monthName = "January";break;
            case 1: monthName = "February";break;
            case 2: monthName = "March";break;
            case 3: monthName = "April";break;
            case 4: monthName = "May";break;
            case 5: monthName = "June";break;
            case 6: monthName = "July";break;
            case 7: monthName = "August";break;
            case 8: monthName = "September";break;
            case 9: monthName = "October";break;
            case 10: monthName = "November";break;
            case 11: monthName = "December";
        }
        return monthName;
    }
}

package Chapter_16;

import Chapter_14.ClockPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SetClockTime_Exe16_7 extends Application {
    public BorderPane getPane() {
        BorderPane pane = new BorderPane();
        HBox paneClock = new HBox();
        ClockPane clockPane = new ClockPane();
        paneClock.getChildren().add(clockPane);
        paneClock.setAlignment(Pos.CENTER);

        HBox paneForTextFields = new HBox(3);
        Text textHour = new Text("Hour");
        TextField tfHour = new TextField();
        tfHour.setPrefColumnCount(4);
        Text textMinute = new Text("Minute");
        TextField tfMinute = new TextField();
        tfMinute.setPrefColumnCount(4);
        Text textSecond = new Text("Second");
        TextField tfSecond = new TextField();
        tfSecond.setPrefColumnCount(4);
        paneForTextFields.getChildren().addAll(textHour, tfHour, textMinute, tfMinute,
                textSecond, tfSecond);
        paneForTextFields.setAlignment(Pos.CENTER);
        paneForTextFields.setPadding(new Insets(5, 5, 5, 5));

        pane.setCenter(paneClock);
        pane.setBottom(paneForTextFields);

        tfHour.setOnAction(e -> clockPane.setHour(Integer.parseInt(tfHour.getText())));

        tfMinute.setOnAction(e -> clockPane.setMinute(Integer.parseInt(tfMinute.getText())));

        tfSecond.setOnAction(e -> clockPane.setSecond(Integer.parseInt(tfSecond.getText())));

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 300);
        primaryStage.setTitle("SetClockTime");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class RandomTime_Exe14_28 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();

        RandomTimeClockPane clockPane = new RandomTimeClockPane();
        clockPane.setSecondHandVisible(false);
        clockPane.setHour((int) (Math.random() * 12));
        clockPane.setMinute((int) (Math.random() * 31));

        pane.getChildren().addAll(clockPane);

        primaryStage.setScene(new Scene(pane, 250, 250));
        primaryStage.setTitle("RandomTime");
        primaryStage.show();
    }
}

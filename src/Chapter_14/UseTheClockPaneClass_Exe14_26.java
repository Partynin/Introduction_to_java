package Chapter_14;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class UseTheClockPaneClass_Exe14_26 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setOrientation(Orientation.HORIZONTAL);
        ClockPane clockPane1 = new ClockPane(4, 20, 45);
        ClockPane clockPane2 = new ClockPane(22, 46, 15);

        pane.getChildren().addAll(clockPane1, clockPane2);

        primaryStage.setScene(new Scene(pane, 500, 250));
        primaryStage.setTitle("UseTheClockPane");
        primaryStage.show();
    }
}

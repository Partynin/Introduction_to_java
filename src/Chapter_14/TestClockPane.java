package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TestClockPane extends Application {
    private static double width = 250;
    private static double height = 250;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        pane.getChildren().addAll(new DetailedClockPane_Exe14_27());

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("TestClock");
        primaryStage.show();
    }
}

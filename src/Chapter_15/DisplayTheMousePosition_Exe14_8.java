package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayTheMousePosition_Exe14_8 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Text text = new Text();
        pane.setOnMouseClicked(event -> {
            text.setText("(" + event.getX() + ", " + event.getY() + ")");
            text.setX(event.getX());
            text.setY(event.getY());
        });

        pane.getChildren().add(text);

        primaryStage.setScene(new Scene(pane, 200, 200));
        primaryStage.setTitle("DisplayTheMousePosition");
        primaryStage.show();
    }
}

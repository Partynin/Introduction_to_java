package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayTheMousePosition_Exe15_8_2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Text textPressed = new Text();
        Text textReleased = new Text();
        pane.setOnMousePressed(event -> {
            textPressed.setText("(" + event.getX() + ", " + event.getY() + ")");
            textPressed.setX(event.getX());
            textPressed.setY(event.getY());
        });
        pane.setOnMouseReleased(event -> {
            textReleased.setText("(" + event.getX() + ", " + event.getY() + ")");
            textReleased.setX(event.getX());
            textReleased.setY(event.getY());
        });

        pane.getChildren().addAll(textPressed, textReleased);

        primaryStage.setScene(new Scene(pane, 200, 200));
        primaryStage.setTitle("DisplayTheMousePosition");
        primaryStage.show();
    }
}

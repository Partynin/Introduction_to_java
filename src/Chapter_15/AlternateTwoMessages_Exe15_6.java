package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AlternateTwoMessages_Exe15_6 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();

        Text text = new Text("Java is fun");
        pane.getChildren().add(text);
        text.setOnMouseClicked(e -> {
            if (text.getText().equals("Java is fun"))
            text.setText("Java is powerful");
            else text.setText("Java is fun");
        });

        primaryStage.setScene(new Scene(pane, 200, 100));
        primaryStage.setTitle("AlternateTwoMessages_Exe15_6");
        primaryStage.show();
    }
}

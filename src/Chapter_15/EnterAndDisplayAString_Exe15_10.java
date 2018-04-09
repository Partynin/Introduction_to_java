package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EnterAndDisplayAString_Exe15_10 extends Application {
    private double width = 300;
    private double height = 300;
    private double cX = 20;
    private double cY = 20;
    private String string;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        pane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                pane.getChildren().add(new Text(cX, cY, string));
                string = "";
                cY += 20;
            } else string += e.getText();
        });

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("EnterAndDisplayAString");
        primaryStage.show();

        pane.requestFocus();
    }
}

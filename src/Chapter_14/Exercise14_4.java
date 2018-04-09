package Chapter_14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_4 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(25, 5, 5, 5));
        pane.getChildren().addAll(getText(), getText(), getText(), getText(), getText());

        Scene scene = new Scene(pane, 250, 100);
        primaryStage.setTitle("Exercise14_4");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /** Return text Java */
    public static Text getText() {
        Text text = new Text("Java");
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, 22));
        text.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
        text.setRotate(90);
        return text;
    }
}

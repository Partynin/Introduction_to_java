package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_5 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle circle = new Circle(130, 130, 80);
        circle.setFill(null);
        //circle.setStroke(Color.RED);
        pane.getChildren().add(circle);

        String s = "Welcome  to  Java";
        double rotate = 90;
        int step = 0;
        for (int i = 0; i < s.length(); i++) {
            double sLength = circle.getRadius();
            double secondX = 130 + sLength *
                     Math.sin((15 + step) * (2 * Math.PI / 60));
             double secondY = 130 - sLength *
                     Math.cos((15 + step) * (2 * Math.PI / 60));
            pane.getChildren().add(getLetter(s.charAt(i), secondX, secondY, rotate));
            step += 3;
            rotate += 17;
        }


        Scene scene = new Scene(pane, 260,260);
        primaryStage.setTitle("Exercise14_5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /** Return a letter like the Text JavaFX */
    public static Text getLetter(char ch, double x, double y, double rotate) {
        Text letter = new Text(x, y,"" + ch);
        letter.setRotate(rotate);
        letter.setFont(Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, 25));

        return letter;
    }
}

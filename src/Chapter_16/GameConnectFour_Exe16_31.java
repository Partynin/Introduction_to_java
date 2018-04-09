package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GameConnectFour_Exe16_31 extends Application {
    private int[][] m = new int[6][7];
    private StackPane[][] stackPanes = new StackPane[6][7];
    private GridPane gridPane = new GridPane();
    private BorderPane pane = new BorderPane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                Circle circle = new Circle(15);
                circle.setFill(Color.WHITE);
                circle.setStroke(Color.BLACK);
                stackPanes[i][j] = new StackPane(circle);
                gridPane.add(stackPanes[i][j], j, i);
                m[i][j] = (j * 9) + i + 100;
            }
        }
        gridPane.setPadding(new Insets(5, 5, 5, 5));
        gridPane.setStyle("-fx-background-color: lightskyblue");
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        pane.setCenter(gridPane);

        primaryStage.setScene(new Scene(pane, 260, 230));
        primaryStage.setTitle("GameConnectFour");
        primaryStage.show();
    }
}


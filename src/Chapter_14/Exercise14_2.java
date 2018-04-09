package Chapter_14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        int[][] bord = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bord[i][j] = (int)(Math.random() * 3);
                System.out.print(bord[i][j]);
            }
            System.out.println();
        }

        Scene scene = new Scene(createPane(bord), 300, 300);
        primaryStage.setTitle("Exercise14_2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /** Create a tic-tac-toe bord pane from the matrix */
    public static GridPane createPane(int[][] bord) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(5);
        pane.setHgap(5);

        Image imageO = new Image("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/o.gif");
        Image imageX = new Image("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/x.gif");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (bord[i][j] == 0)
                    pane.add(new ImageView(imageO), i, j);
                if (bord[i][j] == 1)
                    pane.add(new ImageView(imageX), i, j);
            }
        }

        return pane;
    }
}

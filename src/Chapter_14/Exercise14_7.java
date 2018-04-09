package Chapter_14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_7 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(3, 3, 3, 3));
        pane.setHgap(3);
        pane.setVgap(3);

        int[][] matrix = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
                System.out.print(matrix[i][j]);
                pane.add(getTextField(matrix[i][j]), i, j);
            }
            System.out.println();
        }

        Scene scene = new Scene(pane, 290, 284);
        primaryStage.setTitle("Exercise14_7");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    /** Return a TextField with the specified number */
    public static TextField getTextField(int x) {
        TextField textField = new TextField("" + x);
        textField.setPrefColumnCount(1);

        return textField;
    }
}

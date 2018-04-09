package Chapter_16;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PatternRecognition_Exe16_30 extends Application {
    private VBox pane = new VBox();
    private StackPane paneForLabel = new StackPane();
    private Label labelFoundORNot = new Label("Click \"Solve\" to find solution");
    private Button btSolve = new Button("Solve");
    private GridPane paneForTf = new GridPane();
    private StackPane paneForBt = new StackPane();
    private int[][] values = new int[6][7];
    private int number;

    @Override
    public void start(Stage primaryStage) throws Exception {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                paneForTf.add(getTextField(), i, j);
                values[j][i] = number;
            }
        }

        paneForLabel.getChildren().add(labelFoundORNot);
        pane.getChildren().addAll(paneForLabel, paneForTf, paneForBt);
        paneForBt.getChildren().add(btSolve);
        paneForTf.setAlignment(Pos.CENTER);
        paneForLabel.setAlignment(Pos.CENTER);

        btSolve.setOnAction(e -> {
            paneForLabel.getChildren().clear();

            int k = 0;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(values[i][j]);
                    k++;
                }
                System.out.println();
            }


            labelFoundORNot.setText((isConsecutive(values)) + "");
            paneForLabel.getChildren().add(labelFoundORNot);
        });

        Scene scene = new Scene(pane, 200, 220);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ConsecutiveFourEqualNumbers");
        primaryStage.show();
    }

    /** Get textField with random number */
    public TextField getTextField() {
        TextField tf = new TextField();
        tf.setPrefColumnCount(1);
        number = (int)(Math.random() * 10);
        tf.setText(number + "");

        return tf;
    }

    /** Tests whether a two-dimensional array has four consecutive numbers */
    public static boolean isConsecutive(int[][] values) {
        boolean flag = false;

        // Check rows
        for (int i = 0; i < values.length; i++) {
            int count = 0;
            int first = values[i][0];
            for (int j = 0; j < values[i].length; j++) {
                if (first == values[i][j]) {
                    count++;
                }
                else {
                    first = values[i][j];
                    count = 1;
                }
                if (count == 4) {
                    flag = true;
                    break;
                }
            }
        }

        // Check columns
        for (int i = 0; i < values[0].length; i++) {
            int count = 0;
            int first = values[0][i];
            for (int j = 0; j < values.length; j++) {
                if (first == values[j][i]) {
                    count++;
                }
                else {
                    first = values[j][i];
                    count = 1;
                }
                if (count == 4) {
                    flag = true;
                    break;
                }
            }
        }

        // Check major diagonals
        for (int i = 0; i < values.length; i++) {
            int first = values[i][0];
            int count = 0;
            if (i >= 3) {
                for (int j = 0; j <= i; j++) {
                    if (first == values[i - j][j]) {
                        count++;
                    }
                    else {
                        first = values[i - j][j];
                        count = 1;
                    }
                    if (count == 4) {
                        flag = true;
                        break;
                    }
                }

            }
        }
        for (int i =  values[0].length - 1; i > 0; i--) {
            int first = values[values.length - 1][i];
            int count = 0;
            if (i <= values[0].length - 4) {
                for (int j = 0; j <= values.length - i; j++) {
                    if (first == values[values.length - 1 - j][i + j]) {
                        count++;
                    }
                    else {
                        first = values[values.length - 1 - j][i + j];
                        count = 1;
                    }
                    if (count == 4) {
                        flag = true;
                        break;
                    }
                }

            }
        }

        // Check sub-diagonals
        for (int i = 0; i < values.length - 3; i++) {
            int first = values[0][i];
            int count = 0;

            for (int j = 0; j < values.length - i; j++) {
                if (first == values[i + j][j]) {
                    count++;
                }
                else {
                    first = values[i + j][j];
                    count = 1;
                }
                if (count == 4) {
                    flag = true;
                    break;
                }
            }
        }
        for (int i = 1; i < values[0].length - 4; i++) {
            int first = values[0][i];
            int count = 0;

            for (int j = 0; j < values.length - i; j++) {
                if (first == values[j][j + i]) {
                    count++;
                }
                else {
                    first = values[j][j + i];
                    count = 1;
                }
                if (count == 4) {
                    flag = true;
                    break;
                }
            }
        }


        return flag;
    }
}

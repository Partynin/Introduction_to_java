package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConvertNumbers_Exe16_5 extends Application {
    public GridPane getPane() {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(5);
        pane.setVgap(5);

        TextField tfDecimal = new TextField();
        tfDecimal.setAlignment(Pos.BOTTOM_RIGHT);
        TextField tfHex = new TextField();
        tfHex.setAlignment(Pos.BOTTOM_RIGHT);
        TextField tfBinary = new TextField();
        tfBinary.setAlignment(Pos.BOTTOM_RIGHT);
        Text textDecimal = new Text("Decimal");
        Text textHex = new Text("Hex");
        Text textBinary = new Text("Binary");

        pane.add(textDecimal, 0, 0);
        pane.add(tfDecimal, 1, 0);
        pane.add(textHex, 0, 1);
        pane.add(tfHex, 1, 1);
        pane.add(textBinary, 0, 2);
        pane.add(tfBinary, 1, 2);

        tfDecimal.setOnAction(e -> {
            tfHex.setText((Integer.toHexString(Integer.parseInt(tfDecimal.getText()))));
            tfBinary.setText(Integer.toBinaryString(Integer.parseInt(tfDecimal.getText())));
        });

        tfHex.setOnAction(e -> {
            tfDecimal.setText((Integer.parseInt(tfHex.getText(), 16)) + "");
            tfBinary.setText(Integer.toBinaryString(Integer.parseInt(tfDecimal.getText())));
        });

        tfBinary.setOnAction(e -> {
            tfDecimal.setText((Integer.parseInt(tfBinary.getText(), 2)) + "");
            tfHex.setText(Integer.toHexString(Integer.parseInt(tfDecimal.getText())));
        });

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 150);
        primaryStage.setTitle("Convert Numbers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

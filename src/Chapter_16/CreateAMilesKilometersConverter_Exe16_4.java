package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CreateAMilesKilometersConverter_Exe16_4 extends Application {
    public GridPane getPane() {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(5);
        pane.setVgap(5);

        TextField tfMiles = new TextField();
        tfMiles.setAlignment(Pos.BOTTOM_RIGHT);
        TextField tfKilometers = new TextField();
        tfKilometers.setAlignment(Pos.BOTTOM_RIGHT);
        Text textMile = new Text("Mile");
        Text textKilometer = new Text("Kilometer");

        pane.add(textMile, 0, 0);
        pane.add(tfMiles, 1, 0);
        pane.add(textKilometer, 0, 1);
        pane.add(tfKilometers, 1, 1);

        tfMiles.setOnAction(e -> {
            tfKilometers.setText((Double.parseDouble(tfMiles.getText()) * 1.609) + "");
        });

        tfKilometers.setOnAction(e -> {
            tfMiles.setText((Double.parseDouble(tfKilometers.getText()) / 1.609) + "");
        });

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 150);
        primaryStage.setTitle("MilesToKilometers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

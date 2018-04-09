package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UseRadioButtons_Exe16_1 extends Application {
    protected Text text = new Text(50, 50, "Programming is fun");

    protected BorderPane getPane() {
        HBox paneForButtons =  new HBox(20);
        Button btLeft = new Button("<=");
        Button btRight = new Button("=>");
        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);

        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        paneForText.setStyle("-fx-border-color: red");
        pane.setCenter(paneForText);

        HBox paneForRadioButton = new HBox(5);
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbBlack = new RadioButton("Black");
        RadioButton rbGreen = new RadioButton("Green");
        paneForRadioButton.getChildren().addAll(rbRed, rbYellow, rbBlack, rbGreen);
        paneForRadioButton.setAlignment(Pos.CENTER);
        pane.setTop(paneForRadioButton);
        ToggleGroup group = new ToggleGroup();
        rbBlack.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbBlack.setSelected(true);

        rbBlack.setOnAction(e -> {
            if (rbBlack.isSelected())
                text.setFill(Color.BLACK);
        });

        rbGreen.setOnAction(e -> {
            if (rbGreen.isSelected())
                text.setFill(Color.GREEN);
        });

        rbRed.setOnAction(e -> {
            if (rbRed.isSelected())
                text.setFill(Color.RED);
        });

        rbYellow.setOnAction(e -> {
            if (rbYellow.isSelected())
                text.setFill(Color.YELLOW);
        });

        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));

        return pane;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 450, 150);
        primaryStage.setTitle("UseRadioButton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DemonstrateTextFieldProperties_Exe16_6 extends Application {
    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        HBox paneForButton = new HBox(5);
        RadioButton rbLeft = new RadioButton("Left");
        RadioButton rbCenter = new RadioButton("Center");
        RadioButton rbRight = new RadioButton("Right");
        ToggleGroup group = new ToggleGroup();
        rbLeft.setToggleGroup(group);
        rbCenter.setToggleGroup(group);
        rbRight.setToggleGroup(group);
        rbLeft.setSelected(true);
        Text textColSize = new Text("Column Size");
        TextField tfColSize = new TextField();
        tfColSize.setPrefColumnCount(4);
        paneForButton.getChildren().addAll(rbLeft, rbCenter, rbRight, textColSize, tfColSize);
        paneForButton.setAlignment(Pos.CENTER);
        paneForButton.setPadding(new Insets(5, 5, 5, 5));

        HBox paneForTextField = new HBox(5);
        Text textFieldText = new Text("Text Field");
        TextField textField = new TextField("JavaFX");
        paneForTextField.getChildren().addAll(textFieldText, textField);
        paneForTextField.setAlignment(Pos.CENTER);

        pane.setCenter(paneForTextField);
        pane.setBottom(paneForButton);

        rbLeft.setOnAction(e -> textField.setAlignment(Pos.BOTTOM_LEFT));

        rbCenter.setOnAction(e -> textField.setAlignment(Pos.CENTER));

        rbRight.setOnAction(e -> textField.setAlignment(Pos.BOTTOM_RIGHT));

        tfColSize.setOnAction(e -> {
            textField.setPrefColumnCount(Integer.parseInt(tfColSize.getText()));
        });

        return pane;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 350, 80);
        primaryStage.setTitle("DemonstrateTextFieldProperties");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemonstrateTextAreaProperties_Exe16_12 extends Application {
    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        TextArea taText = new TextArea();
        //ScrollPane scPane = new ScrollPane(taText);
        taText.setPrefRowCount(20);
        taText.setPrefColumnCount(30);
        taText.setEditable(false);

        String text = "";
        String lineSeparator = System.lineSeparator();
        File file = new File("t.txt");
        try (
                // Create input file
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                text += input.nextLine();
                text += lineSeparator;
            }
            taText.setText(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HBox paneForCheckBox = new HBox(5);
        CheckBox cbEditable = new CheckBox("Editable");
        CheckBox cbWrap = new CheckBox("Wrap");
        paneForCheckBox.getChildren().addAll(cbEditable, cbWrap);
        paneForCheckBox.setAlignment(Pos.CENTER);

        pane.setCenter(taText);
        pane.setBottom(paneForCheckBox);

        cbEditable.setOnAction(e -> {
            if (cbEditable.isSelected())
                taText.setEditable(true);
            else taText.setEditable(false);
        });

        cbWrap.setOnAction(e -> {
            if (cbWrap.isSelected())
                taText.setWrapText(true);
            else taText.setWrapText(false);
        });

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 200);
        primaryStage.setTitle("DemonstrateTextAreaProperties");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

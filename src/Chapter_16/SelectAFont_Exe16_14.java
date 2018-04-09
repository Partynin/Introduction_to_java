package Chapter_16;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SelectAFont_Exe16_14 extends Application {
    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        // Pane with the combo boxes and the texts
        HBox paneForComboBox = new HBox(5);
        Text textFontName = new Text("Font Name");
        ComboBox<String> cbFontName = new ComboBox<>();
        ObservableList<String> items = FXCollections.observableArrayList(
                Font.getFamilies() // Available font names
        );
        cbFontName.setValue(items.get(0));
        cbFontName.getItems().addAll(items);

        Text textFontSize = new Text("FontSize");
        ComboBox<String> cbFontSize = new ComboBox<>();
        String[] numbers = new String[100];
        for (int i = 0; i < 100; i++)
           numbers[i] = Integer.toString(i + 1);
        ObservableList<String> itemsSize = FXCollections.observableArrayList(numbers);
        cbFontSize.setValue(itemsSize.get(25));
        cbFontSize.getItems().addAll(itemsSize);

        paneForComboBox.getChildren().addAll(textFontName, cbFontName, textFontSize, cbFontSize);
        paneForComboBox.setAlignment(Pos.CENTER);

        // Main pane with a label
        StackPane paneWithMainText = new StackPane();
        Text text = new Text("Programming is fun");
        paneWithMainText.getChildren().add(text);

        // Pane with the check boxes
        HBox paneForCheckBox = new HBox(5);
        CheckBox checkBoxBold = new CheckBox("Bold");
        CheckBox checkBoxItalic = new CheckBox("Italic");
        paneForCheckBox.getChildren().addAll(checkBoxBold, checkBoxItalic);
        paneForCheckBox.setAlignment(Pos.CENTER);

        pane.setTop(paneForComboBox);
        pane.setCenter(paneWithMainText);
        pane.setBottom(paneForCheckBox);

        cbFontName.setOnAction(e -> {
           text.setFont(Font.font(cbFontName.getValue(),
                   Double.parseDouble(cbFontSize.getValue())));
            if (checkBoxBold.isSelected() && checkBoxItalic.isSelected()) {
                text.setFont(Font.font(cbFontName.getValue(), FontWeight.BOLD, FontPosture.ITALIC,
                        Double.parseDouble(cbFontSize.getValue()))); // Both check boxes checked
            }
            else if (checkBoxBold.isSelected()) {
                text.setFont(Font.font(cbFontName.getValue(), FontWeight.BOLD, FontPosture.REGULAR,
                        Double.parseDouble(cbFontSize.getValue()))); // The Bold check box checked
            }
            else if (checkBoxItalic.isSelected()) {
                text.setFont(Font.font(cbFontName.getValue(), FontWeight.NORMAL, FontPosture.ITALIC,
                        Double.parseDouble(cbFontSize.getValue()))); // The Italic check box checked
            }
            else {
                text.setFont(Font.font(cbFontName.getValue(), FontWeight.NORMAL, FontPosture.REGULAR,
                        Double.parseDouble(cbFontSize.getValue()))); // Both check boxes unchecked
            }
        });

        cbFontSize.setOnAction(e -> {
            text.setFont(Font.font(cbFontName.getValue(),
                Double.parseDouble(cbFontSize.getValue())));
            if (checkBoxBold.isSelected() && checkBoxItalic.isSelected()) {
                text.setFont(Font.font(cbFontName.getValue(), FontWeight.BOLD, FontPosture.ITALIC,
                        Double.parseDouble(cbFontSize.getValue()))); // Both check boxes checked
            }
            else if (checkBoxBold.isSelected()) {
                text.setFont(Font.font(cbFontName.getValue(), FontWeight.BOLD, FontPosture.REGULAR,
                        Double.parseDouble(cbFontSize.getValue()))); // The Bold check box checked
            }
            else if (checkBoxItalic.isSelected()) {
                text.setFont(Font.font(cbFontName.getValue(), FontWeight.NORMAL, FontPosture.ITALIC,
                        Double.parseDouble(cbFontSize.getValue()))); // The Italic check box checked
            }
            else {
                text.setFont(Font.font(cbFontName.getValue(), FontWeight.NORMAL, FontPosture.REGULAR,
                        Double.parseDouble(cbFontSize.getValue()))); // Both check boxes unchecked
            }
        });

        EventHandler<ActionEvent> handler = e -> {
             if (checkBoxBold.isSelected() && checkBoxItalic.isSelected()) {
                 text.setFont(Font.font(cbFontName.getValue(), FontWeight.BOLD, FontPosture.ITALIC,
                         Double.parseDouble(cbFontSize.getValue()))); // Both check boxes checked
                 }
             else if (checkBoxBold.isSelected()) {
                 text.setFont(Font.font(cbFontName.getValue(), FontWeight.BOLD, FontPosture.REGULAR,
                         Double.parseDouble(cbFontSize.getValue()))); // The Bold check box checked
                 }
             else if (checkBoxItalic.isSelected()) {
                 text.setFont(Font.font(cbFontName.getValue(), FontWeight.NORMAL, FontPosture.ITALIC,
                         Double.parseDouble(cbFontSize.getValue()))); // The Italic check box checked
                 }
             else {
                 text.setFont(Font.font(cbFontName.getValue(), FontWeight.NORMAL, FontPosture.REGULAR,
                         Double.parseDouble(cbFontSize.getValue()))); // Both check boxes unchecked
                 }
             };

        checkBoxBold.setOnAction(handler);
        checkBoxItalic.setOnAction(handler);

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 420, 200);
        primaryStage.setTitle("SelectAFont");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

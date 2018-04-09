package Chapter_16;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class DemonstrateLabelProperties_Exe16_15 extends Application {
    private String[] contentDisplay = {"Right", "Left", "Top", "Bottom"};

    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        // Pane for combo box and text field
        HBox paneForBoxAndField = new HBox(5);
        Text textContentDisplay = new Text("Content Display:");
        ComboBox<String> comboBox = new ComboBox<>();
        ObservableList<String> items = FXCollections.observableArrayList(contentDisplay);
        comboBox.getItems().addAll(items);
        comboBox.setValue(items.get(0));

        Text textGap = new Text("Graphic Text Gap:");
        TextField tfGap = new TextField();
        tfGap.setPrefColumnCount(3);


        paneForBoxAndField.getChildren().addAll(textContentDisplay, comboBox, textGap,
                tfGap);
        paneForBoxAndField.setAlignment(Pos.CENTER);

        // Main pane with image and label
        StackPane stackPane = new StackPane();
        ImageView imageViewGrapes = new ImageView(new Image(
                "file:C:/Users/Константин/IdeaProjects/Introduction_to_java/book/image/grapes.gif"));
        Label label = new Label("Grapes", imageViewGrapes);
        stackPane.getChildren().addAll(label);

        // Place panes in tht border pane
        pane.setTop(paneForBoxAndField);
        pane.setCenter(stackPane);

        comboBox.setOnAction(e -> {
            if (comboBox.getValue().equals("Right"))
                label.setContentDisplay(ContentDisplay.RIGHT);
            else if (comboBox.getValue().equals("Left"))
                label.setContentDisplay(ContentDisplay.LEFT);
            else if (comboBox.getValue().equals("Top"))
                label.setContentDisplay(ContentDisplay.TOP);
            else label.setContentDisplay(ContentDisplay.BOTTOM);
        });

        tfGap.setOnAction(e -> {
            label.setGraphicTextGap(Double.parseDouble(tfGap.getText()));
        });

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 420, 200);
        primaryStage.setTitle("DemonstrateLabelProperties");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

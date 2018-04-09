package Chapter_16;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UseComboBox_Exe16_16 extends Application {
    private String[] flagTitles = {"Canada", "China", "Denmark",
             "France", "Germany", "India", "Norway", "United Kingdom",
             "United States of America"};
    private String[] choose = {"MULTIPLE", "SINGLE"};

    private BorderPane getPane() {
        BorderPane pane = new BorderPane();

        // Pane choose selection mode
        HBox paneSelectionMode = new HBox(5);
        Text text = new Text("Choose Selection Mode:");
        ComboBox<String> cbMultiple = new ComboBox<>(
                FXCollections.observableArrayList(choose));
        cbMultiple.setValue(choose[0]);

        paneSelectionMode.getChildren().addAll(text, cbMultiple);
        paneSelectionMode.setAlignment(Pos.CENTER);

        // Center pane
        StackPane stackPane = new StackPane();
        ListView<String> listView = new ListView<>(
                FXCollections.observableArrayList(flagTitles));
        listView.setPrefSize(300, 180);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        stackPane.getChildren().addAll(listView);

        // Bottom pane
        HBox paneForText = new HBox(3);
        Text text1SelectedItems = new Text("Selected items are");
        paneForText.getChildren().addAll(text1SelectedItems);
        paneForText.setAlignment(Pos.BOTTOM_LEFT);

        // Place the panes in the main pane
        pane.setTop(paneSelectionMode);
        pane.setCenter(stackPane);
        pane.setBottom(paneForText);

        cbMultiple.setOnAction(e -> {
            if (cbMultiple.getValue().equals("MULTIPLE"))
                listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            else listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        });

        listView.getSelectionModel().selectedItemProperty().addListener(e -> {
            paneForText.getChildren().clear();
            paneForText.getChildren().add(text1SelectedItems);
            for (Integer i: listView.getSelectionModel().getSelectedIndices()) {
                paneForText.getChildren().add(new Text(flagTitles[i]));
            }
        });

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 200);
        primaryStage.setTitle("UseComboBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

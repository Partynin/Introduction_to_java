package Chapter_16;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application {
    // Declare an array of Strings for flag titles
    private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany",
    "India", "Norway", "United Kingdom", "United State of America"};

    // Declare an ImageView array for the national flags of 9 countries
    private ImageView[] imageViews = {
            new ImageView("file:/C:/Users/Константин/" +
                    "IdeaProjects/Introduction_to_java/book/image/ca.gif"),
            new ImageView("file:/C:/Users/Константин/" +
                    "IdeaProjects/Introduction_to_java/book/image/china.gif"),
            new ImageView("file:/C:/Users/Константин/" +
                    "IdeaProjects/Introduction_to_java/book/image/denmark.gif"),
            new ImageView("file:/C:/Users/Константин/" +
                    "IdeaProjects/Introduction_to_java/book/image/fr.gif"),
            new ImageView("file:/C:/Users/Константин/" +
                    "IdeaProjects/Introduction_to_java/book/image/germany.gif"),
            new ImageView("file:/C:/Users/Константин/" +
                    "IdeaProjects/Introduction_to_java/book/image/india.gif"),
            new ImageView("file:/C:/Users/Константин/" +
                    "IdeaProjects/Introduction_to_java/book/image/norway.gif"),
            new ImageView("file:/C:/Users/Константин/" +
                    "IdeaProjects/Introduction_to_java/book/image/uk.gif"),
            new ImageView("file:/C:/Users/Константин/" +
                    "IdeaProjects/Introduction_to_java/book/image/us.gif"),
    };

    @Override
    public void start(Stage primaryStage) throws Exception {
        ListView<String> lv = new ListView<>
                (FXCollections.observableArrayList(flagTitles));
        lv.setPrefSize(170, 400);
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        // Create a pane to hold image views
        FlowPane imagePane = new FlowPane(10, 10);
        BorderPane pane = new BorderPane();
        pane.setLeft(new ScrollPane(lv));
        pane.setCenter(imagePane);

        lv.getSelectionModel().selectedItemProperty().addListener(
                ov -> {
                    imagePane.getChildren().clear();
                    for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
                        imagePane.getChildren().add(imageViews[i]);
                    }
                }
        );

        // Create a scene and place it in the stage
        primaryStage.setScene(new Scene(pane, 450, 170));
        primaryStage.setTitle("ListViewDemo");
        primaryStage.show();
    }
}

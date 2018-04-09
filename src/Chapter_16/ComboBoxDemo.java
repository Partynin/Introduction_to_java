package Chapter_16;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application {
    // Declare an array of Strings for flag titles
    private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany",
    "India", "Norway", "United Kingdom", "United States of America"};

    // Declare an ImageView array for the national flags of 9 countries
    private ImageView[] flagImage = {
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
                    "IdeaProjects/Introduction_to_java/book/image/us.gif")};

    // Declare an array of strings for flag descriptions
    private String[] flagDescription = new String[9];

    // Declare and create description pane
    private DescriptionPane descriptionPane = new DescriptionPane();

    // Create a combo box for selecting countries
    private ComboBox<String> cbo = new ComboBox<>(); // flagTitles;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set text description
        flagDescription[0] = "The Canadian national flag....";
        flagDescription[1] = "Description for China national flag....";
        flagDescription[2] = "Description for Denmark national flag....";
        flagDescription[3] = "Description for France national flag....";
        flagDescription[4] = "Description for Germany national flag....";
        flagDescription[5] = "Description for India national flag....";
        flagDescription[6] = "Description for Norway national flag....";
        flagDescription[7] = "Description for UK national flag....";
        flagDescription[8] = "Description for US national flag....";

        // Set the first country (Canada) for display
        setDisplay(0);

        // Add combo box and description pane to the border pane
        BorderPane pane = new BorderPane();

        BorderPane paneForComboBox = new BorderPane();
        paneForComboBox.setLeft(new Label("Select a country: "));
        paneForComboBox.setCenter(cbo);
        pane.setTop(paneForComboBox);
        cbo.setPrefWidth(400);
        cbo.setValue("Canada");

        ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
        cbo.getItems().addAll(items);
        pane.setCenter(descriptionPane);

        // Display the selected country
        cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));

        // Create a scene and place it in the stage
        primaryStage.setScene(new Scene(pane, 450, 170));
        primaryStage.setTitle("ComboBoxDemo");
        primaryStage.show();
    }

    /** Set display information in teh description pane */
    public void setDisplay(int index) {
        descriptionPane.setTitle(flagTitles[index]);
        descriptionPane.setImageView(flagImage[index]);
        descriptionPane.setDescription(flagDescription[index]);
    }
}

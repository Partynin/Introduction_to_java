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

import java.io.File;
import java.util.Scanner;

public class DisplayCountryFlagAndFlagDescription_Exe16_27 extends Application {
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

    // Declare and create description pane
    private DescriptionPane descriptionPane = new DescriptionPane();

    // Create a combo box for selecting countries
    private ComboBox<String> cbo = new ComboBox<>(); // flagTitles;

    @Override
    public void start(Stage primaryStage) throws Exception {
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
        descriptionPane.setDescription(flagDescription(index));
    }

    /** Return String with description a flag reading from the directory */
    public String flagDescription(int index) {
        String descriptionFlag = "";

        try {
            File file = new File("text/description" + index + ".txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                descriptionFlag += input.nextLine() + "\n";
            }
        } catch (Exception e) {
            System.out.println("File doesn't found");
        }

        return descriptionFlag;
    }

}

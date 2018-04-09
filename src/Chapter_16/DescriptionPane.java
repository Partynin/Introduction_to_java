package Chapter_16;

import javafx.geometry.Insets;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;


public class DescriptionPane extends BorderPane {
    /** Label for displaying an image and a title */
    private Label lbImageTitle = new Label();

    /** text area for displaying text */
    private TextArea taDescription = new TextArea();

    public DescriptionPane() {
        // Create the icon and text and place the text under the icon
        lbImageTitle.setContentDisplay(ContentDisplay.TOP);
        lbImageTitle.setPrefSize(200, 100);

        // Set the font in the label and the text filed
        lbImageTitle.setFont(new Font("SansSerif", 16));
        taDescription.setFont(new Font("Serif", 14));

        taDescription.setWrapText(true);
        taDescription.setEditable(false);

        // Create a scroll pane to hold the text area
        ScrollPane scrollPane = new ScrollPane(taDescription);

        // Place label and scroll pane in the border pane
        setLeft(lbImageTitle);
        setCenter(scrollPane);
        setPadding(new Insets(5, 5, 5, 5));
    }

    /** Set the title */
    public void setTitle(String title) {
        lbImageTitle.setText(title);
    }

    /** Set the image view */
    public void setImageView(javafx.scene.image.ImageView icon) {
        lbImageTitle.setGraphic(icon);
    }

    /** Set the text description */
    public void setDescription(String text) {
        taDescription.setText(text);
    }
}

package Chapter_16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CheckBoxDemo1 extends Application {
    protected Text text = new Text(50, 50, "JavaFX programming");

    protected BorderPane getPane() {
        HBox paneForButtons = new HBox(20);
        Button btLeft = new Button("Left", new ImageView("file:/C:/Users/" +
                "Константин/IdeaProjects/Introduction_to_java/book/image/left.gif"));
        Button btRight = new Button("Right", new ImageView("file:/C:/Users/" +
                "Константин/IdeaProjects/Introduction_to_java/book/image/right.gif"));
        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: green");

        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);

        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));

        Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, 20);
        Font fontBold = Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.REGULAR, 20);
        Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL,
                FontPosture.ITALIC, 20);
        Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL,
                FontPosture.REGULAR, 20);

        text.setFont(fontNormal);

        VBox paneForCheckBoxes = new VBox(20);
        paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
        paneForCheckBoxes.setStyle("-fx-border-color: green");
        CheckBox chkBold = new CheckBox("Bold");
        CheckBox chkItalic = new CheckBox("Italic");
        paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic);
        pane.setRight(paneForCheckBoxes);

        EventHandler<ActionEvent> handler = e -> {
            if (chkBold.isSelected() && chkItalic.isSelected()) {
                text.setFont(fontBoldItalic); // Button check boxes checked
            }
            else if (chkBold.isSelected()) {
                text.setFont(fontBold); // The Bold check box checked
            }
            else if (chkItalic.isSelected()) {
                text.setFont(fontItalic); // The Italic check box is checked
            }
            else {
                text.setFont(fontNormal);  // Both check boxes unchecked
            }
        };

        chkBold.setOnAction(handler);
        chkItalic.setOnAction(handler);

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(getPane(), 450, 200);
        primaryStage.setTitle("ButtonDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

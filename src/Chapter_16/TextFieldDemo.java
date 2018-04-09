package Chapter_16;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class TextFieldDemo extends RadioButtonDemo {
    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();

        BorderPane paneForTestField = new BorderPane();
        paneForTestField.setPadding(new Insets(5, 5, 5, 5));
        paneForTestField.setStyle("-fx-border-color: green");
        paneForTestField.setLeft(new Label("Enter a new message: "));

        TextField tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTestField.setCenter(tf);
        pane.setTop(paneForTestField);

        tf.setOnAction(e -> text.setText(tf.getText()));

        return pane;
    }
}

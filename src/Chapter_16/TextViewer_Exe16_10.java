package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextViewer_Exe16_10 extends Application {
    private TextField tfForEnterFileName = new TextField();
    private TextArea taTextViewer = new TextArea();

    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        taTextViewer.setPrefColumnCount(30);
        taTextViewer.setPrefRowCount(10);
        taTextViewer.setWrapText(true);
        taTextViewer.setEditable(false);

        // Create a scroll pane to hld the text area
        ScrollPane scrollPane = new ScrollPane(taTextViewer);

        HBox paneForTFAndBut = new HBox();
        Text textFilename =  new Text("Filename");
        tfForEnterFileName.setPrefColumnCount(17);
        Button btView = new Button("View");
        paneForTFAndBut.getChildren().addAll(textFilename, tfForEnterFileName, btView);
        paneForTFAndBut.setAlignment(Pos.CENTER);

        // Place HBox and scroll pane in the border pane
        pane.setCenter(scrollPane);
        pane.setBottom(paneForTFAndBut);

        // Input name a fail for example
        // C:\Users\Константин\IdeaProjects\Introduction_to_java\t.txt
        // or just short path like t.txt
        btView.setOnAction(e -> {
            try {
                getTextFile();
            }
            catch (FileNotFoundException ex) {
                taTextViewer.setText("Error! File Not Found.");
            }
        });

        return pane;
    }

    /** Reads text from file and display it in a text area */
    private void getTextFile() throws FileNotFoundException {
        // Check if source file exists
        File file = new File(tfForEnterFileName.getText());
        if (!file.exists()) {
            taTextViewer.setText(tfForEnterFileName.getText() + " dose not exist");
        }
        else {
            String text = "";
            String lineSeparator = System.lineSeparator();
            try (
                    // Create input file
                    Scanner input = new Scanner(file)
                    ) {
                while (input.hasNext()) {
                    text += input.nextLine();
                    text += lineSeparator;
                }
                taTextViewer.setText(text);
            }
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 200);
        primaryStage.setTitle("TextViewer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
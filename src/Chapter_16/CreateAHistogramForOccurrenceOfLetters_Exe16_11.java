package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateAHistogramForOccurrenceOfLetters_Exe16_11 extends Application {
    private TextField tfForEnterFileName = new TextField();
    private Histogram histogramPane = new Histogram();

    public BorderPane getPane() {
        BorderPane pane = new BorderPane();


        HBox paneForTFAndBut = new HBox();
        Text textFilename =  new Text("Filename");
        tfForEnterFileName.setPrefColumnCount(17);
        Button btView = new Button("View");
        paneForTFAndBut.getChildren().addAll(textFilename, tfForEnterFileName, btView);
        paneForTFAndBut.setAlignment(Pos.CENTER);

        // Place HBox and histogram pane in the border pane
        pane.setCenter(histogramPane);
        pane.setBottom(paneForTFAndBut);

        // Input name a fail for example
        // C:\Users\Константин\IdeaProjects\Introduction_to_java\t.txt
        // or just short path like t.txt
        btView.setOnAction(e -> {
            try {
                getTextFile();
            }
            catch (FileNotFoundException ex) {
                histogramPane.getChildren().clear();
                histogramPane.getChildren().add(new Text(20, 20, "Error! File Not Found."));
            }
        });

        return pane;
    }

    /** Reads text */
    private void getTextFile() throws FileNotFoundException {
        // Check if source file exists
        File file = new File(tfForEnterFileName.getText());
        if (!file.exists()) {
            histogramPane.getChildren().clear();
            histogramPane.getChildren().
                    add(new Text(20, 20,
                            (tfForEnterFileName.getText() + " dose not exist")));
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
                histogramPane.setCount(text);
                histogramPane.displayHistogram();
            }
        }
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 200);
        primaryStage.setTitle("CreateAHistogramForOccurrencesOfLetters");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class Histogram extends Pane {
    private int[] count = new int[26];
    Pane pane = new Pane();

    public Histogram() {
        // Find chars
        String letter = "";
        for (int i = 0; i < 26; i++) {
            letter += Character.toString((char) ('A'+ i)) + " ";
        }

        Text text = new Text(10, 165, letter);
        Font font = new Font(12.3);
        text.setFont(font);
        getChildren().addAll(text);

        for (int i = 0; i < 26; i++) {
            getChildren().add(getRectangle(i, count[i]));
        }
    }

    public void setCount(String text) {
        // Find chars
        char[] letter = new char[26];
        for (int i = 0; i < 26; i++) {
            letter[i] = (char) ('A'+ i);
        }
        for (int i = 0; i < letter.length; i++) {
            System.out.print(letter[i] + " ");
        }

        for (int i = 0; i < count.length; i++) {
            Scanner scanner = new Scanner(text);
            while (scanner.hasNext()) {
                String s = scanner.next();
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == letter[i])
                        count[i] += 1;
                }

            }
        }
    }

    public void displayHistogram() {
        getChildren().clear();
        // Find the letters
        String letter = "";
        for (int i = 0; i < 26; i++) {
            letter += Character.toString((char) ('A'+ i)) + " ";
        }

        Text text = new Text(10, 165, letter);
        Font font = new Font(12.3);
        text.setFont(font);
        getChildren().addAll(text);

        for (int i = 0; i < 26; i++) {
            getChildren().add(getRectangle(i, count[i]));
        }
    }

    public Rectangle getRectangle(double position, double height) {
        Rectangle rectangle = new Rectangle(10 + position * 11, 150 - height,
                5, height);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);

        return rectangle;
    }
}
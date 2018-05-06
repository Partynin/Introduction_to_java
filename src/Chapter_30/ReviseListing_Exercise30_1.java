package Chapter_30;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/** *30.1 (Revise Listing 30.1) Rewrite Listing 30.1 to display the output in a text area,
 as shown in Figure 30.30. */

public class ReviseListing_Exercise30_1 extends Application {
    private TextArea textArea = new TextArea();
    private Pane pane = new Pane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        textArea.setWrapText(true);
        textArea.setPrefColumnCount(30);
        textArea.setPrefRowCount(8);

        Runnable printA = new PrintCharToTextArea('a', 1000, textArea);
        Runnable printB = new PrintCharToTextArea('b', 100, textArea);
        Runnable print100 = new PrintNumToTextArea(100, textArea);

        // Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

        pane.getChildren().add(textArea);

        Scene scene = new Scene(pane, 355, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Concurrent Output");
        primaryStage.show();
    }
}

class PrintCharToTextArea implements Runnable {
    private char charToPrint;
    private int times;
    private TextArea textArea;

    public PrintCharToTextArea(char c, int t, TextArea textArea) {
        charToPrint = c;
        times = t;
        this.textArea = textArea;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            textArea.setText(textArea.getText() + charToPrint);
        }
    }
}

class PrintNumToTextArea implements Runnable {
    private int lastNum;
    private TextArea textArea;

    public PrintNumToTextArea(int n, TextArea textArea) {
        lastNum = n;
        this.textArea = textArea;
    }

    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            textArea.setText(textArea.getText() + i);
        }
    }
}
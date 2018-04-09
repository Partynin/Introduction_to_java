package Chapter_17;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SplitFilesGUI_Exe17_11 extends Application {
    private TextField tfEnterAFile = new TextField("Exercise12_15.txt");
    private TextField tfSpecify = new TextField("3");

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(5);
        GridPane paneForEnterAndSpecify = new GridPane();
        HBox paneForButton = new HBox();

        Label lbIfYou = new Label("If you split a file named temp.txt into w smaller files,");
        Label lbTheThree = new Label("the three smaller files are temp.txt.1, temp.txt.2, and" +
                "temp.txt.3.");
        Label lbEnterAFile = new Label("Enter a file:");
        Label lbSpecify = new Label("Specify the number of smaller files:");
        Button btStart = new Button("Start");
        paneForButton.getChildren().add(btStart);
        paneForButton.setAlignment(Pos.CENTER);
        paneForEnterAndSpecify.add(lbEnterAFile, 0, 0);
        paneForEnterAndSpecify.add(tfEnterAFile, 1, 0);
        paneForEnterAndSpecify.add(lbSpecify, 0, 1);
        paneForEnterAndSpecify.add(tfSpecify, 1, 1);

        pane.getChildren().addAll(lbIfYou, lbTheThree, paneForEnterAndSpecify, paneForButton);
        paneForEnterAndSpecify.setAlignment(Pos.CENTER);

        btStart.setOnAction(e -> startSplitting());

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 130);
        primaryStage.setTitle("SplitFiles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void startSplitting() {
        // Check if source file exists
        File sourceFile = new File(tfEnterAFile.getText());
        if (!sourceFile.exists()) {
            System.out.println("Source file " + tfEnterAFile.getText()
                    + " does not exist");
            System.exit(2);
        }

        int numberOfFiles = Integer.parseInt(tfSpecify.getText());

        RandomAccessFile[] files = new RandomAccessFile[numberOfFiles];

        try (
                RandomAccessFile rafSource = new RandomAccessFile(sourceFile, "r")
        ) {
            for (int i = 0; i < files.length; i++) {
                files[i] = new RandomAccessFile(tfEnterAFile.getText()
                        + (i + 1), "rw");
            }

            int lengthSourceFile = Math.round (rafSource.length() / numberOfFiles);

            long pos = 0;
            byte[] b;

            for (int i = 0; i < numberOfFiles - 1; i++) {
                rafSource.seek(pos);
                b = new byte[lengthSourceFile];
                rafSource.read(b);
                files[i].write(b);
                pos += lengthSourceFile;
            }
            rafSource.seek(pos);
            b = new byte[(int)(rafSource.length() - pos)];
            rafSource.read(b);
            files[numberOfFiles - 1].write(b);

            for (int i = 0; i < files.length; i++) {
                files[i].close();
            }
        } catch (IOException ex) {
            System.out.println("We have problem!");
            ex.printStackTrace();
        }
    }
}

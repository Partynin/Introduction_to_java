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

public class CombineFilesGUI_Exe17_13 extends Application {
    private TextField tfEnterAFile = new TextField("Exercise12_15.txt");
    private TextField tfSpecify = new TextField("3");

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(5);
        GridPane paneForEnterAndSpecify = new GridPane();
        HBox paneForButton = new HBox();

        Label lbIfTheBase = new Label("If the base file is named temp.txt with three pieces,");
        Label lbSecondLine = new Label("temp.txt1, temp.txt2, and temp.txt3 are combined" +
                "into temp.txt");
        Label lbEnterAFile = new Label("Enter a file:");
        Label lbSpecify = new Label("Specify the number of smaller files:");
        Button btStart = new Button("Start");
        paneForButton.getChildren().add(btStart);
        paneForButton.setAlignment(Pos.CENTER);
        paneForEnterAndSpecify.add(lbEnterAFile, 0, 0);
        paneForEnterAndSpecify.add(tfEnterAFile, 1, 0);
        paneForEnterAndSpecify.add(lbSpecify, 0, 1);
        paneForEnterAndSpecify.add(tfSpecify, 1, 1);

        pane.getChildren().addAll(lbIfTheBase, lbSecondLine, paneForEnterAndSpecify, paneForButton);
        paneForEnterAndSpecify.setAlignment(Pos.CENTER);

        btStart.setOnAction(e -> startCombine());

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 130);
        primaryStage.setTitle("CombineFiles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void startCombine() {
        // Check if source file exists
        File[] filesSource = new File[Integer.parseInt(tfSpecify.getText())];
        for (int i = 0; i < filesSource.length; i++) {
            filesSource[i] = new File(tfEnterAFile.getText() + (i + 1));
            if (!filesSource[i].exists()) {
                System.out.println("Source file " + tfEnterAFile.getText() + " does not exist");
                System.exit(1);
            }
        }

        File targetFile = new File(tfEnterAFile.getText());

        try (
                RandomAccessFile rafTarget = new RandomAccessFile(targetFile, "rw")
        ) {
            long pos = 0;
            byte[] b;
            for (int i = 0; i < filesSource.length; i++) {
                RandomAccessFile file = new RandomAccessFile(filesSource[i], "r");
                b = new byte[(int) file.length()];
                file.read(b);
                rafTarget.seek(pos);
                rafTarget.write(b);
                pos += file.length();
            }
        } catch (IOException ex) {
            System.out.println("We have a problem!");
            ex.printStackTrace();
        }
    }
}

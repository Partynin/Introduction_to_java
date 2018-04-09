package Chapter_17;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;

public class BinaryEditor_Exe17_20 extends Application{
    private TextField tfEnter = new TextField("Exercise17_20.txt");
    private TextArea textArea = new TextArea();
    private String s = "";

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox();
        HBox paneForEnter = new HBox(5);
        HBox paneForTA = new HBox();
        HBox paneForButton = new HBox();

        Label lbEnter = new Label("Enter a file: ");
        tfEnter.setPrefColumnCount(28);
        paneForEnter.getChildren().addAll(lbEnter, tfEnter);
        paneForTA.getChildren().add(textArea);
        textArea.setEditable(true);
        textArea.setPrefColumnCount(40);
        textArea.setPrefRowCount(30);
        textArea.setWrapText(true);
        // Create a scroll pane to hold text area
        ScrollPane scrollPane = new ScrollPane(textArea);
        Button btSave = new Button("Save the change");
        paneForButton.getChildren().add(btSave);
        paneForButton.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(paneForEnter, paneForTA, paneForButton);

        Scene scene = new Scene(pane, 395, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BinaryEditor");
        primaryStage.show();

        tfEnter.setOnAction(e -> readFileAndShowBinary());
        btSave.setOnAction(e -> saveTheChange());
    }

    public void readFileAndShowBinary() {
        File file = new File(tfEnter.getText());
        if (!file.exists()) {
            System.out.println("The file not found!");
            System.exit(1);
        }

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))
                ) {

            int value;
            while ((value = bis.read()) != -1)
                s += getBits(value);

            textArea.setText(s);

        } catch (IOException ex) {
            System.out.println("We have a problem!");
            ex.printStackTrace();
        }
    }

    /** displays the bit representation for the
     last byte in an integer */
    public static String getBits(int value) {
        String byteRepresentation = "";

        for (int i = 7; i >= 0; i--) {
            byteRepresentation += (value >> i) & 1;
        }

        return byteRepresentation;
    }

    public void saveTheChange() {
        File file = new File(tfEnter.getText());
        if (!file.exists()) {
            System.out.println("The file not found!");
            System.exit(2);
        }

        try (
                BitOutputStream bos = new BitOutputStream(file)
                ) {
            bos.writeBit(textArea.getText());
        } catch (IOException ex) {
            System.out.println("We have a problem with output!");
            ex.printStackTrace();
        }
    }
}

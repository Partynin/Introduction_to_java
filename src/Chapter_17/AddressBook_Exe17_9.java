package Chapter_17;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AddressBook_Exe17_9 extends Application {
    private File file = new File("Exercise17_09");
    private TextField tfName = new TextField();
    private TextField tfStreet = new TextField();
    private TextField tfCity = new TextField();
    private TextField tfState = new TextField();
    private TextField tfZip = new TextField();
    private final int NAME = 32;
    private final int STREET = 32;
    private final int CITY = 20;
    private final int STATE = 2;
    private final int ZIP = 5;
    private int countPosition = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox paneForNmeStreetCityButton = new VBox(5);
        paneForNmeStreetCityButton.setPadding(new Insets(5, 5, 5, 5));
        HBox paneForLabelNameAndTf = new HBox(5);
        HBox paneForLabelStreetAndTf = new HBox(5);
        HBox paneForCityStateZip = new HBox(5);
        HBox paneForButton = new HBox(5);

        Label lbName = new Label("Name");
        tfName.setPrefColumnCount(32);
        paneForLabelNameAndTf.getChildren().addAll(lbName, tfName);
        paneForLabelNameAndTf.setAlignment(Pos.CENTER);

        Label lbStreet = new Label("Street");
        tfStreet.setPrefColumnCount(32);
        paneForLabelStreetAndTf.getChildren().addAll(lbStreet, tfStreet);
        paneForLabelStreetAndTf.setAlignment(Pos.CENTER);

        Label lbCity = new Label("City");
        lbCity.setPadding(new Insets(0, 9, 0, 0));
        tfCity.setPrefColumnCount(16);
        Label lbState = new Label("State");

        tfState.setPrefColumnCount(2);
        Label lbZip = new Label("Zip");
        tfZip.setPrefColumnCount(5);
        paneForCityStateZip.getChildren().addAll(lbCity, tfCity, lbState, tfState, lbZip, tfZip);
        paneForCityStateZip.setAlignment(Pos.CENTER);
        Button btAdd = new Button("Add");
        Button btFirst = new Button("First");
        Button btNext = new Button("Next");
        Button btPrevious = new Button("Previous");
        Button btLast = new Button("Last");
        Button btUpdate = new Button("Update");
        paneForButton.getChildren().addAll(btAdd, btFirst, btNext, btPrevious, btLast, btUpdate);
        paneForButton.setAlignment(Pos.CENTER);

        btAdd.setOnAction(e -> addData());
        btFirst.setOnAction(e -> goFirst());
        btNext.setOnAction(e -> goNext());
        btPrevious.setOnAction(e -> goPrevious());
        btLast.setOnAction(e -> goLast());
        btUpdate.setOnAction(e -> updateAddress());

        paneForNmeStreetCityButton.getChildren().addAll(paneForLabelNameAndTf, paneForLabelStreetAndTf,
                paneForCityStateZip, paneForButton);

        // Create a scene and place it in the stage
        Scene scene = new Scene(paneForNmeStreetCityButton, 430, 120);
        primaryStage.setTitle("AddressBook");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /** Create a new address */
    private void addData() {
        try (
                RandomAccessFile raf = new RandomAccessFile(file, "rw")
        ) {
            raf.seek(raf.length());
            write(raf);
        } catch (IOException ex) {
            System.out.println("We have problem with I/O the file");
            ex.printStackTrace();
        }
    }

    /** Edit an address in file */
    private void updateAddress() {
        try (
                RandomAccessFile raf = new RandomAccessFile(file, "rw")
        ) {
           raf.seek(countPosition * 91 - 91);
           write(raf);
        } catch (IOException ex) {
            System.out.println("We have problem with I/O the file");
            ex.printStackTrace();
        }
    }

    /** Read the last address from the file */
    private void goLast() {
        try (
                RandomAccessFile raf = new RandomAccessFile(file, "rw")
        ) {
            if (raf.length() > 0) {
                raf.seek(raf.length() - 91);
                read(raf);
                countPosition = (int) (raf.length() / 91);
                System.out.println("Reading address " + countPosition + "it last");
            }
        } catch (IOException ex) {
            System.out.println("We have problem with I/O the file");
            ex.printStackTrace();
        }
    }

    /** Read the previous address from the file */
    private void goPrevious() {
        try (
                RandomAccessFile raf = new RandomAccessFile(file, "rw")
        ) {
            if (countPosition > 1)
                countPosition--;
            else
                countPosition = 1;
            raf.seek((countPosition * 91) - 91);
            read(raf);
            System.out.println("Reading address " + countPosition);
        } catch (IOException ex) {
            System.out.println("We have problem with I/O the file");
            ex.printStackTrace();
        }
    }

    /** Read the next address from the file */
    private void goNext() {
        try (
                RandomAccessFile raf = new RandomAccessFile(file, "rw")
        ) {
            if (countPosition * 91 < raf.length()) {
                raf.seek(countPosition * 91);
                read(raf);
                countPosition++;
                System.out.println("Reading address " + countPosition);
            } else {
                System.out.println("End of file");
            }
        } catch (IOException ex) {
            System.out.println("We have problem with I/O the file");
            ex.printStackTrace();
        }
    }

    /** Read the first address from the file */
    private void goFirst() {
        try (
                RandomAccessFile raf = new RandomAccessFile(file, "rw")
        ) {
            if (raf.length() > 0) {
                raf.seek(0);
                read(raf);
                System.out.println("Reading address 1");
                countPosition = 1;
            } else {
                System.out.println("Address is empty");
            }
        } catch (IOException ex) {
            System.out.println("We have problem with I/O the file");
            ex.printStackTrace();
        }
    }

    /** Read data of address from file */
    private void read(RandomAccessFile raf) throws IOException {
        int pos;
        byte[] name = new byte[NAME];
        pos = raf.read(name);
        tfName.setText(new String(name));

        byte[] street = new byte[STREET];
        pos += raf.read(street);
        tfStreet.setText(new String(street));

        byte[] city = new byte[CITY];
        pos += raf.read(city);
        tfCity.setText(new String(city));

        byte[] state = new byte[STATE];
        pos += raf.read(state);
        tfState.setText(new String(state));

        byte[] zip = new byte[ZIP];
        pos += raf.read(zip);
        tfZip.setText(new String(zip));
    }

    /** Writ the data to the file */
    private void write(RandomAccessFile raf) throws IOException {
        raf.write(fixedLength(tfName.getText().getBytes(), NAME));
        raf.write(fixedLength(tfStreet.getText().getBytes(), STREET));
        raf.write(fixedLength(tfCity.getText().getBytes(), CITY));
        raf.write(fixedLength(tfState.getText().getBytes(), STATE));
        raf.write(fixedLength(tfZip.getText().getBytes(), ZIP));
    }

    /** Return a byte[] of specified fixed-length */
    private byte[] fixedLength(byte[] x, int n) {
        byte[] b = new byte[n];
        for (int i = 0; i < x.length; i++) {
            b[i] = x[i];
        }
        return b;
    }
}

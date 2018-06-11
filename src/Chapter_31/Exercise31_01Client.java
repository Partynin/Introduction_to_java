package Chapter_31;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Exercise31_01Client extends Application {
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextArea taServerReply = new TextArea();

    // Button for sending a loan to the server
    private Button btSubmit = new Button("Submit");

    // Host name or ip
    String host = "localhost";

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        GridPane paneForLbAndTfAndBt = new GridPane();
        paneForLbAndTfAndBt.add(new Label("Annual Interest Rate"), 0, 0);
        paneForLbAndTfAndBt.add(tfAnnualInterestRate, 1, 0);
        paneForLbAndTfAndBt.add(new Label("Number Of Years"), 0, 1);
        paneForLbAndTfAndBt.add(tfNumberOfYears, 1, 1);
        paneForLbAndTfAndBt.add(new Label("Loan Amount"), 0, 2);
        paneForLbAndTfAndBt.add(tfLoanAmount, 1, 2);
        paneForLbAndTfAndBt.add(btSubmit, 2, 1);

        tfAnnualInterestRate.setPrefColumnCount(15);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setPrefColumnCount(15);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setPrefColumnCount(15);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);

        pane.setCenter(paneForLbAndTfAndBt);
        pane.setBottom(new ScrollPane(taServerReply));

        btSubmit.setOnAction(new Exercise31_01Client.ButtonListener());

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 350, 200);
        primaryStage.setTitle("StudentClient"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * Handle button action
     */
    private class ButtonListener implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            try {
                // Establish connection with the server
                Socket socketOfClient = new Socket(host, 8000);

                // Create an output stream to the server
                ObjectOutputStream toServer =
                        new ObjectOutputStream(socketOfClient.getOutputStream());
                DataInputStream inputStream = new DataInputStream(socketOfClient.getInputStream());

                // Get text field
                double rate = Double.parseDouble(tfAnnualInterestRate.getText().trim());
                double numberOfYears = Double.parseDouble(tfNumberOfYears.getText().trim());
                double amount = Double.parseDouble(tfLoanAmount.getText().trim());

                // Create a Loan object and send to the server
                Loan loan = new Loan(rate, numberOfYears, amount);
                toServer.writeObject(loan);

                double monthlyPayment = inputStream.readDouble();
                double totalPayment = inputStream.readDouble();

                Platform.runLater(() -> {
                    taServerReply.appendText("Annual Interest Rate: " + rate + "\n");
                    taServerReply.appendText("Number of Years: " + numberOfYears + "\n");
                    taServerReply.appendText("monthlyPayment: " + amount + "\n");
                    taServerReply.appendText("monthlyPayment: " + monthlyPayment + "\n");
                    taServerReply.appendText("totalPayment: " + totalPayment + "\n");
                });

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

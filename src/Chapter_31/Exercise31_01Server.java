package Chapter_31;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Exercise31_01Server extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Text area for displaying connects
        TextArea ta = new TextArea();

        // Create a scene and place it in the stage
        Scene scene = new Scene(new ScrollPane(ta), 450, 200);
        primaryStage.setTitle("Exercise31_01Server"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        new Thread(() -> {
            try {
                // Create a server socket
                ServerSocket serverSocket = new ServerSocket(8000);
                Platform.runLater(() -> ta.appendText("Exercise31_01Server server started at "
                        + new Date() + '\n'));

                // Listen for a connection request
                Socket socket = serverSocket.accept();

                Platform.runLater(() -> {
                    ta.appendText("Connected to a client at " + new Date() + '\n');
                });

                ObjectInputStream inputFromClient = new ObjectInputStream(
                        socket.getInputStream());
                DataOutputStream outputToClient = new DataOutputStream(
                        socket.getOutputStream());

                while (true) {
                    // Read from input
                    Loan loan = (Loan) inputFromClient.readObject();

                    Platform.runLater(() -> {
                        ta.appendText("Annual interest Rate: " + loan.getAnnualInterestRate() +
                        "\n");
                        ta.appendText("Number of Years: " + loan.getNumberOfYears() + "\n");
                        ta.appendText("Loan Amount: " + loan.getLoanAmount() + "\n");
                        // Compute
                        ta.appendText("monthlyPayment: " + getMonthlyPayment(loan) + "\n");
                        ta.appendText("totalPayment: " + getTotalPayment(loan) + "\n");
                    });

                    // Send monthly payment back to client
                    outputToClient.writeDouble(getMonthlyPayment(loan));
                    // Send total payment back to client
                    outputToClient.writeDouble(getTotalPayment(loan));
                }
            } catch(IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }).start();
    }

    /** Find monthly payment */
    public double getMonthlyPayment(Loan loan) {
        double monthlyInterestRate = loan.getAnnualInterestRate() / 1200;
        double monthlyPayment = loan.getLoanAmount() * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, loan.getNumberOfYears() * 12)));
        return monthlyPayment;
    }

    /** Find total payment */
    public double getTotalPayment(Loan loan) {
        double totalPayment = getMonthlyPayment(loan) * loan.getNumberOfYears() * 12;
        return totalPayment;
    }
}

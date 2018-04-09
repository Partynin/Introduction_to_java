package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CompareLoansWithVariousInterestRates_Exe16_13 extends Application {
    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        HBox paneForTextFields = new HBox(5);
        Text textLoanAmount = new Text("Loan Amount");
        TextField tfLoanAmount = new TextField();
        tfLoanAmount.setPrefColumnCount(5);
        tfLoanAmount.setText("10000");
        Text textNumOfYears = new Text("Number of Years");
        TextField tfNumOfYears = new TextField();
        tfNumOfYears.setPrefColumnCount(5);
        tfNumOfYears.setText("5");
        Button btShowTable = new Button("Show Table");
        paneForTextFields.getChildren().addAll(textLoanAmount, tfLoanAmount, textNumOfYears,
                tfNumOfYears, btShowTable);
        paneForTextFields.setAlignment(Pos.CENTER);

        TextArea textArea = new TextArea();
        textArea.setPrefColumnCount(30);
        textArea.setPrefRowCount(20);

        pane.setTop(paneForTextFields);
        pane.setCenter(textArea);

        btShowTable.setOnAction(e ->
            textArea.setText(computeLoans(Double.parseDouble(tfLoanAmount.getText()),
                    Integer.parseInt(tfNumOfYears.getText()))));

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 420, 200);
        primaryStage.setTitle("CompareLoansWithVariousInterestRates");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /** Compute loan amount and loan like a text */
    public String computeLoans(double loan, int years) {
        double interestRate = 5;
        double increment = 0;
        String lineSeparator = System.lineSeparator();
        String text = "Interest Rate   Monthly Payment   Total Payment";
        text += lineSeparator;

        for (int i = 1; i <= 25; i++) {
            double monthlyPayment = (loan * (1.05 + increment)) / (years * 12);
            double totalPayment = loan * (1.05 + increment);
           text += String.format("%.3f               %.2f                     %.2f\n", interestRate +
                    increment, monthlyPayment, totalPayment);

            increment += 0.125;
        }

        return text;
    }
}
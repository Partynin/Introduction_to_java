package Chapter_15;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CreateAnInvestmentValueCalculator_Exe15_5 extends Application {
    private TextField tfInvestmentAmount = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfFutureValue = new TextField();
    private Button btCalculate = new Button("Calculate");
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Investment Amount:"), 0, 0);
        gridPane.add(tfInvestmentAmount, 1, 0);
        gridPane.add(new Label("Number Of Years: "), 0, 1);
        gridPane.add(tfNumberOfYears, 1, 1);
        gridPane.add(new Label("Annual Interest Rate: "), 0, 2);
        gridPane.add(tfAnnualInterestRate, 1,2);
        gridPane.add(new Label("Future value: "), 0, 3);
        gridPane.add(tfFutureValue, 1, 3);
        gridPane.add(btCalculate, 1, 4);

        // Set properties for UI
        gridPane.setAlignment(Pos.CENTER);
        tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
        tfFutureValue.setEditable(false);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);

        // Process events
        btCalculate.setOnAction(e -> calculateFutureValue());

        // Create scene and place it in the stage
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("LoanCalculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /** Calculates the future value */
    private void calculateFutureValue() {
        double investmentAmount = Double.parseDouble(tfInvestmentAmount.getCharacters() + "");
        double monthlyInterestRate = (Double.parseDouble(tfAnnualInterestRate.getCharacters() + ""))
                / 12 / 100;
        double years = Double.parseDouble(tfNumberOfYears.getCharacters() + "");

        double futureValue = investmentAmount * (Math.pow((1 + monthlyInterestRate), (years * 12)));

        tfFutureValue.setText(String.format("$%.2f",  futureValue));
    }
}

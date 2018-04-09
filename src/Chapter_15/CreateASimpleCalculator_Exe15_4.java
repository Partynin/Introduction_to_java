package Chapter_15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreateASimpleCalculator_Exe15_4 extends Application {
        private TextField tf1 = new TextField();
        private TextField tf2 = new TextField();
        private TextField tf3 = new TextField();
        private double x;
        private double y;
        private double result;
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBoxLbAndNum = new HBox(3);
        Label number1 = new Label("Number 1: ");
        Label number2 = new Label("Number 2: ");
        Label result = new Label("Result: ");
        tf1.setPrefColumnCount(4);
        tf2.setPrefColumnCount(4);
        tf3.setPrefColumnCount(4);
        hBoxLbAndNum.getChildren().addAll(number1, tf1, number2, tf2, result, tf3);
        hBoxLbAndNum.setAlignment(Pos.CENTER);

        HBox hBoxButton = new HBox(3);
        Button btAdd = new Button("Add");
        Button btSubtract = new Button("Subtract");
        Button btMultiply = new Button("Multiply");
        Button btDivide = new Button("Divide");
        hBoxButton.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
        hBoxButton.setAlignment(Pos.CENTER);

        btAdd.setOnAction(e -> add());
        btSubtract.setOnAction(e -> subtract());
        btMultiply.setOnAction(e -> multiply());
        btDivide.setOnAction(e -> divide());

        VBox mainBox = new VBox(7);
        mainBox.getChildren().addAll(hBoxLbAndNum, hBoxButton);
        mainBox.setAlignment(Pos.CENTER);

        primaryStage.setScene(new Scene(mainBox, 380, 80));
        primaryStage.setTitle("SimpleCalculator");
        primaryStage.show();
    }

    /** Add tow double numbers */
    public void add() {
        x = Double.parseDouble(tf1.getCharacters() + "");
        y = Double.parseDouble(tf2.getCharacters() + "");
        result = x + y;
        tf3.setText(result + "");
    }

    /** Subtract tow numbers */
    public void subtract() {
        x = Double.parseDouble(tf1.getCharacters() + "");
        y = Double.parseDouble(tf2.getCharacters() + "");
        result = x - y;
        tf3.setText(result + "");
    }

    /** Multiply two numbers */
    public void multiply() {
        x = Double.parseDouble(tf1.getCharacters() + "");
        y = Double.parseDouble(tf2.getCharacters() + "");
        result = x * y;
        tf3.setText(result + "");
    }

    /** Divide two numbers */
    public void divide() {
        x = Double.parseDouble(tf1.getCharacters() + "");
        y = Double.parseDouble(tf2.getCharacters() + "");
        result = x / y;
        tf3.setText(result + "");
    }
}

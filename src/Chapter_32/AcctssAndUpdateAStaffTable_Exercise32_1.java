package Chapter_32;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;
import java.util.Locale;

public class AcctssAndUpdateAStaffTable_Exercise32_1 extends Application {
    // Statement for executing queries
    private Statement stmt;
    private TextField tfID = new TextField();
    private TextField tfLastName = new TextField();
    private TextField tfFirsName = new TextField();
    private TextField tfAddress = new TextField();
    private TextField tfCity = new TextField();
    private TextField tfState = new TextField();
    private TextField tfTelephone = new TextField();
    private TextField tfMI = new TextField();
    private Label lblStatus = new Label();

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Initialize database connection and create a Statement object
        initializeDB();

        Button btView = new Button("View");
        Button btInsert = new Button("Insert");
        Button btUpdate = new Button("Update");
        Button btClear = new Button("Clear");
        HBox hBoxButtons = new HBox(5);
        hBoxButtons.getChildren().addAll(btView, btInsert, btUpdate, btClear);
        hBoxButtons.setAlignment(Pos.CENTER);

        HBox hBoxID = new HBox(5);
        hBoxID.getChildren().addAll(new Label("ID"), tfID);

        HBox hBoxLastNameAndFirstNameAndMI = new HBox(5);
        hBoxLastNameAndFirstNameAndMI.getChildren().addAll(new Label("Last Name"),
                tfLastName, new Label("First Name"), tfFirsName, new Label("MI"),
                tfMI);

        HBox hBoxAdddress = new HBox(5);
        hBoxAdddress.getChildren().addAll(new Label("Address"), tfAddress);

        HBox hBoxCityAndState = new HBox(5);
        hBoxCityAndState.getChildren().addAll(new Label("City"), tfCity,
                new Label("State"), tfState);

        HBox hBoxTelephone = new HBox(5);
        hBoxTelephone.getChildren().addAll(new Label("Telphone"), tfTelephone);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(lblStatus, hBoxID, hBoxLastNameAndFirstNameAndMI,
                hBoxAdddress, hBoxCityAndState, hBoxTelephone, hBoxButtons);

        tfID.setPrefColumnCount(15);
        tfLastName.setPrefColumnCount(8);
        tfFirsName.setPrefColumnCount(8);
        tfMI.setPrefColumnCount(2);

        btView.setOnAction(e -> viewStaffInformation());
        btInsert.setOnAction(e -> insertStaffInformation());
        btUpdate.setOnAction(e -> updateStaffInformation());
        btClear.setOnAction(e -> clearStaffInformation());

        // Create a scene and place it in the stage
        Scene scene = new Scene(vBox, 480, 230);
        primaryStage.setTitle("Access and update a Staff table"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    private void initializeDB() {
        try {
            // Load the JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded");

            // Establish a connection
            Locale.setDefault(Locale.ENGLISH);
            Connection connection = DriverManager.getConnection
                    ("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
            // ("jdbc:oracle:thin:@liang.armstrong.edu:1521:orcl",
            // "scott", "tiger");
            System.out.println("Database connected");

            // Create a statement
            stmt = connection.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void viewStaffInformation() {
        String ID = tfID.getText().trim();

        try {
            String queryString = "select * from Staff " +
                    "where ID = " + ID;

            ResultSet rset = stmt.executeQuery(queryString);

            if (rset.next()) {
                String lastName = rset.getString(2);
                String firstName = rset.getString(3);
                String MI = rset.getString(4);
                String adress = rset.getString(5);
                String city = rset.getString(6);
                String state = rset.getString(7);
                String telephone = rset.getString(8);

                // Display result in a label
                lblStatus.setText("Record found");

                tfID.setText(ID);
                tfLastName.setText(lastName);
                tfFirsName.setText(firstName);
                tfMI.setText(MI);
                tfAddress.setText(adress);
                tfCity.setText(city);
                tfState.setText(state);
                tfTelephone.setText(telephone);
            } else {
                lblStatus.setText("Record not found");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void insertStaffInformation() {
        String ID = tfID.getText();
        String lastName = tfLastName.getText();
        String firstName = tfFirsName.getText();
        String MI = tfMI.getText();
        String adress = tfAddress.getText();
        String city = tfCity.getText();
        String state = tfState.getText();
        String telephone = tfTelephone.getText();

        try {
            stmt.executeUpdate("insert into Staff values ('" + ID + "', '" + lastName + "', '" +
            firstName + "', '" + MI + "', '" + adress + "', '" + city + "', '" + state + "', '"
                    + telephone + "', null)");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void updateStaffInformation() {
        String ID = tfID.getText();
        String lastName = tfLastName.getText();
        String firstName = tfFirsName.getText();
        String MI = tfMI.getText();
        String adress = tfAddress.getText();
        String city = tfCity.getText();
        String state = tfState.getText();
        String telephone = tfTelephone.getText();

        try {
            stmt.executeUpdate("update Staff set lastName = '" + lastName +
                    "', firstName = '" + firstName + "', mi = '" + MI +
                    "', address = '" + adress + "', city = '" + city +
                    "', state = '" + state + "', telephone = '" + telephone + "' " +
                    " where id = " + ID);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void clearStaffInformation() {
        lblStatus.setText("Clear");
        tfID.setText(null);
        tfLastName.setText(null);
        tfFirsName.setText(null);
        tfMI.setText(null);
        tfAddress.setText(null);
        tfCity.setText(null);
        tfState.setText(null);
        tfTelephone.setText(null);
    }
}

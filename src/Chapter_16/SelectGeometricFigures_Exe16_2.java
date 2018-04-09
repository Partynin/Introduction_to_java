package Chapter_16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SelectGeometricFigures_Exe16_2 extends Application{
    public BorderPane getPane() {
        BorderPane pane = new BorderPane();

        Circle circle = new Circle(30);
        circle.setStroke(Color.BLACK);
        circle.setFill(null);
        Rectangle rectangle = new Rectangle(40, 20);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(null);
        Ellipse ellipse = new Ellipse(50, 30);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(null);

        StackPane paneForFigures = new StackPane();
        paneForFigures.setStyle("-fx-border-color: green; -fx-border-insets: 5px");
        pane.setCenter(paneForFigures);

        HBox paneForButton = new HBox(5);
        RadioButton rbCircle = new RadioButton("Circle");
        RadioButton rbRectangle = new RadioButton("Rectangle");
        RadioButton rbEllipse = new RadioButton("Ellipse");
        CheckBox chkFill = new CheckBox("Fill");
        paneForButton.getChildren().addAll(rbCircle, rbRectangle, rbEllipse, chkFill);
        paneForButton.setAlignment(Pos.CENTER);
        pane.setBottom(paneForButton);
        ToggleGroup group = new ToggleGroup();
        rbCircle.setToggleGroup(group);
        rbEllipse.setToggleGroup(group);
        rbRectangle.setToggleGroup(group);

        rbCircle.setOnAction(e -> {
            paneForFigures.getChildren().clear();
            paneForFigures.getChildren().add(circle);
            if (chkFill.isSelected())
                circle.setFill(Color.BLACK);
            else circle.setFill(null);
        });

        rbEllipse.setOnAction(e -> {
            paneForFigures.getChildren().clear();
            paneForFigures.getChildren().add(ellipse);
            if (chkFill.isSelected())
                ellipse.setFill(Color.BLACK);
            else ellipse.setFill(null);
        });

        rbRectangle.setOnAction(e -> {
            paneForFigures.getChildren().clear();
            paneForFigures.getChildren().add(rectangle);
            if (chkFill.isSelected())
                rectangle.setFill(Color.BLACK);
            else rectangle.setFill(null);
        });

        return pane;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 450, 200);
        primaryStage.setTitle("SelectGeometricFigures");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

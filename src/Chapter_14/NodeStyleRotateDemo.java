package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place a button in the scene
        StackPane pane = new StackPane();
        Button btOK = new Button("OK");
        btOK.setStyle("-fx-border-color: blue; -fx-text-fill: red; -fx-background-color: navy;");
        btOK.setRotate(-20);
        pane.getChildren().add(btOK);


        pane.setRotate(45);
        pane.setStyle("-fx-border-color: red; -fx-background-color: gold;");

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("NodesStyleRotateDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

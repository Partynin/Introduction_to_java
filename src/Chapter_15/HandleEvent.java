package Chapter_15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a pane and set its properties
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOk = new Button("OK");
        Button btCancel = new Button("Cancel");
        OKHandlerClass handler1 = new OKHandlerClass();
        btOk.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);
        pane.getChildren().addAll(btOk, btCancel);

        // Create a scene and place it the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("HandleEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class OKHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("OK button clicked");
    }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Cancel button clicked");
    }
}

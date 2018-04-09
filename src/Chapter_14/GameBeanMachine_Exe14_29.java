package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GameBeanMachine_Exe14_29 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();

        BeanMachinePane beanMachinePane = new BeanMachinePane();
        pane.getChildren().addAll(beanMachinePane);

        primaryStage.setScene(new Scene(pane, 270, 300));
        primaryStage.setTitle("BeanMachine");
        primaryStage.show();
    }
}

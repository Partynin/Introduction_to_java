package Chapter_14;

import javafx.application.Application;
 import javafx.scene.Scene;
 import javafx.scene.layout.HBox;
 import javafx.scene.layout.Pane;
 import javafx.geometry.Insets;
 import javafx.stage.Stage;
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;

public class ShowImage extends Application {
        @Override // Override the start method in the Application class
         public void start(Stage primaryStage) {
             // Create a pane to hold the image views
            Pane pane = new HBox(10);
            pane.setPadding(new Insets(5, 5, 5, 5));
            Image image = new Image("file:/C:/Users/Константин/IdeaProjects/Introduction_to_java/src/Chapter_14/image/bear.gif");
             pane.getChildren().add(new ImageView(image));

             ImageView imageView2 = new ImageView(image);
             imageView2.setFitHeight(100);
             imageView2.setFitWidth(100);

             pane.getChildren().add(imageView2);
             ImageView imageView3 = new ImageView(image);
             imageView3.setRotate(90);
             pane.getChildren().add(imageView3);

             // Create a scene and place it in the stage
             Scene scene = new Scene(pane);
             primaryStage.setTitle("ShowImage"); // Set the stage title
             primaryStage.setScene(scene); // Place the scene in the stage
             primaryStage.show(); // Display the stage
        }
//    /**
//     18 * The main method is only needed for the IDE with limited
//     19 * JavaFX support. Not needed for running from the command line.
//     20 */
// public static void main(String[] args) {
//         Application.launch(args);
//         }
}


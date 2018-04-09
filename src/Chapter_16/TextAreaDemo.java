package Chapter_16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TextAreaDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Declare and create a description pane
        DescriptionPane descriptionPane = new DescriptionPane();

        // Set title, text, and image in the description pane
        descriptionPane.setTitle("Canada");
        String description = "The Canadian national flag ...";
        descriptionPane.setImageView(new ImageView("file:/C:/Users/Константин/" +
                "IdeaProjects/Introduction_to_java/book/image/ca.gif"));
        descriptionPane.setDescription(description);

        // Create a scene and place it in the stage
        Scene scene = new Scene(descriptionPane, 450, 200);
        primaryStage.setTitle("TextAreaDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package Chapter_16;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class FlagAnthem extends Application {
    private final static int NUMBER_OF_NATIONS = 7;
    private final static String URLBase =
            "file:/C:/Users/Константин/IdeaProjects/Introduction_to_java/book";
    private int currentIndex = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image[] images = new Image[NUMBER_OF_NATIONS];
        MediaPlayer[] mp = new MediaPlayer[NUMBER_OF_NATIONS];

        // Load images and audio
        for (int i = 0; i < NUMBER_OF_NATIONS; i++) {
            images[i] = new Image(URLBase + "/image/flag" + i + ".gif");
            mp[i] = new MediaPlayer(new Media(URLBase + "/audio/anthem" + i + ".mp3"));
        }

        Button btPlayPause = new Button(">");
        btPlayPause.setOnAction(e -> {
            if (btPlayPause.getText().equals(">")) {
                mp[currentIndex].play();
                btPlayPause.setText("||");
            } else {
                mp[currentIndex].pause();
                btPlayPause.setText(">");
            }
        });

         ImageView imageView = new ImageView(images[currentIndex]);
         ComboBox<String> cboNation = new ComboBox<>();
         ObservableList<String> items = FXCollections.observableArrayList
         ("Denmark", "Germany", "China", "India", "Norway", "UK", "US");
         cboNation.getItems().addAll(items);
         cboNation.setValue(items.get(0));
         cboNation.setOnAction(e -> {
             mp[currentIndex].stop();
             currentIndex = items.indexOf(cboNation.getValue());
             imageView.setImage(images[currentIndex]);
             mp[currentIndex].play();
             });

         HBox hBox = new HBox(10);
         hBox.getChildren().addAll(btPlayPause,
                 new Label("Select a nation: "), cboNation);
         hBox.setAlignment(Pos.CENTER);

         // Create a pane to hold nodes
         BorderPane pane = new BorderPane();
         pane.setCenter(imageView);
         pane.setBottom(hBox);

         // Create a scene and place it in the stage
         Scene scene = new Scene(pane, 350, 270);
         primaryStage.setTitle("FlagAnthem"); // Set the stage title
         primaryStage.setScene(scene); // Place the scene in the stage
         primaryStage.show(); // Display the stage
    }
}

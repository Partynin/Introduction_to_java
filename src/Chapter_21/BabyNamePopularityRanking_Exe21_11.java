package Chapter_21;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/** **21.11 (Baby name popularity ranking) Use the data files from Programming
 Exercise 12.31 to write a program that enables the user to select a year, gender,
 and enter a name to display the ranking of the name for the selected year and
 gender, as shown in Figure 21.9. To achieve the best efficiency, create two arrays
 for boy’s names and girl’s names, respectively. Each array has 10 elements for
 10 years. Each element is a map that stores a name and its ranking in a pair
 with the name as the key. Assume the data files are stored at www.cs.armstrong
 .edu/liang/data/babynamesranking2001.txt, . . . , and www.cs.armstrong.edu/liang/data/
 babynamesranking2010.txt. */

public class BabyNamePopularityRanking_Exe21_11 extends Application {
    private HashMap<String, String>[] boyNames =  new HashMap[10];
    private HashMap<String, String>[] girlNames = new HashMap[10];
    private ComboBox<String> cbSex = new ComboBox<>();
    private ComboBox<String> cbYear = new ComboBox<>();

    /** Return UI pane */
    public VBox getPane() {
        VBox mainPane = new VBox();
        makeArrays();

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5));
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        Text textSelectAYear = new Text("Select a year:");
        cbYear.getItems().addAll("2001", "2002", "2003", "2004", "2005", "2006", "2007",
                "2008", "2009", "2010");
        cbYear.setValue("2001");

        Text textBoyOrGirl = new Text("Boy or girl?");
        cbSex.getItems().addAll("Male", "Female");
        cbSex.setValue("Male");

        Text textEnterAName = new Text("Enter a name");
        TextField tfForName = new TextField("Michael");

        Button btFindRanking = new Button("Find Ranking");

        Text textForResult = new Text("Enter your chose");

        gridPane.add(textSelectAYear, 0, 0);
        gridPane.add(cbYear, 1, 0);
        gridPane.add(textBoyOrGirl, 0, 1);
        gridPane.add(cbSex, 1, 1);
        gridPane.add(textEnterAName, 0, 2);
        gridPane.add(tfForName, 1,2);
        gridPane.add(btFindRanking, 1, 3);

        mainPane.getChildren().addAll(gridPane, textForResult);

        btFindRanking.setOnAction(e-> {
            String name = tfForName.getText();
            textForResult.setText(getGender() + " name " + name +
                    "is randed #" + getRank(name) + " in year " + getYear());
        });

        return mainPane;
    }

    /** Chose name for specific gender */
    private String getRank(String name) {
        String rank = "";
        if (cbSex.getValue().equals("Male")) {
            rank = boyNames[Integer.parseInt(cbYear.getValue()) - 2001].get(name);
        } else {
            rank = girlNames[Integer.parseInt(cbYear.getValue()) - 2001].get(name);
        }

        return rank;
    }

    private String getYear() {
        return cbYear.getValue();
    }

    private String getGender() {
        return cbSex.getValue().equals("Male") ? "Boy" : "Girl";
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(getPane(), 280, 160);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bay Name Popularity");
        primaryStage.show();
    }

    /** Fill arrays of map with specific gender */
    public void makeArrays() {
        for (int i = 0; i < boyNames.length; i++) {
            boyNames[i] = new HashMap<>();
            girlNames[i] = new HashMap<>();
        }

        for (int j = 2001; j < 2011; j++) {
            try {
                URL url = new URL(
                        "http://www.cs.armstrong.edu/liang/data/babynamesranking" +
                                j + ".txt");
                Scanner input = new Scanner(url.openStream());
                while (input.hasNext()) {
                    ArrayList<String> list = new ArrayList<>();
                    for (int i = 0; i < 5; i++) {
                        String s = input.next();
                        list.add(s);
                    }
                    boyNames[j - 2001].put(list.get(1), list.get(0));
                    girlNames[j - 2001].put(list.get(3), list.get(0));
                }
            } catch (MalformedURLException ex) {
                System.out.println("Invalid URL");
            } catch (IOException ex) {
                System.out.println("I/O Errors: no such file");
            }
        }
    }
}

package Chapter_20;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** **20.13 (Game: the 24-point card game) The 24-point game is to pick any 4 cards
 from 52 cards, as shown in Figure 20.19. Note that the Jokers are excluded.
 Each card represents a number. An Ace, King, Queen, and Jack represent 1,
 13, 12, and 11, respectively. You can click the Shuffle button to get four new
 cards. Enter an expression that uses the four numbers from the four selected
 cards. Each number must be used once and only once. You can use the operators
 (addition, subtraction, multiplication, and division) and parentheses in the
 expression. The expression must evaluate to 24. After entering the expression,
 click the Verify button to check whether the numbers in the expression are currently
 selected and whether the result of the expression is correct. Display the
 verification in a label before the Shuffle button. Assume that images are stored
 in files named 1.png, 2.png, . . . , 52.png, in the order of spades, hearts, diamonds,
 and clubs. So, the first 13 images are for spades 1, 2, 3, . . . , and 13. */

public class GameThe24PointCardGame_Exe20_13 extends Application {
    private ArrayList<Integer> arrayNumbers = new ArrayList<>();
    private ArrayList<Integer> arrayEnterNum = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        Button btShuffle = new Button("Shuffle");
        Button btVerify = new Button("Verify");
        Text textAboutResult = new Text("...");
        Text textEnterAnExpression = new Text("Enter an expression: ");
        TextField tfEnterExpression = new TextField();

        HBox paneForTextAboutAndBtShuffle = new HBox(5);
        paneForTextAboutAndBtShuffle.getChildren().addAll(textAboutResult, btShuffle);
        paneForTextAboutAndBtShuffle.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTextAboutAndBtShuffle.setPadding(new Insets(5, 5, 5, 5));


        HBox paneForTextEnterAndBtVerify = new HBox(5);
        paneForTextEnterAndBtVerify.getChildren().addAll(textEnterAnExpression,
                tfEnterExpression, btVerify);
        paneForTextEnterAndBtVerify.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTextEnterAndBtVerify.setPadding(new Insets(5, 5, 5, 5));

        HBox paneForCards = new HBox(5);
        paneForCards.setPadding(new Insets(5, 5, 5, 5));
        setRandomCords(paneForCards);
        paneForCards.setAlignment(Pos.CENTER);

        vBox.getChildren().addAll(paneForTextAboutAndBtShuffle, paneForCards,
                paneForTextEnterAndBtVerify);

        btShuffle.setOnAction(e -> setRandomCords(paneForCards));

        btVerify.setOnAction(e -> {
            arrayEnterNum.clear();
            String s = tfEnterExpression.getText();
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(s);
            while (m.find()) {
                arrayEnterNum.add(Integer.parseInt(m.group()));
            }

                System.out.println("Array enter: " + arrayEnterNum);

                if (arrayNumbers.containsAll(arrayEnterNum)) {
                    String result = EvaluateExpression.evaluateExpression(
                            tfEnterExpression.getText()) + "";
                    textAboutResult.setText(result);
                }
                else textAboutResult.setText("The numbers in the expression don't\n" +
                        " match the numbers in set");

        });

        Scene scene = new Scene(vBox, 350, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PickFourCards");
        primaryStage.show();
    }

    /** Create a FlowPane with four cards */
    public void setRandomCords(HBox box) {
        ArrayList<Integer> array = new ArrayList<>();
        // Fill array integers
        for (int i = 1; i < 53; i++) {
            array.add(i);
        }
        Collections.shuffle(array);
        arrayNumbers.clear();

        for (int i = 0; i < 4; i++) {
            switch (array.get(i)) {
                case 1: case 14: case 27: case 40: arrayNumbers.add(1); break;
                case 2: case 15: case 28: case 41: arrayNumbers.add(2); break;
                case 3: case 16: case 29: case 42: arrayNumbers.add(3); break;
                case 4: case 17: case 30: case 43: arrayNumbers.add(4); break;
                case 5: case 18: case 31: case 44: arrayNumbers.add(5); break;
                case 6: case 19: case 32: case 45: arrayNumbers.add(6); break;
                case 7: case 20: case 33: case 46: arrayNumbers.add(7); break;
                case 8: case 21: case 34: case 47: arrayNumbers.add(8); break;
                case 9: case 22: case 35: case 48: arrayNumbers.add(9); break;
                case 10: case 23: case 36: case 49: arrayNumbers.add(10); break;
                case 11: case 24: case 37: case 50: arrayNumbers.add(11); break;
                case 12: case 25: case 38: case 51: arrayNumbers.add(12); break;
                case 13: case 26: case 39: case 52: arrayNumbers.add(13); break;
            }
        }

        System.out.println("Random kart: " + arrayNumbers);

        ImageView image1 = new ImageView("file:/C:/Users/Konstantin/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + array.get(0) + ".png");
        ImageView image2 = new ImageView("file:/C:/Users/Konstantin/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + array.get(1) + ".png");
        ImageView image3 = new ImageView("file:/C:/Users/Konstantin/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + array.get(2) + ".png");
        ImageView image4 = new ImageView("file:/C:/Users/Konstantin/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + array.get(3) + ".png");

        box.getChildren().clear();
        box.getChildren().addAll(image1, image2, image3, image4);
    }
}

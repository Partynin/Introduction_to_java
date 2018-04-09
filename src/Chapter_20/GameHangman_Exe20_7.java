package Chapter_20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.LinkedList;

public class GameHangman_Exe20_7 extends Application {
    private String[] words = {"sister", "brother", "puss", "uncle", "dick", "mother", "father"};
    private String word;
    private String[] encrypt;
    private Text textOfWord = new Text(280, 350, "");
    private Text textMissedLetters = new Text(200, 380, "Missed letters: ");
    private Pane pane = new Pane();
    private String letter;
    private LinkedList<Shape> listShape = new LinkedList<>();
    private Line line3 = new Line(300, 50, 300, 90);
    private Circle circle = new Circle(300, 115, 25);
    private Line line4 = new Line(300, 140, 300, 240);
    private Line line5 = new Line(300, 140, 270, 180);
    private Line line6 = new Line(300, 140, 330, 180);
    private Line line7 = new Line(300, 240, 270, 300);
    private Line line8 = new Line(300, 240, 330, 300);

    private Pane getPane() {

        Arc arc = new Arc(85, 380, 70, 40, 0, 180);
        arc.setType(ArcType.OPEN);
        arc.setStroke(Color.BLACK);
        arc.setFill(null);
        Line line1 = new Line(85, 50, 85, 340);
        Line line2 = new Line(85, 50, 300, 50);

        Text textGuessAWord = new Text(200, 350, "Guess a word: ");

        pane.setOnKeyPressed(e -> {
                    switch (e.getCode()) {
                        case A: letter = "a"; break;
                        case B: letter = "b"; break;
                        case C: letter = "c"; break;
                        case D: letter = "d"; break;
                        case E: letter = "e"; break;
                        case F: letter = "f"; break;
                        case G: letter = "g"; break;
                        case H: letter = "h"; break;
                        case I: letter = "i"; break;
                        case J: letter = "j"; break;
                        case K: letter = "k"; break;
                        case L: letter = "l"; break;
                        case M: letter = "m"; break;
                        case N: letter = "n"; break;
                        case O: letter = "o"; break;
                        case P: letter = "p"; break;
                        case Q: letter = "q"; break;
                        case R: letter = "r"; break;
                        case S: letter = "s"; break;
                        case T: letter = "t"; break;
                        case U: letter = "y"; break;
                        case V: letter = "v"; break;
                        case W: letter = "w"; break;
                        case X: letter = "x"; break;
                        case Y: letter = "y"; break;
                        case Z: letter = "z"; break;
                        case ENTER: startGame(); break;
                    }
                    if (e.getCode() != KeyCode.ENTER) {
            if (checkLetterIsNotInWord(word, letter)) {
                        pane.getChildren().add(listShape.removeFirst()); //letter is not in the word
                pane.getChildren().remove(textMissedLetters);
                textMissedLetters.setText(textMissedLetters.getText() + letter);
                pane.getChildren().add(textMissedLetters);
                if (listShape.isEmpty()) {
                    pane.getChildren().remove(textMissedLetters);
                    textMissedLetters.setText("To continue the game, press ENTER");
                    pane.getChildren().add(textMissedLetters);
                }
            }
            if (checkIsLetterInWord(word, letter)) {
                pane.getChildren().remove(textOfWord);
                textOfWord.setText(getEncryptWord());
                pane.getChildren().add(textOfWord);
                if (wordKnown()) {
                    pane.getChildren().remove(textMissedLetters);
                    textMissedLetters.setText("YOU WIN to continue the game, press ENTER");
                    pane.getChildren().add(textMissedLetters);
                }
            } }
        });

        pane.getChildren().addAll(arc, line1, line2, textGuessAWord, textOfWord);

        return pane;
    }

    /** Main method */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place the pane in the stage
        Scene scene = new Scene(getPane(), 500, 400);
        primaryStage.setTitle("HangingMan"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        startGame();
        System.out.println("Game start");
        pane.requestFocus(); // pane is focused to receive key input
    }

    /** Start the game */
    public void startGame() {
        word = words[(int)(Math.random() * 7)];
        encrypt = new String[word.length()];
        for (int i = 0; i < encrypt.length; i++) {
            encrypt[i] = "*";
        }

        pane.getChildren().remove(line3);
        pane.getChildren().remove(circle);
        pane.getChildren().remove(line4);
        pane.getChildren().remove(line5);
        pane.getChildren().remove(line6);
        pane.getChildren().remove(line7);
        pane.getChildren().remove(line8);


        listShape.clear();
        listShape.add(line3);
        listShape.add(circle);
        listShape.add(line4);
        listShape.add(line5);
        listShape.add(line6);
        listShape.add(line7);
        listShape.add(line8);

        pane.getChildren().remove(textOfWord);
        textOfWord.setText(getEncryptWord());
        pane.getChildren().add(textOfWord);

        textMissedLetters.setText("Missed letters: ");
        pane.getChildren().remove(textMissedLetters);
    }

    /** Get encrypt word */
    public String getEncryptWord() {
        String wordEncrypt = "";

        for (int i = 0; i < encrypt.length; i++) {
            wordEncrypt = wordEncrypt + encrypt[i];
        }

        return wordEncrypt;
    }

    /** Check the letter in word */
    public boolean checkIsLetterInWord(String word, String letter) {
        boolean flag = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                flag = true;
                encrypt[i] = letter;
            }
        }

        return flag;
    }

    /** Check the letter is not in the word */
    public static boolean checkLetterIsNotInWord(String word, String letter) {
        boolean flag = true;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                flag = false;
            }
        }

        return flag;
    }

    /** Is word guessed right? */
    public boolean wordKnown() {
        boolean flag = true;

        for (int i = 0; i < encrypt.length; i++) {
            if (encrypt[i].equals("*"))
                flag = false;
        }

        return flag;
    }

}


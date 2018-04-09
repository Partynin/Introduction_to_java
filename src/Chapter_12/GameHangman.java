package Chapter_12;

import java.io.File;
import java.util.Scanner;

public class GameHangman {

    private static Scanner scanner = new Scanner(System.in);
    private static String[] words;
    private static String word;
    private static String[] encrypt;
    private static int arrayLength;

    /** Main method */
    public static void main(String[] args) {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println("java GameHangman.java hangman.txt");
            System.exit(11);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(12);
        }

        try (Scanner scanner = new Scanner(sourceFile)) {
            while (scanner.hasNext()) {
                String s = scanner.next();
                arrayLength++;
            }
            words = new String[arrayLength];
            int i = 0;
            while (scanner.hasNext()) {
                String s = scanner.next();
                words[i] = scanner.next();
                i++;
                System.out.println(s + i);
            }
        } catch (Exception ex) {
            System.out.println("Scanner don't work!");
            System.exit(14);
        }

        words = new String[arrayLength];

        try (Scanner scanner2 = new Scanner(sourceFile)) {
            int i = 0;
            while (scanner2.hasNext()) {
                words[i] = scanner2.next();
                i++;
            }
        } catch (Exception ex) {
            System.out.println("Scanner 2 don't work!");
            System.exit(14);
        }


        startGame();
    }

    /** Start the game */
    public static void startGame() {
        word = words[(int)(Math.random() * arrayLength)];
        encrypt = new String[word.length()];
        for (int i = 0; i < encrypt.length; i++) {
            encrypt[i] = "*";
        }

        boolean wordNotFortunate = true;
        String letter;
        int countMiss = 0;

        while (wordNotFortunate) {
            System.out.print("Enter a letter in word " + getEncryptWord()
                    + " > ");
            letter = scanner.nextLine();
            if (checkLetterIsNotInWord(word, letter)) {
                System.out.println(letter + " is not in the word");
                countMiss++;
                continue;
            }
            if (checkIsLetterAlreadyInWord(encrypt, letter)) {
                System.out.println(letter + " is already in the word");
                countMiss++;
                continue;
            }
            if (checkIsLetterInWord(word, letter)) {
                if (wordKnown())
                    wordNotFortunate = false;
                continue;
            }
        }

        System.out.println("The word is " + word + ". You missed " + countMiss +
                " time.\nDo you want to guess another word? " +
                "Enter y or n");

        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equals("y")) {
            startGame();
        }

    }

    /** Get encrypt word */
    public static String getEncryptWord() {
        String wordEncrypt = "";

        for (int i = 0; i < encrypt.length; i++) {
            wordEncrypt = wordEncrypt + encrypt[i];
        }

        return wordEncrypt;
    }

    /** Check the letter in word */
    public static boolean checkIsLetterInWord(String word, String letter) {
        boolean flag = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                flag = true;
                encrypt[i] = letter;
            }
        }

        return flag;
    }


    /** Check this letter already in the word? */
    public static boolean checkIsLetterAlreadyInWord(String[] encrypt, String letter) {
        boolean flag = false;

        for (int i = 0; i < encrypt.length; i++) {
            if (encrypt[i].equals(letter)) {
                flag = true;
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
    public static boolean wordKnown() {
        boolean flag = true;

        for (int i = 0; i < encrypt.length; i++) {
            if (encrypt[i].equals("*"))
                flag = false;
        }

        return flag;
    }
}

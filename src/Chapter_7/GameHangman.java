package Chapter_7;

import java.util.Scanner;

public class GameHangman {

    private static Scanner scanner = new Scanner(System.in);
    private static String[] words = {"write", "man", "watermelon", "dick",
            "pussy", "dude", "boobs"};
    private static String word;
    private static String[] encrypt;

    /** Main method */
      public static void main(String[] args) {
          startGame();
      }

      /** Start the game */
      public static void startGame() {
          word = words[(int)(Math.random() * 7)];
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

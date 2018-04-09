package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 14.06.2017.
 */
public class GamePickACards {
    private static String s;
    private static String c;

    public static void main(String[] args) {
        int card = (int)(Math.random() * 13);
        int suit = (int)(Math.random() * 4);

        switch (suit){
            case 0 : s = "Club";break;
            case 1 : s = "Diamond";break;
            case 2 : s = "Heart";break;
            case 3 : s = "Spade";
        }

        switch (card){
            case 0 : c = "Ace";break;
            case 1 : c = "2";break;
            case 2 : c = "3";break;
            case 3 : c = "4";break;
            case 4 : c = "5";break;
            case 5 : c = "6";break;
            case 6 : c = "7";break;
            case 7 : c = "8";break;
            case 8 : c = "9";break;
            case 9 : c = "10";break;
            case 10 : c = "Jack";break;
            case 11 : c = "Queen";break;
            case 12 : c = "King";
        }
        System.out.println("The card you  picked is " + c + " of " + s);
    }
}

package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class SoryCharactersInAString {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string ");
        String s = scanner.nextLine();

        System.out.println(sort(s));
    }

    /** Returns a sorted string */
    public static String sort(String s) {
        String sortSt = "";

        char[] arrayCh = s.toCharArray();
        Arrays.sort(arrayCh);
        //sortSt =  Arrays.toString(arrayCh);

        for (int i = 0; i < arrayCh.length; i++) {
            sortSt = sortSt + Character.toString(arrayCh[i]);
        }

        return sortSt;
    }
}

package Chapter_18;

import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacterInAString_Exe18_10 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.print("Enter a char: ");
        String strChar = input.nextLine();
        char a = strChar.charAt(0);

        System.out.println("Occurrences char " + a + " in the string " + str + " is " +
        count(str, a));
    }

    public static int count(String str, char a) {
        int n =  (a == str.charAt(0)) ? 1 : 0;
        if (str.length() == 1)
            return n;
        else
            return n + count(str.substring(1), a);
    }

}

package Chapter_18;

import java.util.Scanner;

public class FindTheNumberOfUppercaseLettersInAString_Exe18_14 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println("The count of uppercase litter in the string " + str + " is " +
        uppercaseLetters(str));
    }

    public static int uppercaseLetters(String str) {
       return uppercaseLetters(str, 0);
    }

    public static int uppercaseLetters(String str, int index) {
        int n =  (Character.isUpperCase(str.charAt(index))) ? 1 : 0;
        if (str.length() == 1)
            return n;
        else
            return n + uppercaseLetters(str.substring(1), index);
    }
}

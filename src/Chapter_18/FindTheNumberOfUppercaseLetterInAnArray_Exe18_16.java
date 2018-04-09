package Chapter_18;

import java.util.Scanner;

public class FindTheNumberOfUppercaseLetterInAnArray_Exe18_16 {
    public static void main(String[] args) {
        System.out.print("Enter a string character: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        System.out.println("The count of uppercase letter is " + count(chars));
    }

    public static int count(char[] chars) {
       return count(chars, chars.length - 1);
    }

    public static int count(char[] chars, int high) {
        int x = (Character.isUpperCase(chars[high]) ? 1 : 0);
        if (high == 0)
            return x;
        else return x + count(chars, high - 1);
    }
}

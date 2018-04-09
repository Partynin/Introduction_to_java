package Chapter_18;

import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacterInAnArray_Exe18_17 {
    public static void main(String[] args) {
        System.out.print("Enter a list of characters: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.print("Enter a character: ");
        String ch = input.nextLine();

        char[] chars = str.toCharArray();

        System.out.println("Occurrences of the " + ch + " in the list " + str + " is " +
        count(chars, ch.charAt(0)));
    }

    public static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    public static int count(char[] chars, char ch, int high) {
        int n = ((chars[high] == ch) ? 1 : 0);
        if (high == 0)
            return n;
        else return n + count(chars, ch, high - 1);
    }
}

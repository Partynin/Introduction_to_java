package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 08.05.2017.
 */
public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.println("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60; //Find minutes in seconds
        int remainingSeconds = seconds % 60; // Seconds remaining
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}

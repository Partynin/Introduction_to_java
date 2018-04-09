package Chapter_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/** **20.8 (Game: lottery) Revise Programming Exercise 3.15 to add an additional $2,000
 award if two digits from the user input are in the lottery number. (Hint: Sort
 the three digits in the lottery number and three digits in the user input into two
 lists, and use the Collection’s containsAll method to check whether the
 two digits in the user input are in the lottery number.) */

public class GameLottery_Exe20_8 {
    public static void main(String[] args) {
        // Generate a lottery number
        int lottery =123; //(int)(Math.random() * 1000);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery / 10) % 10;
        int lotteryDigit3 = lottery % 10;
        List<Integer> listLottery = new ArrayList<>();
        listLottery.add(lotteryDigit1);
        listLottery.add(lotteryDigit2);
        listLottery.add(lotteryDigit3);
        Collections.sort(listLottery);

        // Get digits from guess
        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess / 10) % 10;
        int guessDigit3 = guess % 10;
        List<Integer> listGuess = new ArrayList<>();
        listGuess.add(guessDigit1);
        listGuess.add(guessDigit2);
        listGuess.add(guessDigit3);
        Collections.sort(listGuess);

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (listLottery.containsAll(listGuess))
            System.out.println("Match all digits: you win &3,000");
        else if (listLottery.containsAll(listGuess.subList(0, 2)) || // subList returns a sublist from fromIndex to toIndex-1.
                listLottery.containsAll(listGuess.subList(1, 3)) || (listLottery.contains(listGuess.get(0)) &&
        listLottery.contains(listGuess.get(2))))
            System.out.println("Mach two digit: you win $2,000");
        else if (listLottery.contains(listGuess.get(0)) || listLottery.contains(listGuess.get(1)) ||
                listLottery.contains(listGuess.get(2)))
            System.out.println("Mach one digit: you win $1,000");
        else System.out.println("Sorry, no match");
    }
}

package Chapter_20;

import java.util.*;

/** *20.3 (Guessing the capitals) Rewrite Programming Exercise 8.37 to store the pairs
 of states and capitals so that the questions are displayed randomly. */

public class GuessingTheCapitals_Exe20_3 {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] array = {{"Alabama", "Montgomery"}, {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"}, {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
                {"Colorado", "Denver"}, {"Connecticut", "Hartford"}, {"Delaware", "Dover"},
                {"Idaho", "Boise"}, {"Illinois", "Springfield"},
                {"Florida", "Tallahassee"}, {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"},
                {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"}, {"Louisiana", "Baton Rouge"},
                {"Mine", "Augusta"}, {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"}, {"Michigan", "Lansing"},
                {"Minnesota", "Saint Paul"}, {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"}, {"Montana", "Helena"},
                {"Nebraska", "Lincoln"}, {"Nevada", "Carson City"},
                {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
                {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "bismarck"}, {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"}, {"Texas", "Austin"},
                {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"}, {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"}, };
        int count = 0;

        List<String[]> list;
        list = Arrays.asList(array);
        Collections.shuffle(list);
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("What is the capital of " + array[i][0] + "? ");
            String answer = scanner.nextLine();
            if (isCorrect(array[i][1], answer)) {
                System.out.println("Your answer is correct");
                count++;
            }
            else {
                System.out.println("The correct answer should be " +
                        array[i][1]);
            }
        }
        System.out.println("The correct countPosition is " + count);
    }

    /** Check whether the answer is correct */
    public static boolean isCorrect(String capital, String answer) {
        if (capital.toLowerCase().equals(answer.toLowerCase()))
            return true;

        return false;
    }
}

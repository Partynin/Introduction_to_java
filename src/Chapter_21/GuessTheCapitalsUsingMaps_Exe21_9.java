package Chapter_21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** **21.9 (Guess the capitals using maps) Rewrite Programming Exercise 8.37 to store
 pairs of each state and its capital in a map. Your program should prompt the user
 to enter a state and should display the capital for the state. */

public class GuessTheCapitalsUsingMaps_Exe21_9 {
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

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i][0], array[i][1]);
        }

        System.out.print("Enter a state : ");
        String state = scanner.nextLine();
        if (map.containsKey(state)) {
            System.out.println("Capital of state " + state + " is " + map.get(state));
        } else System.out.println("Your enter wrong.");
    }
}

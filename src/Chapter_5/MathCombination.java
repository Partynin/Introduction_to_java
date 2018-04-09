package Chapter_5;

/**
 * Created by Kos on 15.07.2017.
 */
public class MathCombination {
    public static void main(String[] args) {
        int combination = 0;
        int number = 1;
        do {
            for (int i = 1; i <= 7; i++) {
                System.out.println(number + " " + i);
                combination++;
            }
            number++;
        } while (number <= 7);
        System.out.println("The total number oll combination is " + combination);

        int counter = 0;
        for (int i = 1; i < 8; i++){
            for (int j = i + 1; j < 8; j++) {
                System.out.println(i + " " + j);
                counter++;
            }
        }

        System.out.println("Total combination: " + counter);
    }
}

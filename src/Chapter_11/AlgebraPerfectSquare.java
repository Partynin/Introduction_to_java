package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgebraPerfectSquare {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = scanner.nextInt();
        int m1 = m;
        ArrayList<Integer> smallestFactors = new ArrayList<>();

        // This loop for finding and add smallest factors
        for (int i = 2; i <= m; i++) {
            while(m % i == 0) {
                smallestFactors.add(i);
                m = m/i;
            }
        }

        System.out.println(smallestFactors);

        ArrayList<Integer> listOfMultiple = new ArrayList<>();

        do {
            int count = 0;
            int temp = smallestFactors.get(0);
            for (int i = 0; i < smallestFactors.size(); i++) {
                if (smallestFactors.get(i) == temp)
                    count++;
            }
            if (count % 2 != 0)
                listOfMultiple.add(temp);

            deleteAllTheseElement(temp, smallestFactors);
        } while (!smallestFactors.isEmpty());


        System.out.println(listOfMultiple);

        System.out.println("The smallest number n for m * n to be a perfect square is " +
        multipleArrayList(listOfMultiple));
        System.out.println("m * n is " + m1 * multipleArrayList(listOfMultiple));
    }

    /** Delete all this element in the ArrayList */
    public static void deleteAllTheseElement(int el, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == el) {
                list.remove(i);
                i--;
            }
        }
    }

    /** Multiple all elements in the ArrayList */
    public static double multipleArrayList(ArrayList<Integer> list) {
        double result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = result * list.get(i);
        }
        return result;
    }
}

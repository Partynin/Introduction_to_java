package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 13.06.2017.
 */
public class ComputeThePerimeterOfATriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter free edges for a triangle: ");
        double edges1 = scanner.nextDouble();
        double edges2 = scanner.nextDouble();
        double edges3 = scanner.nextDouble();

        if (edges1 + edges2 >= edges3 && edges1 + edges3 >= edges2 &&
                edges2 + edges3 >= edges1){
            System.out.println("The perimeter = " + (edges1 + edges2 + edges3));
        }
        else System.out.println("Input is invalid.");
    }
}

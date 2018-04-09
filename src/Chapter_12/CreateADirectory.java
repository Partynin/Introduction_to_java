package Chapter_12;

import java.io.File;
import java.util.Scanner;

public class CreateADirectory {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a directory name: ");
        String dirName = scanner.nextLine();

        File dir = new File(dirName);
        if (dir.mkdir()) {
            System.out.println("Directory created successfully");
        } else System.out.println("Directory already exists");
    }
}

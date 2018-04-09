package Chapter_12;

import java.net.URL;
import java.util.Scanner;

public class ProcessLargeDataset {
    private static double totalSalaryAssistant = 0;
    private static double totalSalaryAssociate = 0;
    private static double totalSalaryFull = 0;
    private static double commonAmount = 0;
    private static int countEmployees = 0;
    private static int countAssistant = 0;
    private static int countAssociate = 0;
    private static int countFull = 0;

    /** Main method */
    public static void main(String[] args) {

        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                commonAmount += getSalary(s);
                countEmployees++;
                computeSalary(s);
            }
        } catch (Exception ex) {
            System.out.println("URL do not work!");
            ex.printStackTrace();
        }

        System.out.println("Salary for all faculty is " + String.format("%8.2f", commonAmount));
        System.out.println("Average salary for all faculty is " +
                String.format("%8.2f", commonAmount / countEmployees));
        System.out.println("Total salary for assistant professors is " +
                String.format("%8.2f", totalSalaryAssistant));
        System.out.println("Average salary for assistant professors is " +
                String.format("%8.2f", totalSalaryAssistant / countAssistant));
        System.out.println("Total salary for associate professors is " +
                String.format("%8.2f", totalSalaryAssociate));
        System.out.println("Average salary for associate professors is " +
                String.format("%8.2f", totalSalaryAssociate / countAssociate));
        System.out.println("Total salary for full professors is " +
                String.format("%8.2f", totalSalaryFull));
        System.out.println("Average salary for full professors is " +
                String.format("%8.2f", totalSalaryFull / countFull));
    }

    /** Get forth string with salary from the string */
    public static double getSalary(String s) {
        String[] strings = s.split(" ");
        double salary = Double.valueOf(strings[3]);
        return salary;
    }

    /** Compute salary for assistant professors, associate professors, full professors */
    public static void computeSalary(String s) {
        String[] strings = s.split(" ");
        if (strings[2].equals("assistant")) {
            totalSalaryAssistant += Double.valueOf(strings[3]);
            countAssistant++;
        } else if (strings[2].equals("associate")) {
            totalSalaryAssociate += Double.valueOf(strings[3]);
            countAssociate++;
        } else {
            totalSalaryFull += Double.valueOf(strings[3]);
            countFull++;
        }
    }
}

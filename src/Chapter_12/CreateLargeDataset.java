package Chapter_12;

import java.io.File;
import java.io.PrintWriter;

public class CreateLargeDataset {
    /** Main method */
    public static void main(String[] args) {
        File file = new File("DataSet.txt");
        String lineSeparator = System.lineSeparator(); // Получаем разделитель строк для нашей системы
        try (
                PrintWriter printWriter = new PrintWriter(file)
                ) {
            for (int i = 1; i <= 1000; i++) {
                printWriter.print("FirstName" + i + " LastName" + i + " " +
                        professionAndSalary() + lineSeparator);
            }
        } catch (Exception ex) {
            System.out.println("PrintWriter don't work!");
            ex.printStackTrace();
        }
    }

    /** Random profession and salary */
    public static String professionAndSalary() {
        int rank = (int)(1 + (Math.random() * 3));

        String s1 = "assistant";
        String s2 = "associate";
        String s3 = "full";
        String s = "";

        if (rank == 1) {
            s = s1 + " " + String.format("%8.2f", 50000 + Math.random() * 30000);
        } else if (rank == 2) {
            s = s2 + " " + String.format("%8.2f", 60000 + Math.random() * 50000);
        } else s = s3 + " " + String.format("%8.2f", 75000 + Math.random() * 60000);

        return s;
    }
}

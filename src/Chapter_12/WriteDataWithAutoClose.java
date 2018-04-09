package Chapter_12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        try (
                // Create a file
                PrintWriter output = new PrintWriter(file)
                ) {
            // Write formatted output to the file
             output.print("John T Smith ");
             output.println(90);
             output.print("Eric K Jones ");
             output.println(85);
        }
    }
}

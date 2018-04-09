package Chapter_17;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateATextFile_Exe17_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("Exercise17_01.txt");

        try (
                PrintWriter print = new PrintWriter(file)
                ) {
            for (int i = 0; i < 100; i++) {
                print.write(((int) (Math.random() * Integer.MAX_VALUE)) + " ");
            }
        }
    }
}

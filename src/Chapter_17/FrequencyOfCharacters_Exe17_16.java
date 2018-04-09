package Chapter_17;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FrequencyOfCharacters_Exe17_16 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the name of an ASCII file as FileForEncrypt.dat: ");
        Scanner input = new Scanner(System.in);
        String nameFile = input.nextLine();

        File file = new File(nameFile);
        if (!file.exists()) {
            System.out.println("File " + nameFile + " does not exist!");
            System.exit(1);
        }

        int[] ascii = new int[128];
        try (
                BufferedInputStream fileInput = new
                        BufferedInputStream(new FileInputStream(file))
                ) {
            int frequency;
            while ((frequency = fileInput.read()) != -1)
                ascii[frequency]++;
        }

        // Display result
        System.out.printf("%10s %10s %10s\n", "Character", "ASCII code", "Frequency");
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] != 0)
            System.out.printf("%10c %10d %10d\n", i, i, ascii[i]);
        }
    }
}

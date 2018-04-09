package Chapter_17;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ViewBits_Exe17_18 {
    public static void main(String[] args) {
        System.out.print("Enter a file name as Exercise17_18.dat: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();

        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("The file " + fileName + " doesn't exist!");
            System.exit(1);
        }

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))
                ) {
            int value;
            while ((value = bis.read()) != -1)
                System.out.println(getBits(value));
        } catch (IOException ex) {
            System.out.println("We have a problem with I/O file");
            ex.printStackTrace();
        }
    }

    public static String getBits(int value) {
        String byteRepresentation = "";

        for (int i = 7; i >= 0; i--) {
            byteRepresentation += (value >> i) & 1;
        }

        return byteRepresentation;
    }
}

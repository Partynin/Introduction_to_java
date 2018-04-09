package Chapter_17;

import java.io.*;
import java.util.Scanner;

public class EncryptFile_Exe17_14 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name for encrypting as FileForEncrypt.txt: ");
        String fileForEncrypting = input.nextLine();
        System.out.println("Enter file name for output as FileForEncrypt1.txt: ");
        String fileOutput = input.nextLine();

        // Check if source file exists
        File filesSource = new File(fileForEncrypting);
        if (!filesSource.exists()) {
            System.out.println("Source file " + fileForEncrypting + " does not exist");
            System.exit(1);
        }

        File fileOut = new File(fileOutput);

        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(filesSource));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileOut))
                ) {
                int buffer;
                while ((buffer = in.read()) != -1) {
                    out.write(buffer + 5);
            }
            System.out.println("Encrypted file saved");
        }
    }
}

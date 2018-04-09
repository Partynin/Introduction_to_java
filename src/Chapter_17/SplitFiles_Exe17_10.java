package Chapter_17;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SplitFiles_Exe17_10 {
    public static void main(String[] args) {
        // Check command-line parameter usage
         if (args.length != 2) {
             System.out.println(
                     "Usage: java SplitFiles_Exe17_10 SourceFile numberOfPieces");
             System.exit(1);
             }

        // Check if source file exists
         File sourceFile = new File(args[0]);
         if (!sourceFile.exists()) {
             System.out.println("Source file " + args[0]
                     + " does not exist");
             System.exit(2);
         }

         int numberOfFiles = Integer.parseInt(args[1]);

        RandomAccessFile[] files = new RandomAccessFile[numberOfFiles];

        try (
                RandomAccessFile rafSource = new RandomAccessFile(sourceFile, "r")
                ) {
            for (int i = 0; i < files.length; i++) {
                files[i] = new RandomAccessFile("SourceFile." + (i + 1), "rw");
            }

            int lengthSourceFile = Math.round (rafSource.length() / numberOfFiles);

            long pos = 0;
            byte[] b;

            for (int i = 0; i < numberOfFiles - 1; i++) {
                rafSource.seek(pos);
                b = new byte[lengthSourceFile];
                rafSource.read(b);
                files[i].write(b);
                pos += lengthSourceFile;
            }
            rafSource.seek(pos);
            b = new byte[(int)(rafSource.length() - pos)];
            rafSource.read(b);
            files[numberOfFiles - 1].write(b);
        } catch (IOException ex) {
            System.out.println("We have problem!");
            ex.printStackTrace();
        }
    }
}

package Chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
Suppose you have Java source files under the directories
        chapter1, chapter2, . . . , chapter34. Write a program to insert the
        statement package chapteri; as the first line for each Java source file under
        the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
        are under the root directory srcRootDirectory. The root directory and
        chapteri directory may contain other folders and files. Use the following
        command to run the program:
        java Exercise12_18 srcRootDirectory

 Кажется я не совсем правильно понял задание !?
*/

public class AddPackageStatement {
    /** Main method */
    public static void main(String[] args) {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println("Usage: java AddPackageStatement srcRootDirectory");
            System.exit(11);
        }

        String stringForWritten = "package " + args[0] + ";";

        File mainDir = new File(args[0]); // Создаем путь к папке
        if (!mainDir.isDirectory()) {     // Проверяем сушествует ли папка
            System.out.println(mainDir.getAbsolutePath());  // Если папки нет выводим полную указанную дирректорию
            System.out.println(mainDir + " is not a directory.");
            System.exit(12);
        }

        File[] mainDirFiles = mainDir.listFiles(); // Returns the files under the directory for a directory File object
        if (mainDirFiles.length == 0) {
            System.out.println("Dir " + args[0] + " don't has any files");
            System.exit(13);
        }

        System.out.println(mainDirFiles);

        ArrayList<File> fileArrayList = new ArrayList<>();
        for (int i = 0; i < mainDirFiles.length; i++) {
            if (mainDirFiles[i].getName().contains(args[0]))
                fileArrayList.add(mainDirFiles[i]);
        }

        System.out.println(fileArrayList);

        if (fileArrayList.isEmpty()) {
            System.out.println(args[0] + "does't have any package files");
            System.exit(14);
        }

        for (File f: fileArrayList) {
            insertTheStatement(f, stringForWritten);
        }
    }

    /** Method to insert the statement into the file */
    public static void insertTheStatement(File file, String stringForWritten) {
        String lineSeparator = System.lineSeparator(); // Получаем разделитель строк для нашей системы
        String packedSting = stringForWritten;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                if (s.equals(packedSting)) {
                    System.out.println("File: " + file + " already has package "  + stringForWritten);
                    return;
                }
                else packedSting += lineSeparator + s;

            }
        } catch (Exception ex) {
            System.out.println("Scanner in insertTheStatement method do not work!");
            System.exit(17);
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print(packedSting);
        } catch (Exception ex) {
            System.out.println("PrintWriter do not work!");
            System.exit(18);
        }
    }
}

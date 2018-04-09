package Chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RemovePackageStatement {
    /** Main method */
    public static void main(String[] args) {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println("Usage: java RemovePackageStatement srcRootDirectory");
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

        ArrayList<File> fileArrayList = new ArrayList<>();
        for (int i = 0; i < mainDirFiles.length; i++) {
            if (mainDirFiles[i].getName().contains(args[0]))
                fileArrayList.add(mainDirFiles[i]);
        }

        if (fileArrayList.isEmpty()) {
            System.out.println(args[0] + "does't have any package files");
            System.exit(14);
        }

        for (File f: fileArrayList) {
            removeTheStatement(f, stringForWritten);
        }
    }

    /** Method to remove the statement into the file */
    public static void removeTheStatement(File file, String stringForRemove) {
        String lineSeparator = System.lineSeparator(); // Получаем разделитель строк для нашей системы
        String packedSting = stringForRemove;
        String sPack = "";

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                if (s.equals(packedSting)){

                }
                else sPack += lineSeparator + s;
            }
        } catch (Exception ex) {
            System.out.println("Scanner in insertTheStatement method do not work!");
            System.exit(17);
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print(sPack);
        } catch (Exception ex) {
            System.out.println("PrintWriter do not work!");
            System.exit(18);
        }
    }
}

package Chapter_21;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** **21.3 (Count the keywords in Java source code) Revise the program in Listing 21.7. If
 a keyword is in a comment or in a string, don’t count it. Pass the Java file name
 from the command line. Assume that the Java source code is correct and line
 comments and paragraph comments do not overlap. */

public class CountTheKeywordsInJavaSourceCode_Exe21_3 {
    /** Main method */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String filename = input.nextLine();

        File file = new File(filename);
        if (file.exists()) {
            System.out.println("The number of keywords in " + filename
                    + " is " + countKeywords(file));
        } else {
            System.out.println("File " + filename + " dose not exist");
        }
    }

    public static int countKeywords(File file) throws Exception {
        // Array of all Java keywords + true, false and null
        String[] keywordString = {"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"};

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;

        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String word = input.next();

            if (word.contains("//"))
                input.nextLine();
            else if (word.contains("\"")) {
                String wordInString;
                do {
                    wordInString = input.next();
                } while (!wordInString.contains("\""));
            } else if (word.contains("/*")) {
                String wordInComment;
                do {
                    wordInComment = input.next();
                } while (!wordInComment.contains("*/"));
            }

            if (keywordSet.contains(word))
                count++;
        }

        return count;
    }
}

package Chapter_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** ***21.5 (Syntax highlighting) Write a program that converts a Java file into an HTML
 file. In the HTML file, the keywords, comments, and literals are displayed in
 bold navy, green, and blue, respectively. Use the command line to pass a Java file
 and an HTML file. For example, the following command
 java Exercise21_05 Welcome.java Welcome.html */

public class SyntaxHighlighting_Exe21_5 {
    /** Main method */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Use: java Exercise21_05 Welcome.java Welcome.html");
            System.exit(10);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("File " + args[0] + " don't find");
            System.exit(20);
        }

        File targetFile = new File(args[1]);

        converts(sourceFile, targetFile);
    }

    public static String changeQuote(String word) {
        String wordWithHTML = "";
        boolean flag = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '\"' && flag) {
                wordWithHTML = wordWithHTML + "<span style=color:blue;>\"";
                flag = false;
            } else if (word.charAt(i) == '\"' && !flag) {
                wordWithHTML += "\"</span>";
            }
            else wordWithHTML += word.charAt(i);
        }

        return wordWithHTML;
    }

    public static String changeSingleQuote(String word) {
        String wordWithHTML = "";
        boolean flag = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '\'' && flag) {
                wordWithHTML = wordWithHTML + "<span style=color:blue;>\'";
                flag = false;
            } else if (word.charAt(i) == '\'' && !flag) {
                wordWithHTML += "\'</span>";
            }
            else wordWithHTML += word.charAt(i);
        }

        return wordWithHTML;
    }

    private static void converts(File sourceFile, File targetFile) {
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

        try(
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile)
        ) {
            while (input.hasNext()) {
                String stringForWriting = input.nextLine();
                stringForWriting = stringForWriting.replaceAll("\t", "&emsp; ");

                if (stringForWriting.contains("//")) {
                    stringForWriting = "<span style=color:#228b22;>" + stringForWriting
                            + " </span>";
                    output.write(stringForWriting + "<br>");
                    continue;
                }

                if (stringForWriting.contains("/*")) {
                    while (!stringForWriting.contains("*/")); {
                        stringForWriting = "<span style=color:#228b22;>" + stringForWriting
                                + " </span>";
                        output.write(stringForWriting + "<br>");
                        stringForWriting = input.nextLine();
                    }
                    stringForWriting = "<span style=color:#228b22;>" + stringForWriting
                            + " </span>";
                    output.write(stringForWriting + "<br>");
                    continue;
                }

                if (stringForWriting.contains("\"")) {
                    Scanner scanner1 = new Scanner(stringForWriting);
                    String stringWithHTML = "";
                    boolean flag = true;

                    while (scanner1.hasNext()) {
                        String word = scanner1.next();
                        if (word.matches("\"[\\w|\\W]*\"[\\W|\\w]*")) {
                            word = changeQuote(word);
                        } else if (word.contains("\"") && flag) {
                            word = word.replace("\"",
                                    "<span style=color:blue;>\"");
                            flag = false;
                        } else if (word.contains("\"") && !flag) {
                            word = word.replace("\"", "\"</span>");
                            flag = true;
                        }
                        stringWithHTML = stringWithHTML + word + " ";
                    }

                    output.write(stringWithHTML + "<br>");
                    continue;
                }

                if (stringForWriting.contains("\'")) {
                    Scanner scanner1 = new Scanner(stringForWriting);
                    String stringWithHTML = "";
                    boolean flag = true;

                    while (scanner1.hasNext()) {
                        String word = scanner1.next();
                        if (word.matches("\'[\\w|\\W]*\'[\\W|\\w]*")) {
                            word = changeSingleQuote(word);
                        } else if (word.contains("\'") && flag) {
                            word = word.replace("\'",
                                    "<span style=color:blue;>\'");
                            flag = false;
                        } else if (word.contains("\'") && !flag) {
                            word = word.replace("\'", "\'</span>");
                            flag = true;
                        }
                        stringWithHTML = stringWithHTML + word + " ";
                    }

                    output.write(stringWithHTML + "<br>");
                    continue;
                }


                Scanner scanner = new Scanner(stringForWriting);
                String word = "";
                String wordWithHTML = "";
                while (scanner.hasNext()) {
                    word = scanner.next();
                    if (keywordSet.contains(word)) {
                        wordWithHTML = "<b><span style=color:#1e90ff;>" + word + " </span></b>";
                        stringForWriting = stringForWriting.replace(word, wordWithHTML);
                    }
                }

                output.write(stringForWriting + "<br>");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("We have problem!");
            ex.printStackTrace();
        }
    }
}

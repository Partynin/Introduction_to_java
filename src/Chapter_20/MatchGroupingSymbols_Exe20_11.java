package Chapter_20;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/** *20.11 (Match grouping symbols) A Java program contains various pairs of grouping
 symbols, such as:
 ■ Parentheses: ( and )
 ■ Braces: { and }
 ■ Brackets: [ and ]
 Note that the grouping symbols cannot overlap. For example, (a{b)} is illegal.
 Write a program to check whether a Java source-code file has correct pairs of
 grouping symbols. Pass the source-code file name as a command-line argument. */

public class MatchGroupingSymbols_Exe20_11 {
    public static void main(String[] args) {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println(
                    "Usage: java MatchGroupingSymbols_Exe20_11 sourceFile"
            );
            System.exit(1);
        }

        // Check if source file exist
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " dose not exist");
            System.exit(2);
        }

        Stack<String> stack = new Stack<>();
        ArrayList<String> symbols = new ArrayList<>();
        Collections.addAll(symbols, "(", ")", "{", "}", "[", "]");
        try(BufferedReader input = new BufferedReader(new InputStreamReader(
                new FileInputStream(sourceFile)))) {
            String s;
            while ((s = input.readLine()) != null) {

                for (char c : s.toCharArray()) {
                    String symbol = c + "";
                    int symbolIndex = symbols.indexOf(symbol);

                    if (symbolIndex == -1)
                        continue;

                    if (stack.size() == 0) {
                        stack.push(symbol);
                    } else {
                        int lastIndex = symbols.indexOf(stack.peek());
                        if (symbolIndex - 1 == lastIndex) {
                            stack.pop();
                        } else {
                            if ((lastIndex & 1) == 1)
                                System.out.println("ERROR at:" + s);
                            stack.push(symbol);
                        }
                    }

                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO error.");
            e.printStackTrace();
        }

    }
}

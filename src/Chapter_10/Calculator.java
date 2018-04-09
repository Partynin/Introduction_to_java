package Chapter_10;

public class Calculator {
    /** Main method */
public static void main(String[] args) {
    String temp = "";
    for (String s : args) {
        temp += s;
    }
    // Check number of strings passed
    args = MyString1.split(temp, "[+-/*]");
    if (args.length != 3) {
        System.out.println(
                "Usage: java Calculator operand1 operator operand2");
        System.exit(0);
    }

    // The result of the operation
    int result = 0;

    // String[] array = MyString1.split()
    // Determine the operator
    switch (args[1].charAt(0)) {
        case '+':
            result = Integer.parseInt(args[0]) +
                    Integer.parseInt(args[2]);
            break;
        case '-':
            result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
            break;
        case '*':
            result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
            break;
        case '/':
            result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
    }

    // Display result
    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
            + " = " + result);
}
}

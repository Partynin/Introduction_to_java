package Chapter_12;

public class NumberFormatException {
    /** Main method */
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        // The result of the operation
        int result = 0;

        if (!isNumberInt(args[0])) {
            System.out.println("Wrong Input: " + args[0]);
            System.exit(1);
        }
        if (!isNumberInt(args[2])) {
            System.out.println("Wrong Input: " + args[2]);
            System.exit(1);
        } else {
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
                case '.':
                    result = Integer.parseInt(args[0]) *
                            Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) /
                            Integer.parseInt(args[2]);

                    // Display result
                    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
            }
        }
    }

    /** Check this String is number int */
    public static boolean isNumberInt(String s) {
        try {
            new Integer(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    /*public static boolean isNumeric(String s) {
        for (char ch : s.toCharArray()) {
            if (ch < '0' || ch > '9') return false;
        }
        return true;
    }*/
}

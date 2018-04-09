package ToolKit;


public class ReversString {
    public static void main(String[] args) {
        System.out.println(new ReversString().reversString("Mother"));

        System.out.println(reversString1("Father"));

        String newString = new StringBuilder("Sister").reverse().toString();
        System.out.println(newString);
    }

    public String reversString(String inputString) {
        String rightPart;
        String leftPart;

        int length = inputString.length();

        if (length <= 1)
            return inputString;

        leftPart = inputString.substring(0, length / 2);
        rightPart = inputString.substring(length / 2, length);

        return reversString(rightPart) + reversString(leftPart);
    }

    public static String reversString1(String s) {
        String s1 = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }

        return s1;
    }
}

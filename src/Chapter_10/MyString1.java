package Chapter_10;

import java.util.ArrayList;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        // If you don't clone the array, the data will remain available
        // outside the class.
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, chars, 0, chars.length);
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] chars1 = new char[end - begin];
        for (int i = 0; i < chars1.length; i++) {

            chars1[i] = chars[begin + i];
        }

        MyString1 s = new MyString1(chars1);

        return s;
    }

    public MyString1 toLowerCase() {
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars1.length; i++) {
            chars1[i] = Character.toLowerCase(chars[i]);
        }

        MyString1 s = new MyString1(chars1);

        return s;
    }

    public boolean equals(MyString1 s) {
        if (s.length() != chars.length)
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != chars[i])
                return false;
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        char[] chars = Character.toChars(i);
        MyString1 s = new MyString1(chars);

        return s;
    }

    public static String[] split(String s, String regex) {
        ArrayList<String> arraySplit = new ArrayList<>();

        int newIndex = 0;
        for (int i = 0; i < s.length() - regex.length(); i++) {

            if (regex.compareTo(s.substring(i, i + regex.length() )) == 0) {
                arraySplit.add(s.substring(newIndex, i));
                arraySplit.add(regex);
                newIndex = i + regex.length();
            }

        }
        arraySplit.add(s.substring(newIndex, s.length()));
        return arraySplit.toArray(new String[arraySplit.size()]);
    }
}

package Chapter_10;

public class MyStringBuilder1 {
    private char[] chars;

    public MyStringBuilder1(String s) {
        chars = s.toCharArray();
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        char[] chars1 = new char[chars.length + s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars1[i] = chars[i];
        }
        for (int i = chars.length; i < chars1.length; i++) {
            chars1[i] = s.charAt(i - chars.length);
        }

        String ss = "";

        for (int i = 0; i < chars1.length; i++) {
            ss = ss + chars1[i];
        }

        MyStringBuilder1 s1 = new MyStringBuilder1(ss);
        return s1;
    }

    public MyStringBuilder1 append(int i) {
        MyStringBuilder1 s = new MyStringBuilder1(i + "");
        return append(s);
    }

    public int length() {
        int len = this.chars.length;
        return len;
    }

    public char charAt(int index) {
        char ch = chars[index];
        return ch;
    }

    public MyStringBuilder1 toLowerCase() {
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars1.length; i++) {
            chars1[i] = Character.toLowerCase(chars[i]);
        }

        String ss = "";

        for (int i = 0; i < chars1.length; i++) {
            ss = ss + chars1[i];
        }
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1(ss);
        return myStringBuilder1;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        char[] chars1 = new char[end - begin];
        for (int i = 0; i < chars1.length; i++) {
            chars1[i] = chars[begin + i];
        }

        String ss = "";

        for (int i = 0; i < chars1.length; i++) {
            ss = ss + chars1[i];
        }
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1(ss);
        return myStringBuilder1;
    }

    public String toString() {
        String s = "";

        for (int i = 0; i < chars.length; i++) {
            s = s + chars[i];
        }

        return s;
    }
}

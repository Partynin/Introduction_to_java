package Chapter_10;

public class MyStringBuilder2 {
    private char[] chars;

    public MyStringBuilder2() {
        chars = new char[16];
    }

    public MyStringBuilder2(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    public MyStringBuilder2(String s) {
        chars = s.toCharArray();
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] charsInsert = new char[chars.length + s.length()];
        for (int i = 0; i < chars.length - offset; i++) {
            charsInsert[i] = chars[i];
        }
        for (int i = offset; i < s.length(); i++) {
            charsInsert[i] = s.charAt(i - offset);
        }
        for (int i = chars.length - offset + s.length(), j = chars.length - offset;
             i < charsInsert.length; i++, j++) {
            charsInsert[i] = chars[j];
        }
        MyStringBuilder2 myStringBuilder2 = new MyStringBuilder2(charsInsert);
        return myStringBuilder2;
    }

    public MyStringBuilder2 reverse() {
        char[] charsReverse = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charsReverse[i] = chars[chars.length - i - 1];
        }
        MyStringBuilder2 myStringBuilder2 = new MyStringBuilder2(charsReverse);
        return myStringBuilder2;
    }

    public MyStringBuilder2 subsrting(int begin) {
        char[] charsSubstring = new char[chars.length - begin];
        for (int i = 0; i < charsSubstring.length; i++) {
            charsSubstring[i] = chars[i + begin];
        }
        MyStringBuilder2 myStringBuilder2 = new MyStringBuilder2(charsSubstring);
        return myStringBuilder2;
    }

    public MyStringBuilder2 tuUpperCase() {
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars1.length; i++) {
            chars1[i] = Character.toUpperCase(chars[i]);
        }
        MyStringBuilder2 myStringBuilder2 = new MyStringBuilder2(chars1.toString());
        return myStringBuilder2;
    }

    public int length() {
        int len = chars.length;
        return len;
    }

    public char charAt(int index) {
        char ch = chars[index];
        return ch;
    }

    public String toString() {
        String s = "";

        for (int i = 0; i < chars.length; i++) {
            s = s + chars[i];
        }

        return s;
    }
}

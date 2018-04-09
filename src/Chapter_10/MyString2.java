package Chapter_10;

public class MyString2 {
    private char[] chars;

    public MyString2(String s) {
        chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }
    }

    public int compare(String s) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] - s.charAt(i) != 0)
                return chars[i] - s.charAt(i);
        }
        return 0;
    }

    public MyString2 substring(int begin) {
        char[] charsSub = new char[chars.length - begin];
        for (int i = begin; i < charsSub.length; i++) {
            charsSub[i] = chars[i + begin];
        }
        String s = charsSub.toString();
        MyString2 s1 = new MyString2(s);
        return s1;
    }

    public MyString2 toUpperCase() {
        char[] charsUp = new char[chars.length];
        for (int i = 0; i < charsUp.length; i++) {
            charsUp[i] = Character.toUpperCase(chars[i]);
        }
        MyString2 s = new MyString2(charsUp.toString());
        return s;
    }

    public char[] toChars() {
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars1.length; i++) {
            chars1[i] = chars[i];
        }
        return chars1;
    }

    public static MyString2 valueOf(boolean b) {
        if (b) {
            MyString2 s = new MyString2("true");
            return s;
        }
        else {
            MyString2 s1 = new MyString2("false");
            return s1;
        }
    }


}

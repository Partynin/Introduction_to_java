package Chapter_6;

public class RandomCharacter {
    /** Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Generate a random lowercase letter */
    public static char getRandomLowercaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /** Generate a random uppercase letter */
    public static char getRandomUppercaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /** Create a random digit character */
    public static char getRandomDigitCharacter () {
        return getRandomCharacter('0', '9');
    }

    /** Generate random character */
    public static char getRandomeCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}

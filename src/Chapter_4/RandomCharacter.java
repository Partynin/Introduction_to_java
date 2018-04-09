package Chapter_4;

/**
 * Created by Kos on 01.07.2017.
 */
public class RandomCharacter {
    public static void main(String[] args) {
        char ch = (char) (65 + (int) (Math.random() * 30));
        System.out.printf("Random uppercase letter is %s", ch);
    }
}

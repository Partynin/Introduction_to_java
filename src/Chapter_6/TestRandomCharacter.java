package Chapter_6;

public class TestRandomCharacter {
    /** Main method */
    public static void main(String[] args) {
        final int NUMBER_OF_CHARACTER = 175;
        final int CHARSE_PER_LINE =25;

        // Print random character between 'a' and 'z', 25 chars per line
        for (int i = 0; i < NUMBER_OF_CHARACTER; i++) {
            char ch = RandomCharacter.getRandomLowercaseLetter();
            if ((i + 1) % CHARSE_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}

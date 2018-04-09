package Chapter_6;

public class GenerateRandomCharacters {
    /** Main method */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(RandomCharacter.getRandomUppercaseLetter() + " ");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter() + " ");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}

package Chapter_6;

public class DisplayCharacters {
    /** Main method */
    public static void main(String[] args) {
        printChars('1','Z',10);

    }

    /** Method prints characters */
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        for (int i = ch1; i < ch2; i++) {
            System.out.printf("%s ", Character.toString((char)i));
            count++;
            if (count % numberPerLine == 0) {
                System.out.println();
                count = 0;
            }
        }
    }
}

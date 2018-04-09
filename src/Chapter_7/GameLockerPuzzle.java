package Chapter_7;

public class GameLockerPuzzle {

    private static int[] lockers = new int[100];

    /** Main method */
    public static void main(String[] args) {
        for (int S = 1; S <= lockers.length; S++) {
            for (int L = -1 + S; L < lockers.length; L = L + S) {
                lockers[L] = changLocker(lockers[L]);
            }
        }

        display(lockers);
    }

    /** Chang locker */
    public static int changLocker(int locker) {
        int changeLocker = 0;
        if (locker == 0)
            changeLocker = 1;
        return changeLocker;
    }

    /** Display all open locker numbers */
    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

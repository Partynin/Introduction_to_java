package Chapter_7;

public class GameLockerPuzzle2 {
    // S1 opens every locker
    // S2 closes every other locker starting at L2 (subscript 1)
    // S3 closes/opens every 3 locker starting at L3 (subscript 2)  *closes if open/ opens if closed
    // s4 starts at 4 (subscript 3) changes every 4th locker
    // etc.. all the way up to 100

    public static void main(String[] args) {

        boolean[] lockers = new boolean[100];

        for (int student = 1; student <= 100; student++) {
            shuffle(lockers, student);
        }
        display(lockers);
    }

    public static void shuffle(boolean[] lockersOpenState,  int start) {

        int nextLocker = start;
        for (int i = start - 1; i < lockersOpenState.length; i += nextLocker) {
            lockersOpenState[i] = !lockersOpenState[i];

        }
    }


    public static void display(boolean[] lockers) {

        int lockerCount = 0;
        for (int i = 0; i < lockers.length; i++) {

            if (lockers[i]) {
                System.out.printf("L%d ", i+1);
                lockerCount++;
                if (lockerCount % 10 == 0) System.out.println("");
            }


        }

    }
}

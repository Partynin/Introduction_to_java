package Chapter_22;

public class PerformanceTest {
    public static void main(String[] args) {
        getTime(1000000);
        getTime(10000000);
        getTime(100000000);
        getTime(1000000000);

        getTime2(100);
        getTime2(1000);
        getTime2(10000);
        getTime2(100000);
    }

    public static void getTime(long n) {
        long startTime = System.currentTimeMillis();
        long k = 0;
        for (int i = 1; i <= n; i++) {
            k = k + 5;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for n = " + n + " is " + (endTime - startTime) +
        " milliseconds");
    }

    public static void getTime2(long n) {
        long startTime = System.currentTimeMillis();
        long k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                k = k + j + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for n^2 = " + n + " is " + (endTime - startTime) +
                " milliseconds");
    }
}

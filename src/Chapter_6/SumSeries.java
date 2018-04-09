package Chapter_6;

public class SumSeries {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("i        m(i)");
        System.out.println("______________");
        for (int j = 1;j <=20; j++) {
            System.out.printf("%d%14.4f\n", j, computeSeries(j));
        }
    }

    /** Method compute series */
    public static double computeSeries(int i) {
        double sum = 0;
        for (int  j = 1; j <= i; j++)
            sum = sum + (j / (j + 1.0));

        return sum;
    }
}

package Chapter_18;

public class SumSeries_Exe18_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("m(" + i + ") = " + m(i));
        }
    }

    public static double m(int i) {
        return m(i, 0);
    }

    public static double m(int i, double result) {
        if (i == 0)
            return result;
        else return result + m(i - 1, i / (i + 1.0));
    }
}

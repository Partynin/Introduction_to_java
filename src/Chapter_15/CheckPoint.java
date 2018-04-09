package Chapter_15;

public class CheckPoint {
    public static void main(String[] args) {
       double x = Math.pow(0.24 * 1.679, 2) +
               (2 * 0.24 * 3.77776 * 1.679 - ((0.0205 * 0.7133) / 0.001458) *  0.24 * 1.679 +
                       ((Math.pow(0.0205, 2)) / 0.001458) * 0.24) * 6 + (Math.pow(3.77776, 2)) -
               ((0.0205 * 0.7133) / 0.001458) * 3.77776;
        System.out.println(x);
    }
}

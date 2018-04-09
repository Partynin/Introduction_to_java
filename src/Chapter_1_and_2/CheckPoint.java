package Chapter_1_and_2;

/**
 * Created by Kos on 08.05.2017.
 */
public class CheckPoint {
    public static void main(String[] args) {
        System.out.println(56 % 6);
        System.out.println(78 % -4);
        System.out.println(-34 % 5);
        System.out.println(-34 % -5);
        System.out.println(5 % 1);
        System.out.println(1 % 5);

        System.out.print("is day ");
        System.out.println((2 + 100) % 7);
        System.out.println(25 / 4.0);

        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);

        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);

        System.out.println("2 power 3.5 is " + Math.pow(2, 3.5));

        int m = 3;
        int r = 4;
        System.out.println("mr power 2 is " + Math.pow(m * r,2));

        System.out.println("Arithmetic expression: ");
       // System.out.println((4 / (3 * (r + 34))) - 9 * (a + b * c) + (3 + d * (2 + a)) /
       //         (a + b * d));
       // 5.5 * Math.pow(r + 2.5, 2.5 + i);
        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);
         int a1 = 6;
         int b1 = a1++;
        System.out.println(a1);
        System.out.println(b1);
        a1 = 6;
        b1 = ++a1;
        System.out.println(a1);
        System.out.println(b1);
        float f = 12.5f;
        int i = (int)f;
        System.out.println("f is " + f);
        System.out.println("i is " + i);

        double amount = 5;
        System.out.println(amount / 2);
        System.out.println(5 / 2);

        int c = 1;
        System.out.println("Arithmetic expression: " + (-b1 + Math.pow(b1 * b1 - 4 * a * c, 1 / 2))
         / 2 * a);
    }
}

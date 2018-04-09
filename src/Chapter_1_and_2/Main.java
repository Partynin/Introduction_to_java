package Chapter_1_and_2;

public class Main {
    //Main method
    public static void main(String[] args) {
        /** Display output */
        System.out.println("   J     A     V    V     A");
        System.out.println("   J    A A     V  V     A A");
        System.out.println("J  J   AAAAA     VV     AAAAA");
        System.out.println(" JJ   A     A     V    A     A");

        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));

        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);

        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 + 1.0/13));
        double PI = 3.14;
        System.out.print("Perimeter = 2 * R * PI = ");
        System.out.println(PI * (2 * 5.5));
        System.out.print("Area = R * R * PI = ");
        System.out.println((5.5 * 5.5) * PI);

        System.out.print("Area and perimeter rectangle = ");
        System.out.println(4.5 * 7.9);
        System.out.println(4.5 * 2 + 7.9 * 2);
        System.out.println("Average speed in miles");
        System.out.println((14 / 1.6) / 0.758);

        System.out.print("First year population = ");
        System.out.println(312032486 + (31536000 / 7) + (31536000 / 45) - (3153600 / 13));
        int first = 312032486 + (31536000 / 7) + (31536000 / 45) - (3153600 / 13);
        System.out.print("Second year population = ");
        System.out.println(first + (31536000 / 7) + (31536000 / 45) - (3153600 / 13));
        int second = first + (31536000 / 7) + (31536000 / 45) - (3153600 / 13);
        System.out.print("Third year population = ");
        System.out.println(second + (31536000 / 7) + (31536000 / 45) - (3153600 / 13));
        int third = second + (31536000 / 7) + (31536000 / 45) - (3153600 / 13);
        System.out.print("Forth year population = ");
        System.out.println(third + (31536000 / 7) + (31536000 / 45) - (3153600 / 13));
        int forth = third + (31536000 / 7) + (31536000 / 45) - (3153600 / 13);
        System.out.print("Fifth year population = ");
        System.out.println(forth + (31536000 / 7) + (31536000 / 45) - (3153600 / 13));

        System.out.print("Average speed in kilometers = ");
        System.out.println((24 / 1.67638889) * 1.6);

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 55;
        double e = 44.5;
        double f = 5.9;
        System.out.print("Value x = ");
        System.out.println((e * d - b * f)/(a * d - b * c));
        System.out.print("Value y = ");
        System.out.println((a * f - e * c)/(a * d - b * c));
    }
}

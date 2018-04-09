package Chapter_3;

/**
 * Created by Kos on 02.06.2017.
 */
public class CheckPoint3 {



    public static void main(String[] args) {
        int x = 1;
        System.out.println("x > 0 is " + (x > 0));
        System.out.println("x < 0 is " + (x < 0));
        System.out.println("x != 0 is " + (x != 0));
        System.out.println("x >= 0 is " + (x >= 0));
        System.out.println("x != 1 is " + (x != 1));
        int y = 1;
        if (y > 0){
            x = 1;
        }
        double pay = 100;
        int score = 89;
        if (score > 90){
            pay = ((pay / 100) * 3) + pay;
        }
        else {
            pay = ((pay / 100) * 1) + pay;
        }
        int z = 0;
        x = 3;
        y = 3;
        if (x > 2)
            if (y > 2) {
                z = x + y;
                System.out.println("z is " + z);
            }
            else
                System.out.println("x is " + x);
        int count = 10;
        boolean newLine = count % 10 == 0;

        int random = (int)(10 + (Math.random() * 40));
        System.out.println(random);

        int random1 = (int)(Math.random() * 2);
        System.out.println(random1);

        int x1 = 1;
        System.out.println((true) && (3 > 4));
        System.out.println(!(x > 3) && (x > 0));
        System.out.println((x > 0) || (x < 0));
        System.out.println((x != 0) || (x == 0));
        System.out.println((x >= 1) || (x < 0));
        System.out.println((x != 1) == !(x == 1));

        int num = -100;
        boolean flag;
        if (num >= 1 && num <= 100) {
            flag = true;
            System.out.println(flag);
        }
        else {
            flag = false;
            System.out.println(flag);
        }
        if ((num >= 1 && num <= 100) || (num < 0)) {
            flag = true;
            System.out.println(flag);
        }
        else {
            flag = false;
            System.out.println(flag);
        }

        boolean b = Math.abs(x - 5) < 4.5;
        boolean b1 = Math.abs(x - 5) > 4.5;// модуль числа

        System.out.println(x > y);

        int age = 15;
        boolean b3 = (age > 13) && (age < 18);
        System.out.println("age = " + b3);

        int weight = 15;
        int height = 40;
        boolean b4 = (weight > 50) || (height > 60);
        System.out.println("weight = " + b4);

        boolean b5 = (weight > 50) && (height > 60);
        System.out.println("weight = " + b5);

        boolean b6 = (weight > 50) ^ (height > 60);
        System.out.println("weight = " + b6);

        x = 4; y = 3;
        switch (x + 3){
            case 6: y = 1;
            default: y += 1;
        }
        System.out.println("y1 = " + y);

        x = 4; y = 3;
        if (x + 3 == 6)
            y = 1;
        y += 1;
        System.out.println("y2 = " + y);

        x = 1;
        int a = 4;
        if (a == 1)
            x += 5;
        else if (a == 2)
            x += 10;
        else if (a == 3)
            x += 16;
        else if (a == 4)
            x += 34;
        System.out.println("x1 = " + x);

        x = 1; a = 4;
        switch (a){
            case 1: x += 5; break;
            case 2: x += 10; break;
            case 3: x += 16; break;
            case 4: x += 34; break;
        }
        System.out.println("x2 = " + x);

        int day = 1;
        switch (day){
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday");

        }

        int ticketPrice = (age >= 16) ? 20 : 10;

        int scale = 1;
        if (x > 10)
            score = 3 * scale;
        else score = 4 * scale;

        double income = 3;
        if (income > 10000)
            income *= 0.2;
        else income = income * 0.17 + 1000;

        double number = 3;
        if (number % 3 == 0)
            System.out.println("i");
        else System.out.println("j");
        System.out.println(((int)(Math.random() * 2) == 0) ? "random -1" : "random 1");

        System.out.println(x > 0 || x < 10 && y < 0);
        System.out.println(x > 0 || (x < 10 && y < 0));
    }
    public static class Test {
        public static void main(String[] args) {
            java.util.Scanner input = new java.util.Scanner(System.in);
            double x = input.nextDouble();
            double y = input.nextDouble();
            double z = input.nextDouble();
            System.out.println("(x < y && y < z) is " + (x < y && y < z));
            System.out.println("(x < y || y < z) is " + (x < y || y < z));
            System.out.println("!(x < y) is " + !(x < y));
            System.out.println("(x + y < z) is " + (x + y < z));
            System.out.println("(x + y > z) is " + (x + y > z));
        }

    }
}

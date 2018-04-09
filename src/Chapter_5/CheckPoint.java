package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 05.07.2017.
 */
public class CheckPoint {
    public static void main(String[] args) {
       /* int i = 1;
        while (i < 10)
           if ((i++) % 2 == 0)
           System.out.println(i);

      Scanner input = new Scanner(System.in);

        int number, max;
        number = input.nextInt();
        max = number;

        do {
            number = input.nextInt();
            if (number > max)
                max = number;
        }while (number != 0);

        System.out.println("max is " + max);
        System.out.println("number " + number);

       int x1 =  1;

       long startTime = System.currentTimeMillis();
       while (x1 > 0)
           x1++;
        long endTime = System.currentTimeMillis();
        System.out.println("x is " + x1);
        long time = endTime - startTime;
        System.out.println("Time = " + time / 1000.d + " seconds");

        Scanner input = new Scanner(System.in);
        int number, sum = 0;
        do {
            System.out.println("Enter an integer (the input ends if it is 0): ");
            number = input.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("The sum = " + sum);
       int sum = 0;
       for (int i = 0; i < 10; ++i)
           sum += i;
        System.out.println(sum);
        int sum1 = 0;
        for (int i = 0; i < 10; i++)
            sum1 += i;
        System.out.println(sum1);

        for (int i = 1; i <= 100; i++){
            System.out.print(i + " ");
            if (i % 10 == 0)
                System.out.println();
        }

        Scanner input = new Scanner(System.in);
        int number, sum2 = 0, countPosition;
        for (countPosition = 0; countPosition < 5; countPosition++) {
            number = input.nextInt();
            sum2 += number;
        }

        System.out.println("sum is " + sum2);
        System.out.println("countPosition is " + countPosition);
       long sum3 = 0;
       for (int i = 0; i <= 1000; i++)
           sum3 = sum3 + i;
        System.out.println(sum3);

       int sum = 0;
       int i = 0;
       while (i <= 1000) {
           sum = sum + i;
           i++;
       }
        System.out.println(sum);
       int sum1 = 0, i1 = 0;
       do {
           sum1 = sum1 + i1;
           i1++;
       } while (i1 <= 1000);
        System.out.println(sum1);
       int countPosition = 5;
       while (countPosition < 10)
           countPosition = countPosition + 3;
        System.out.println(countPosition);

       for (int i = 1, sum = 0; sum < 1000; sum = sum + i, i++) {

       }
       int i = 0;
       do {
           System.out.println(i + 4);
           i++;
       } while (i < 10);
       int countPosition = 0;
       for (int i = 0; i < 10; i++)
           for (int j = 0; j < i; j++) {
               System.out.println(j * i);
               countPosition++;
           }

        System.out.println("countPosition = " + countPosition);
       for (int i = 1; i < 5; i++) {
           int j = 0;
           while (j < i) {
               System.out.print(j + " ");
               j++;
           }
       }

       int i = 0;
       while (i < 5) {
           for (int j = i; j > 1; j--)
               System.out.print(j + " ");
           System.out.println("****");
           i++;
       }

       i = 5;
       while (i >= 1) {
           int num = 1;
           for (int j = 1; j <= i; j++) {
               System.out.print(num + "xxx");
               num *= 2;
           }
           System.out.println();
           i--;
       }

       i = 1;
       do {
           int num = 1;
           for (int j = 1; j <= i; j++) {
               System.out.println(num + "G");
               num += 2;
           }
           System.out.println();
           i++;
       } while (i <= 5);
       int balance = 10;
       while (true) {
           if (balance < 9)
               break;
           balance = balance - 9;
       }

        System.out.println("Balance is " + balance);
       int sum = 0;
       for (int i = 0; i < 4; i++) {
           System.out.println("remainder = " + (i % 3));
           if (i % 3 == 0) continue;
           sum += i;
           System.out.println("sum = " + sum);
       }
       int i = 0, sum = 0;
       while (i < 4) {
           if (i % 3 == 0) {
               i++;
               continue;
           }
           sum += i;
           i++;
       }
        System.out.println(sum);
        int sum = 0;
        int number = 0;

        while (number < 20 && sum <= 100) {
            number++;
            sum += number;
           // if (sum >= 100)
             //   break;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                sum -= number;
            sum += number;
        }

        System.out.println("the sum is " + sum);
       for (int i = 1; i < 4; i++) {
           for (int j = 1; j < 4; j++) {
               if (i * j > 2)
                   break;

               System.out.println(i * j);
           }

           System.out.println(i);
       }*/
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2)
                    continue;

                System.out.println(i * j);
            }

            System.out.println(i);
        }
    }
}

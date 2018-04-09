package Chapter_11;

import java.util.Scanner;

public class ImplementMyStackUsingInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter five string: ");
        MyStackInheritance myStackInheritance = new MyStackInheritance();
        myStackInheritance.add(scanner.nextLine());
        myStackInheritance.add(scanner.nextLine());
        myStackInheritance.add(scanner.nextLine());
        myStackInheritance.add(scanner.nextLine());
        myStackInheritance.add(scanner.nextLine());

        System.out.println("Display them in reverse order.");
        while (!myStackInheritance.isEmpty())
            System.out.println(myStackInheritance.pop());
    }
}

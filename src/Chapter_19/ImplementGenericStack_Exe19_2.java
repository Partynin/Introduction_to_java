package Chapter_19;

import ToolKit.GenericStackExtendsArrayList;

import java.util.Scanner;

public class ImplementGenericStack_Exe19_2 {
    public static void main(String[] args) {
        System.out.println("Enter five strings: ");
        Scanner input = new Scanner(System.in);
        GenericStackExtendsArrayList<String> stack = new GenericStackExtendsArrayList<>();

        for (int i = 0; i < 5; i++) {
            stack.push(input.nextLine());
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

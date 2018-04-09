package Chapter_19;


import ToolKit.GenericStackWithArray;

public class RevisingListing_Exe19_1 {
    public static void main(String[] args) {
        GenericStackWithArray<String> stack = new GenericStackWithArray<>();

        stack.push("Mother");
        stack.push("Father");
        stack.push("Brother");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        stack.push("Sister");
        stack.push("Uncle");
        stack.push("Aunt");
        stack.push("Nephew");
        stack.push("Niece");

        System.out.println(stack);
    }
}

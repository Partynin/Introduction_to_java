package Chapter_19;

public class WildCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1); // 1 is autoboxed into new Integer(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("The max number is " + max(intStack));

        intStack.push(4); // 1 is autoboxed into new Integer(1);
        intStack.push(5);
        intStack.push(6);

        System.out.println("The objects in the stack is " );
        print(intStack);
    }

    /** Fined the maximum in a stack of numbers */
    public static double max(GenericStack<? extends Number> stack) {
        double max = stack.pop().doubleValue(); // Initialize max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max)
                max = value;
        }

        return max;
    }

    /** Prints objects and empties the stack */
    public static void print(GenericStack<?> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

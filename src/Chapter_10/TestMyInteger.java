package Chapter_10;

public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(100);

        System.out.println(myInteger.getValue());
        System.out.println("Is odd? " + myInteger.isOdd());
        System.out.println("Is even? " + myInteger.isEven());
        System.out.println("Is prime? " + myInteger.isPrime());
        System.out.println("Is odd number 5 ? " + MyInteger.isOdd(5));
        System.out.println("Is even number 6? " + MyInteger.isEven(6));
        System.out.println("Is prime number 33? " + MyInteger.isPrime(33));
        MyInteger myInteger1 = new MyInteger(44);
        System.out.println("Is odd object number 44 ? " + MyInteger.isOdd(myInteger1));
        System.out.println("Is even object number 44? " + MyInteger.isEven(myInteger1));
        System.out.println("Is prime object number 44? " + MyInteger.isPrime(myInteger1));
        System.out.println("Is equal int 3 " + myInteger.equals(3));
        System.out.println("Is equal object 44 " + myInteger.equals(myInteger1));
        char[] chars = {'1', '2', '3'};
        System.out.println(MyInteger.parseInt(chars));
        System.out.println(MyInteger.parseInt("333"));
    }
}

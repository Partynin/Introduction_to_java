package Chapter_13;


public class CreateARationalNumberCalculator {
    /** Main method */
    public static void main(String[] args) {
        // Check number of strings passed
         if (args.length != 3) {
             System.out.println(
                     "Usage: java Calculator operand1 operator operand2");
             System.exit(0);
             }

         // The result of the operation
         Rational result = new Rational();

         String[] numbersRat1 = args[0].split("/");
         String[] numbersRat2 = args[2].split("/");
         Rational rational = new Rational(Integer.parseInt(numbersRat1[0]),
                 Integer.parseInt(numbersRat1[1]));
        Rational rational2 = new Rational(Integer.parseInt(numbersRat2[0]),
                Integer.parseInt(numbersRat2[1]));
        System.out.println("operand 1 = " + rational);
        System.out.println("operand 2 = " + rational2);

         // Determine the operator
         switch (args[1].charAt(0)) {
             case '+': result = rational.add(rational2);
                 break;
             case '-': result = rational.subtract(rational2);
                 break;
             case '*': result = rational.multiply(rational2);
                 break;
             case '/': result = rational.divide(rational2);
                 }

         // Display result
         System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                 + " = " + result);
         }
}

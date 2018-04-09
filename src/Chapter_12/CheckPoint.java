package Chapter_12;

import java.io.PrintWriter;

public class CheckPoint {
    public static void main(String[] args) throws Exception {
        /**for (int i = 0; i < 2; i++) {
            System.out.println(i + " ");
            try {
                System.out.println(1 / 0);
            }
            catch (Exception ex) {

            }
        }

        try {
            for (int i = 0; i < 2; i++) {
                System.out.println(i + " ");
                System.out.println(1 / 0);
            }
        }
        catch (Exception ex) {

        } */
        /*PrintWriter output = new PrintWriter("temp.txt");
        output.printf("amount is %f %e\r\n", 32.32, 32.32);
        output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
        output.printf("%6b\r\n", (1 > 2));
        output.printf("%6b\r\n", "Java");
        output.close();*/
        try (PrintWriter output = new PrintWriter("temp.txt")) {
        output.printf("amount is %f %e\r\n", 32.32, 32.32);
        output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
        output.printf("%6b\r\n", (1 > 2));
        output.printf("%6b\r\n", "Java");
        output.close();}
    }

    public static boolean isNumeric(String token) {
        if (isNumeric(token))
            return true;
        else return false;
    }
}

package Chapter_17;

import java.io.*;

public class RestoreObjectsFromAFile_Exe17_7 {
    private static double totalLoanAmount;

    public static void main(String[] args) throws IOException {
        try (
                ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(
                        new FileInputStream("Exercise17_06.dat")))
                ) {
            LoanSerializable loan;
            while (true) {
                loan = (LoanSerializable) input.readObject();
                totalLoanAmount += loan.getLoanAmount();
            }
        } catch (EOFException ex) {
            System.out.println("All data were read");
            System.out.println("Total loan amount = " + totalLoanAmount);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

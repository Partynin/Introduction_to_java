package Chapter_17;

/** (Store Loan objects) The Loan class in Listing 10.2 does not implement
 Serializable. Rewrite the Loan class to implement Serializable. Write
 a program that creates five Loan objects and stores them in a file named
 Exercise17_06.dat. */

import Chapter_10.Loan;

import java.io.*;

public class StoreLoanObjects_Exe17_6 {
    /** Main method */
    public static void main(String[] args) throws IOException {
        try (
                ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(
                        new FileOutputStream("Exercise17_06.dat", true)))
                ) {
            for (int i = 0; i < 5; i++) {
                LoanSerializable loanSerializable = new LoanSerializable();
                output.writeObject(loanSerializable);
            }
        }
    }
}

/** Make Loan serializable */
class LoanSerializable extends Loan implements Serializable {

}

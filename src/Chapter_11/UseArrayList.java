package Chapter_11;

import Chapter_10.Loan;

import java.util.ArrayList;
import java.util.Date;

public class UseArrayList {
    /** Main method */
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add(new CircleFromSimpleGeometricObject());

        for (Object object: list) {
            System.out.println(object.toString());
            System.out.println();
        }
    }
}

package Chapter_13;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        for (String city: cities)
            System.out.print(city + " ");
            System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("4325709875720985709823"),
        new BigInteger("470982567098475629860"), new BigInteger("85475985432")};
        Arrays.sort(hugeNumbers);
        for (BigInteger number: hugeNumbers)
            System.out.print(number + " ");
    }
}

package Chapter_8;

public class EvenNumberOf1s {
    /**
     * Main method
     */
    public static void main(String[] args) {
        int[][] array1 = new int[6][6];
        int[][] array2 = new int[6][6];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        check(array1, array2);
    }

    /**
     * Checks if every row and every column have an even number of 1s
     */
    public static void check(int[][] array1, int[][] array2) {
        for (int i = 0; i < array1.length; i++) {
            int amountArray1 = 0;
            int amountArray2 = 0;
            for (int j = 0; j < array1[i].length; j++) {
                amountArray1 += array1[i][j];
                amountArray2 += array2[i][j];
            }
            if (amountArray1 == amountArray2)
                System.out.println("Row" + i + " have even number of 1s = " + amountArray1);
        }

        for (int i = 0; i < array1.length; i++) {
            int amountArray1 = 0;
            int amountArray2 = 0;
            for (int j = 0; j < array1[i].length; j++) {
                amountArray1 += array1[j][i];
                amountArray2 += array2[j][i];
            }
            if (amountArray1 == amountArray2)
                System.out.println("Column" + i + " have even number of 1s = " + amountArray1);
        }
    }
}
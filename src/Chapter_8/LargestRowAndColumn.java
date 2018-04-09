package Chapter_8;

public class LargestRowAndColumn {
    /** Main method */
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 2);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        firstRow(array);
        firstColumn(array);
    }

    /** Finds the first row with the most 1s */
    public static void firstRow(int[][] array) {

        int max = 0;
        int largestIndex = 0;
        int sum = 0;

            for (int j = 0; j < array[0].length; j++) {
                max = max + array[0][j];
            }


        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            if (sum > max) {
                max = sum;
                largestIndex = i;
            }
            sum = 0;
        }

        System.out.println("The largest row index: " + largestIndex);
    }

    /** Finds the first column with the most 1s */
    public static void firstColumn(int[][] array) {
        int max = 0;
        int largestIndex = 0;
        int sum = 0;

        for (int j = 0; j < array[0].length; j++) {
            max = max + array[j][0];
        }


        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[j][i];
            }
            if (sum > max) {
                max = sum;
                largestIndex = i;
            }
            sum = 0;
        }

        System.out.println("The largest column index: " + largestIndex);
    }
}

package Chapter_8;

public class CheckPoint {
    public static void main(String[] args) {
        /**int[][] matrix = new int[4][5];

        int[][] array = new int[5][6];
        int[] x = {1, 2};
        array[0] = x;
        System.out.println("array[0][1] is " + array[0][1]);

        int[][] r = new int[2][];
        int[][] z = {{1, 2}};

        int[][] array1 = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array1.length - 1; i >= 0; i--) {
            for (int j = array1[i].length - 1; j >= 0; j--)
                System.out.print(array1[i][j] + " ");
            System.out.println();
        }

        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i][0];
        System.out.println(sum);*/

        int[][][] array1 = new int[4][6][5];

        int[][][] x = new int[12][5][2];
        System.out.println(x.length);
        System.out.println(x[2].length);
        System.out.println(x[0][0].length);

        int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        System.out.println(array[0][0][0]);
        System.out.println(array[1][1][1]);
    }
}

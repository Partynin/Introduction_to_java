package Chapter_8;

public class ShuffleRows {
    /** Main method */
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            if (i != m.length - 1)
            System.out.print(",");
        }

        shuffle(m);
        System.out.println();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            if (i != m.length - 1)
                System.out.print(",");
        }
    }

    /** Shuffles the rows in a two-dimensional array */
    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int temp = m[i][0];
            int temp2 = m[i][1];
            int random = (int)(Math.random() * 6);
            m[i][0] = m[random][0];
            m[i][1] = m[random][1];
            m[random][0] = temp;
            m[random][1] = temp2;
        }
    }
}

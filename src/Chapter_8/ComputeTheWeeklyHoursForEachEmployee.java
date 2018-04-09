package Chapter_8;

public class ComputeTheWeeklyHoursForEachEmployee {
    /** Main method */
    public static void main(String[] args) {
        int[][] array =
                {{2, 4, 3, 4, 5, 8, 8},
                {1, 7, 3, 4, 3, 3, 4},
                {2, 3, 3, 4, 3, 3, 2},
                {3, 9, 3, 4, 7, 3, 4},
                {4, 3, 5, 4, 3, 6, 3},
                {5, 3, 4, 4, 6, 3, 4},
                {6, 3, 7, 4, 8, 3, 8},
                {7, 6, 3, 5, 9, 2, 7}};

        int[][] resultArray = new int[8][2];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            resultArray[i][0] = i;
            resultArray[i][1] = sum;
        }

        sortArray(resultArray);

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println("Employee " + resultArray[i][0] + " weekly hours: " +
            resultArray[i][1]);
        }
    }

    public static void sortArray(int[][] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int currentMinGrad = array[i][1];
            int currentMinStudent = array[i][0];
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (currentMinGrad > array[j][1]) {
                    currentMinGrad = array[j][1];
                    currentMinStudent = array[j][0];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                array[currentMinIndex][1] = array[i][1];
                array[currentMinIndex][0] = array[i][0];
                array[i][1] = currentMinGrad;
                array[i][0] = currentMinStudent;
            }
        }
    }
}

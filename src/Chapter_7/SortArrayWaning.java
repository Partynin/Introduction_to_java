package Chapter_7;

public class SortArrayWaning {
    /** The method for sorting the numbers */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            // Find the maximum in the list[i...list.length-1]
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}

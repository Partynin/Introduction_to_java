package Chapter_23;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] list = {3, 4, 5, 1, 5, 1};

        for (int k = 1; k < list.length; k++) {
            // Perform hte kth pass
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }

        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            // Perform the kth pass
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }
}

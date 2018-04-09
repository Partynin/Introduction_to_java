package Chapter_7;

public class ExecutionTime {

    /** Main method */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(LinearSearch.linearSearch(getRandomArray(), getKey()));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        startTime = System.currentTimeMillis();
        System.out.println(BinarySearch.binarySearch(getArray(), getKey()));
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    /** Full an random array */
    public static int[] getRandomArray() {
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int j = array.length - 1; j > 0; j--) {
            int k = (int)(Math.random() * (j + 1));

            int temporary = array[j];
            array[j] = array[k];
            array[k] = temporary;
        }

        return array;
    }

    /** Generator key */
    public static int getKey() {
        int key = (int)(Math.random() * 100000);
        return key;
    }

    /** Get array */
    public static int[] getArray() {
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}

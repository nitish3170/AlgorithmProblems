import java.util.Arrays;

public class InsertionSort {

    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] words = {"banana", "apple", "kiwi", "date", "fig", "grape", "cherry"};

        System.out.println("Unsorted array: " + Arrays.toString(words));

        insertionSort(words);

        System.out.println("Sorted array: " + Arrays.toString(words));
    }
}

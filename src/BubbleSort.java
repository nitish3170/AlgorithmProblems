import java.util.Arrays;

public class BubbleSort {

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        String[] words = {"banana", "apple", "kiwi", "date", "fig", "grape", "cherry"};

        System.out.println("Unsorted array: " + Arrays.toString(words));

        bubbleSort(words);

        System.out.println("Sorted array: " + Arrays.toString(words));
    }
}

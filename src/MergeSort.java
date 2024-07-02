import java.util.Arrays;

public class MergeSort {

    public static <T extends Comparable<T>> void mergeSort(T[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
    private static <T extends Comparable<T>> void merge(T[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        T[] leftArray = Arrays.copyOfRange(array, left, mid + 1);
        T[] rightArray = Arrays.copyOfRange(array, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        String[] words = {"banana", "apple", "kiwi", "date", "fig", "grape", "cherry"};

        System.out.println("Unsorted array: " + Arrays.toString(words));

        mergeSort(words, 0, words.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(words));
    }
}

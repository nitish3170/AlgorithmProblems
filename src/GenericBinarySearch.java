import java.util.List;

public class GenericBinarySearch {
    public static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            T midVal = list.get(mid);

            int cmp = midVal.compareTo(key);

            if (cmp < 0) {
                left = mid + 1;
            } else if (cmp > 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "fig", "grape", "kiwi");
        String key = "cherry";

        int result = binarySearch(words, key);
        if (result != -1) {
            System.out.println("The word " + key + " is at index " + result);
        } else {
            System.out.println("The word " + key + " is not in the list.");
        }
    }
}

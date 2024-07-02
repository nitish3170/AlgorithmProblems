import java.util.*;

public class Permutation {
    public static List<String> iterativePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permutations.add(str);

        int n = str.length();
        char[] chars = str.toCharArray();
        int[] indexes = new int[n];

        int i = 0;
        while (i < n) {
            if (indexes[i] < i) {
                swap(chars, i % 2 == 0 ? 0 : indexes[i], i);
                permutations.add(new String(chars));
                indexes[i]++;
                i = 0;
            } else {
                indexes[i] = 0;
                i++;
            }
        }
        return permutations;
    }

    public static List<String> recursivePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        recursivePermutationsHelper("", str, permutations);
        return permutations;
    }

    private static void recursivePermutationsHelper(String prefix, String remaining, List<String> permutations) {
        int n = remaining.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                recursivePermutationsHelper(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1, n), permutations);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String input = "abc";


        List<String> iterativeResult = iterativePermutations(input);
        System.out.println("Iterative Permutations: " + iterativeResult);


        List<String> recursiveResult = recursivePermutations(input);
        System.out.println("Recursive Permutations: " + recursiveResult);
    }
}
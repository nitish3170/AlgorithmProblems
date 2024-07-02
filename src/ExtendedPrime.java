import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtendedPrime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean areAnagrams(int num1, int num2) {
        char[] arr1 = Integer.toString(num1).toCharArray();
        char[] arr2 = Integer.toString(num2).toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        int limit = 1000;
        List<Integer> primes = findPrimes(limit);
        List<Integer> palindromicPrimes = new ArrayList<>();
        List<Integer> anagramPrimes = new ArrayList<>();


        for (int prime : primes) {
            if (isPalindrome(prime)) {
                palindromicPrimes.add(prime);
            }
        }


        for (int i = 0; i < primes.size(); i++) {
            for (int j = i + 1; j < primes.size(); j++) {
                if (areAnagrams(primes.get(i), primes.get(j))) {
                    if (!anagramPrimes.contains(primes.get(i))) {
                        anagramPrimes.add(primes.get(i));
                    }
                    if (!anagramPrimes.contains(primes.get(j))) {
                        anagramPrimes.add(primes.get(j));
                    }
                }
            }
        }

        System.out.println("Prime numbers from 0 to " + limit + ": " + primes);
        System.out.println("Palindromic prime numbers: " + palindromicPrimes);
        System.out.println("Anagram prime numbers: " + anagramPrimes);
    }
}

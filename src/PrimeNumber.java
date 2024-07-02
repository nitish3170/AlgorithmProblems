import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
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

    public static void main(String[] args) {
        int limit = 1000;
        List<Integer> primes = findPrimes(limit);
        System.out.println("Prime numbers from 0 to " + limit + ": " + primes);
    }
}

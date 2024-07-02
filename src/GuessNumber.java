import java.util.Scanner;

public class GuessNumber {
    public static void guessNumber(int n) {
        int low = 0;
        int high = n - 1;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (low <= high) {
            count++;
            int mid = low + (high - low) / 2;
            System.out.println("Is your number between " + low + " and " + mid + " ? (true/false)");
            boolean response = scanner.nextBoolean();

            if (response) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Number of questions asked: " + count);
        System.out.println("Guessed number is: " + low);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N (where N = 2^n): ");
        int n = scanner.nextInt();

        int upperBound = (int) Math.pow(2, n);

        guessNumber(upperBound);

        scanner.close();
    }
}

import java.util.Scanner;

public class SmallPrimes {
    public static void main(String[] args) {
        int conunt = 100;
        int N = 2;
        while (N < conunt) {
            if (isPrimeNumber(N)) {
                System.out.println(N + " ");
            }
            N++;
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

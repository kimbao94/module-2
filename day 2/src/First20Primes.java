import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class First20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("in ra bao nhiêu số");
        int number = scanner.nextInt();
        System.out.println(number + " số nguyên tố đầu tiên là:");
        int conunt = 0;
        int N = 2;
        while (conunt < number) {
            if (isPrimeNumber(N)){
                System.out.println(N + " ");
                conunt++;
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

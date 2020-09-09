import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền usd");
        int usd = scanner.nextInt();
        int vnd = 23000;
        int rate = usd * vnd;
        System.out.println(rate + "vnd");
    }
}

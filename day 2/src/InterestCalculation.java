import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interest = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền gửi");
        money = scanner.nextDouble();
        System.out.println("nhập sô tháng đã gửi");
        month = scanner.nextInt();
        System.out.println("nhập lãi suất hàng năm theo %");
        interest = scanner.nextDouble();

        double total_interest = 0;
        for (int i = 0;i < month;i++){
            total_interest += money * (interest/100)/12*month;
        }
        System.out.println("lãi suất: " +total_interest);
    }
}

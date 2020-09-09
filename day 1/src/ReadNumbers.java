import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần đọc");
        int num = scanner.nextInt();
        String ReadNumbers;
        switch (num) {
            case 1:
                ReadNumbers = "một";
            case 2:
                ReadNumbers = "hai";
            case 3:
                System.out.println("ba");
            case 4:
                System.out.println("bốn");
            case 5:
                System.out.println("năm");
            case 6:
                System.out.println("sáu");
            case 7:
                System.out.println("bảy");
            case 8:
                System.out.println("tám");
            case 9:
                System.out.println("chín");
            default:
                System.out.println("ngoài khả năng");
        }

    }
}

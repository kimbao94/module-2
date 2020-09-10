import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Tam giác");
            System.out.println("2. Hình vuông");
            System.out.println("3. Hình chữ nhật");
            System.out.println("4. Thoát");
            System.out.println("Nhập sự lựa chọn:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("hình tam giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Hình vuông");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Hình chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("không hợp lệ");
            }

        }
    }
}

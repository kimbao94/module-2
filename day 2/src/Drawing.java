import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int draw = -1;
        while (draw != 0) {
            System.out.println("Menu");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác vuông");
            System.out.println("3. Hình tam giác cân");
            System.out.println("4. Thoát");
            System.out.println("Nhập sự lựa chọn:");
            draw = input.nextInt();
            switch (draw) {
                case 1:
                    System.out.println("Hình chữ nhật");
                    for (int col = 1; col <= 3; col++) {
                        for (int row = 1; row <= 6; row++) {
                            System.out.print("* ");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    System.out.println("Hình tam giác vuông ở botton-left");
                    for (int col = 1; col <= 5; col++) {
                        for (int row = 1; row <= col; row++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }

                    System.out.println("Hình tam giác vuông ở top-left");
                    for (int col = 5; col >= 1; col--) {
                        for (int row = 1; row <= col; row++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }

                    System.out.println("Hình tam giác vuông ở botton-right");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= 5; j++) {
                            if (j >= i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println(" ");
                    }

                    System.out.println("Hình tam giác vuông ở top-right");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j >= i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.println("Hình tam giác cân");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++)
                            System.out.print(" ");
                        for (int k = 1; k <= 2 * i - 1; k++)
                            System.out.print("*");
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("không hợp lệ");
            }

        }
    }
}

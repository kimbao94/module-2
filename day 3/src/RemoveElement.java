import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] value = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần xóa");
        int x = scanner.nextInt();
        for (int i = 0; i < value.length; i++) {
            if (value[i] == x) {
                for (int j = i; j < value.length; j++) {
                    value[j] = value[j + 1];
                }
                value[value.length - 1] = 0;
                check = true;
            }

        } if (check) {
            for (int j : value) {
                System.out.println(j + ",");
            }
        } else {
            System.out.println("không có trong hàm");
        }
    }
}


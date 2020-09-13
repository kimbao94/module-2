import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new  Scanner(System.in);
        System.out.println("nhập số a:");
        a = scanner.nextInt();
        System.out.println("nhập số b:");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        System.out.println("ước chung lớn nhất là: " + a);
    }
}

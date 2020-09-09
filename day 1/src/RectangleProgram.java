import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float heigth;

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chiều dài: ");
        width = scanner.nextFloat();

        System.out.println("nhập chiều rộng: ");
        heigth = scanner.nextFloat();

        float arena = width * heigth;
        System.out.println("Diện tích là: ");
    }
}


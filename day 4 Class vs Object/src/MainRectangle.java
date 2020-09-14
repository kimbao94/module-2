import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều rộng:");
        double width = scanner.nextDouble();
        System.out.print("nhập chiều dài:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật \n" + rectangle);
        System.out.println("Chu vi: " + rectangle.getPerimeter());
        System.out.println("Diện tích: " + rectangle.getArea());
    }
}


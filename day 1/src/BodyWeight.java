import java.sql.SQLOutput;
import java.util.Scanner;

public class BodyWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weigth,height,bmi;
        System.out.print("cân nặng (số kg):");
        weigth = scanner.nextDouble();
        System.out.print("chiều cao(số m):");
        height = scanner.nextDouble();

        bmi = weigth / Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Trạng thái\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s",bmi,"Thiếu cân");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s",bmi,"Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s",bmi,"Thừa cân");
        else
            System.out.printf("%-20.2f%s",bmi,"Béo phì");

    }
}

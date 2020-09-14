import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a");
        double a = scanner.nextDouble();
        System.out.println("nhập số b");
        double b = scanner.nextDouble();
        System.out.println("nhập số c");
        double c = scanner.nextDouble();
        QuadraticEquation quadratic = new QuadraticEquation(a,b,c);
        System.out.println("delta = " + quadratic.getDiscriminant());

        if (quadratic.getDiscriminant() < 0){
            System.out.println("phương trình vô nghiệm");
        }else if (quadratic.getDiscriminant() == 0){
            System.out.println("phương trình có nghiệm kép " + "x1 = x2 = " + quadratic.getSolution());
        }else {
            System.out.println("phương trình có 2 nghiệm " + quadratic.getRoot1() + " , " + quadratic.getRoot2());
        }

    }
}

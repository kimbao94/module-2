import java.util.Scanner;

public class PassTheExam {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập số sinh viên:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("số sinh viên không quá 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhập số điểm" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("số lượng sinh viên thi đỗ" + Check(array));
    }
    public static int Check(int[] num){
        int check = 0;

        for (int i = 0;i < num.length ;i++){
            if (num[i] >= 5 && num[i] <= 10){
                check++;
            }
        }
        return check;
    }
}


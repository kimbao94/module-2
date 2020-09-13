import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDong, soCot;
        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();

        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();

        int[][] arr = new int[soDong][soCot];
        System.out.println("nhap cac phan tu");

        for (int i = 0; i < soDong;i++){
            for (int j = 0; j< soCot; j++)
                arr[i][j]= scanner.nextInt();
        }
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i =0;i < arr.length;i++){
            sum1 += arr[i][i];
            sum2 += arr[arr.length-1-i][i];
        }
        System.out.println("tổng đường chéo chính"+sum1);
        System.out.println("tổng đường chéo phụ"+sum2);
    }
}

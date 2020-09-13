import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int [] arr1 = new int[arr.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần thêm");
        int x = scanner.nextInt();
        System.out.println("nhập vị trí cần chèn");
        int index = scanner.nextInt();
        if (index <= 1 || index >= arr.length - 1) {
            System.out.println("không chèn đc phần tử vào mảng");
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
                if (index == i) {
                    for (int j = i;j< arr.length-1;j++){
                        arr1[j+1] = arr[j];
                    }
                    arr1[index] = x;
                    break;
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + ",");
            }
        }
    }
}

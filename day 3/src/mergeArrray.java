public class mergeArrray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int [] arr2 = new int [arr.length + arr1.length];
        for (int i = 0;i < arr.length;i++){
            arr[i] = arr2[i];
            for (int j = i;j < arr2.length;j++){
                arr1[j] = arr2[arr1.length];
            }
        }
        for (int i = 0;i < arr2.length;i++){
        System.out.println(arr2[i] + ",");
        }
    }
}

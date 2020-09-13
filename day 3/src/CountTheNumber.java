public class CountTheNumber {
    public static void main(String[] args) {
        String s1 = "asdwwef";
        String s2 = "asdwwef";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }
        System.out.println("2 chuỗi có "+ count + " ký tự giống nhau");
    }
}
import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần đọc");
        int num = scanner.nextInt();
        String read = "";
        int unit = num % 10;
        int tens = (num % 100) / 10;
        int hundreds = num / 100;
        switch (hundreds) {
            case 1:
                read = "one hundred";
                break;
            case 2:
                read = "two hundred";
                break;
            case 3:
                read = "three hundred";
                break;
            case 4:
                read = "four hundred";
                break;
            case 5:
                read = "five hundred";
                break;
            case 6:
                read = "six hundred";
                break;
            case 7:
                read = "seven hundred";
                break;
            case 8:
                read = "eight hundred";
                break;
            case 9:
                read = "nine hundred";
                break;
        }

        if (tens != 1) {
            switch (tens) {
                case 0:
                    read = "";
                    break;
                case 2:
                    read = "twenty";
                    break;
                case 3:
                    read = "thirty";
                    break;
                case 4:
                    read = "forty";
                    break;
                case 5:
                    read = "fifty";
                    break;
                case 6:
                    read = "sixty";
                    break;
                case 7:
                    read = "seventy";
                    break;
                case 8:
                    read = "eighty";
                    break;
                case 9:
                    read = "ninety";
                    break;
            }
        } else {
            switch (unit) {
                case 0:
                    read = "ten";
                    break;
                case 1:
                    read = "eleven";
                    break;
                case 2:
                    read = "twelve";
                    break;
                case 3:
                    read = "thirteen";
                    break;
                case 4:
                    read = "fourteen";
                    break;
                case 5:
                    read = "fifteen";
                    break;
                case 6:
                    read = "sixteen";
                    break;
                case 7:
                    read = "seventeen";
                    break;
                case 8:
                    read = "eighteen";
                    break;
                case 9:
                    read = "nineteen";
                    break;
            }
        }

        if (tens != 1){
            switch (unit) {
                case 1:
                    read = "one";
                    break;
                case 2:
                    read = "two";
                    break;
                case 3:
                    read = "three";
                    break;
                case 4:
                    read = "four";
                    break;
                case 5:
                    read = "five";
                    break;
                case 6:
                    read = "six";
                    break;
                case 7:
                    read = "seven";
                    break;
                case 8:
                    read = "eight";
                    break;
                case 9:
                    read = "nine";
                    break;
            }
        }
        System.out.println(read);
    }
}
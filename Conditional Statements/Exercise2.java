import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three unique numbers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int min, mid, max;

        // Find the minimum number
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
            if (num2 <= num3) {
                mid = num2;
                max = num3;
            } else {
                mid = num3;
                max = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
            if (num1 <= num3) {
                mid = num1;
                max = num3;
            } else {
                mid = num3;
                max = num1;
            }
        } else {
            min = num3;
            if (num1 <= num2) {
                mid = num1;
                max = num2;
            } else {
                mid = num2;
                max = num1;
            }
        }

        System.out.println("Numbers in increasing order: " + min + ", " + mid + ", " + max);
    }
}
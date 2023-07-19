import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter your second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Use one of the following operations (*, /, +, -): ");
        String operation = scanner.next();

        int result;

        if (operation.equals("*")) {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operation.equals("/")) {
            result = num1 / num2;
            System.out.println("Result: " + result);
        } else if (operation.equals("+")) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operation.equals("-")) {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid operation. Please try again.");
        }
    }
}
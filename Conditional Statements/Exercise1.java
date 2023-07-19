import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter your first number: ");
        int number1 = input.nextInt();
       
        System.out.print("Enter your second number: ");
        int number2 = input.nextInt();
       
        if (number1 > number2) {
            System.out.println(number1 + " is larger than " + number2);
        } else if (number1 < number2) {
            System.out.println(number2 + " is larger than " + number1);
        } else {
            System.out.println("Both of the numbers are equal");
        }
       
        input.close();
    }
}
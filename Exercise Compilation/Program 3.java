import java.util.Scanner;

public class PackageCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter package weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter package length in centimeters: ");
        double length = scanner.nextDouble();

        System.out.print("Enter package width in centimeters: ");
        double width = scanner.nextDouble();

        System.out.print("Enter package height in centimeters: ");
        double height = scanner.nextDouble();

        boolean tooHeavy = weight > 27;
        boolean tooLarge = length * width * height > 100000;

        if (tooHeavy && tooLarge) {
            System.out.println("Too heavy and too large");
        } else if (tooHeavy) {
            System.out.println("Too heavy");
        } else if (tooLarge) {
            System.out.println("Too large");
        } else {
            System.out.println("Package meets all requirements");
        }

        scanner.close();
    }
}

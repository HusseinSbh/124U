import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the change in cents: ");
        int changeInCents = scanner.nextInt();
        scanner.close();

        int toonies = changeInCents / 200;
        changeInCents %= 200;

        int loonies = changeInCents / 100;
        changeInCents %= 100;

        int quarters = changeInCents / 25;
        changeInCents %= 25;

        int dimes = changeInCents / 10;
        changeInCents %= 10;

        int nickels = changeInCents / 5;
        int pennies = changeInCents % 5;

        System.out.printf("Your change is %d toonie(s), %d loonie(s), %d quarter(s), %d dime(s), %d nickel(s), and %d penny(ies).%n",
                toonies, loonies, quarters, dimes, nickels, pennies);
    }
}

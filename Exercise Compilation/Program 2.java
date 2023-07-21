import java.util.Scanner;

public class PrintingApplication {
    public static void main(String[] args) {
        int[] tiers = {0, 100, 500, 750, 1000};
        double[] prices = {0.30, 0.28, 0.27, 0.26, 0.25};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of copies to be printed: ");
        int numberOfCopies = scanner.nextInt();
        scanner.close();

        double pricePerCopy = 0.0;
        double totalCost = 0.0;

        for (int i = tiers.length - 1; i >= 0; i--) {
            if (numberOfCopies >= tiers[i]) {
                pricePerCopy = prices[i];
                totalCost = numberOfCopies * pricePerCopy;
                break;
            }
        }

        System.out.println("Price per copy: $" + String.format("%.2f", pricePerCopy));
        System.out.println("Total cost: $" + String.format("%.2f", totalCost));
    }
}


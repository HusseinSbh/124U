import java.util.Scanner;

public class NameAndAddressProgram {
    public static void main(String[] args) {
        String[] names = new String[5];
        String[] addresses = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();
            names[i] = name;

            System.out.print("Enter an address: ");
            String address = scanner.nextLine();
            addresses[i] = address;
        }

        System.out.println("Names and Addresses:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Address: " + addresses[i]);
            if (i < 4) {
                System.out.println();
            }
        }

        scanner.close();
    }
}


import java.util.Scanner;

public class NameAndAddress {
    public static void main(String[] args) {

        String[] names = new String[5];
        String[] addresses = new String[5];


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            System.out.print("Enter an address: ");
            String address = scanner.nextLine();

            names[i] = name;
            addresses[i] = address;
        }

        System.out.print("Enter a name to find the corresponding address: ");
        String searchName = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            String correspondingAddress = addresses[index];
            System.out.println("Corresponding address: " + correspondingAddress);
        } else {
            System.out.println("Name not found.");
        }

        scanner.close();
    }
}


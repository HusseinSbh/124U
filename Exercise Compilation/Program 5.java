import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        final int MAX_ATTEMPTS = 3;
        String correctUsername = "Hussein06"; 
        String correctPassword = "4799"; 

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Welcome!");
                break;
            } else {
                attempts++;
                System.out.println("Invalid username or password. Attempts remaining: " + (MAX_ATTEMPTS - attempts));
            }
        }

        if (attempts == MAX_ATTEMPTS) {
            System.out.println("Intruder Alert!");
        }

        scanner.close();
    }
}


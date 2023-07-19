import java.util.Scanner;

public class MoodChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("How are you feeling today? (Great, Good, Okay, Terrible): "); // Remember to add capitals
        String mood = scanner.nextLine().toLowerCase();
       
        switch (mood) {
            case "great":
                System.out.println("That's awesome! I'm glad you're doing great!");
                break;
            case "good":
                System.out.println("It's great to hear that you're feeling good!");
                break;
            case "okay":
                System.out.println("That's alright. Things will definitely get better!");
                break;
            case "terrible":
                System.out.println("I'm sorry to hear that. I hope your day gets better.");
                break;
            default:
                System.out.println("Invalid choice. Please select one of the given options.");
                break;
        }
       
        scanner.close();
    }
}
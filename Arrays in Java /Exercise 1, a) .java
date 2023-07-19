import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        int[] grades = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 grades for 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        System.out.println("\nList of Grades (Forwards):");

        for (int i = 0; i < 10; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }

        System.out.println("\nList of Grades (Backwards):");

        for (int i = 9; i >= 0; i--) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }
    }
}


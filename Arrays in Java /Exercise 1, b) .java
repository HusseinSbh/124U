import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        int[] grades = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 grades for 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += grades[i];
        }

        double average = (double) sum / 10;
        System.out.println("Average grade: " + average);
    }
}


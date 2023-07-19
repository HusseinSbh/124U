import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter your percentage grade: ");
        double percentage = scanner.nextDouble();
       
        String grade;
       
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 85) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "A-";
        } else if (percentage >= 75) {
            grade = "B+";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 65) {
            grade = "B-";
        } else if (percentage >= 60) {
            grade = "C+";
        } else if (percentage >= 55) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "C-";
        } else if (percentage >= 45) {
            grade = "D";
        } else {
            grade = "F";
        }
       
        System.out.println("Your letter grade is: " + grade);
    }
}
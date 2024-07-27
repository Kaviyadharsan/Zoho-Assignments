package assignment2;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();

       
        scanner.close();

        
        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else if (score >= 0 && score < 60) {
            grade = "F";
        } else {
            grade = "Invalid score. Please enter a score between 0 and 100.";
        }
        System.out.println("The student's grade is: " + grade);
    }
}


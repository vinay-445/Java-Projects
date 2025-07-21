import java.util.Scanner;

public class GradeCalculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        
        if (subjects <=0) {
            System.out.println("Invalid number of subjects. Exiting.");
            return;
        }

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            int marks;
            while (true) {
                System.out.print("Enter marks for subject " + i + " (0 - 100): ");
                marks = scanner.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            }
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / subjects;
        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 85) {
            grade = 'B';
        } else if (averagePercentage >= 75) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
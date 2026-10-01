package assignmentsolutions.conditionalLoops.Intermediate;

// Calculate CGPA

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();

        double totalGradePoints = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double gradePoint = sc.nextDouble();

            totalGradePoints += gradePoint;
        }

        double cgpa = totalGradePoints / subjects;

        System.out.println("CGPA = " + cgpa);
    }
}
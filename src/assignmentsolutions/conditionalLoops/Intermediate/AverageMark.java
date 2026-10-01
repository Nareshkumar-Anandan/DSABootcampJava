package assignmentsolutions.conditionalLoops.Intermediate;

//Calculate Average Marks

import java.util.Scanner;

public class AverageMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Subjects : ");
        int numberOfSubjects = sc.nextInt();
        int totalMark = 0;
        for (int i = 1; i <= numberOfSubjects ; i++) {
            System.out.println("Enter the " + i + "st subject Mark");
            int subject = sc.nextInt();
            totalMark += subject;
        }
        double average = (double) totalMark / numberOfSubjects;

        System.out.println("The Average marks : " + average);

    }
}

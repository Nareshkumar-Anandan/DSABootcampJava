package assignmentsolutions.conditionalLoops.Intermediate;

// Calculate Commission Percentage


import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Profit amount : ");
        int profitAmount = sc.nextInt();
        System.out.println("Enter the Commission amount : ");
        int commissionAmount = sc.nextInt();

        double commissionPercentage = (double) (commissionAmount * 100 )/ profitAmount;

        System.out.println("The Commission Percentage is : " + commissionPercentage);
    }
}

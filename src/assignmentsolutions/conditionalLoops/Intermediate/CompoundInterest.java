package assignmentsolutions.conditionalLoops.Intermediate;

// Compound Interest Java Program
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal value : ");
        double principleAmount = sc.nextInt();
        System.out.println("Enter the rate % : ");
        double ratePercentage = sc.nextInt();
        System.out.println("Enter the Year : ");
        int year = sc.nextInt();
        double compoundInterest = principleAmount;
        for (int i = 1; i <= year ; i++) {
             compoundInterest = compoundInterest * (1 + (ratePercentage / 100));
        }
        System.out.println("The total value : " + compoundInterest);

    }
}

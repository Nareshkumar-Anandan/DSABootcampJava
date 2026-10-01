package assignmentsolutions.conditionalLoops.Intermediate;

// Future Investment Value

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Investment Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double futureValue =
                principal * Math.pow((1 + rate / 100), years);

        System.out.println("Future Investment Value = " + futureValue);
    }
}
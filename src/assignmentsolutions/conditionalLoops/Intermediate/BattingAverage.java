package assignmentsolutions.conditionalLoops.Intermediate;
import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Runs: ");
        int runs = sc.nextInt();

        System.out.print("Enter Number of Times Out: ");
        int outs = sc.nextInt();

        double average = (double) runs / outs;

        System.out.println("Batting Average = " + average);
    }
}
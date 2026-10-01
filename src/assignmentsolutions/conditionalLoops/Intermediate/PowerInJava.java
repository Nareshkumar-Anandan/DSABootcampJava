package assignmentsolutions.conditionalLoops.Intermediate;

import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        double result = Math.pow(base, power);

        System.out.println("Result = " + result);
    }
}
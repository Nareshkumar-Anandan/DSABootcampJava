package assignmentsolutions.conditionalLoops.Intermediate;

//Calculate Average Of N Numbers


import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        double average = (double) sum / n;

        System.out.println("Average = " + average);
    }

}

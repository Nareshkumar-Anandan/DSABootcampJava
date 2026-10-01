package assignmentsolutions.conditionalLoops.Intermediate;

import java.util.Scanner;

// Sum Of N Numbers
public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += i;
        }
        System.out.println("The total sum is " + sum);
    }
}

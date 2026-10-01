package assignmentsolutions.conditionalLoops.Intermediate;

//Calculate Depreciation of Value
import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount : ");
        double P = sc.nextInt();
        System.out.println("Enter the Depreciation Rate percentage : ");
        double R = sc.nextInt();
        System.out.println("Enter the years :");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            P = P * ( 1 - R / 100);
        }
        System.out.println("Value after depreciation : " + P);
    }
}

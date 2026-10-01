package assignmentsolutions.conditionalLoops.Intermediate;

// Calculate Distance Between Two Points

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pointer x1 :");
        int x1 = sc.nextInt();
        System.out.println("Enter the pointer x2 :");
        int x2 = sc.nextInt();
        System.out.println("Enter the pointer y1 :");
        int y1 = sc.nextInt();
        System.out.println("Enter the pointer y2 :");
        int y2 = sc.nextInt();

        double ans = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));

        System.out.println(ans);
    }

}

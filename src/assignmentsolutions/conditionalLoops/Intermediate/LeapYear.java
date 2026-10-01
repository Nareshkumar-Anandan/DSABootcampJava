package assignmentsolutions.conditionalLoops.Intermediate;

//Check Leap Year Or Not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting Year to find Lear Year or Not : ");
        int year1 = sc.nextInt();

        System.out.println("Enter the Ending Year to find Lear Year or Not : ");
        int year2 = sc.nextInt();
        int count = 0;
        for (int i = year1; i <=year2 ; i++) {
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                System.out.print(i + ",");
                count ++;
            }
        }
        System.out.println("\nTotal Leap Years = " + count);
    }
}

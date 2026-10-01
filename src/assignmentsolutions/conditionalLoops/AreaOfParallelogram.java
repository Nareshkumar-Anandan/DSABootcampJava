package assignmentsolutions.conditionalLoops;

import java.util.Scanner;

// Area Of Parallelogram

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of base : ");
        int base = sc.nextInt();

        System.out.println("Enter the value of height : ");
        int height = sc.nextInt();

        int areaOfParallelogram = base * height;

        System.out.println("The area of Parallelogram : " + areaOfParallelogram);

    }
}

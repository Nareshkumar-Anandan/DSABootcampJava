package assignmentsolutions.conditionalLoops;

//Area Of Rhombus

import java.util.Scanner;

public class areaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of d1 : ");
        int d1 = sc.nextInt();

        System.out.println("Enter the value of d2 : ");
        int d2 = sc.nextInt();

        float areaOfRhombus = (float) (0.5 * d1 * d2);

        System.out.println("The area of Rhombus : " + areaOfRhombus);

    }

}

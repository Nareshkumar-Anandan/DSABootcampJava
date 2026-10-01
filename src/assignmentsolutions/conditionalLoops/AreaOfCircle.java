package assignmentsolutions.conditionalLoops;

//Area Of Circle Java Program


import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius : ");
        float radius = sc.nextFloat();

        float areaofcircle = (float)(3.14 * radius * radius);

        System.out.println(areaofcircle);

    }
}

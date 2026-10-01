package assignmentsolutions.firstjava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Principal Amount :");
        int p = sc.nextInt();

        System.out.println("Annual Rate :");
        int r = sc.nextInt();

        System.out.println("Time :");
        int t = sc.nextInt();

        float simpleInterest = (float) (p * r * t) / 100;

        System.out.println(simpleInterest);

    }
}

package assignmentsolutions.firstjava;

import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name :");
        String name = sc.next();

        System.out.println("Welcome " + name);


    }
}

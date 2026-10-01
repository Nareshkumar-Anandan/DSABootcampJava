package assignmentsolutions.flowofprogram;

import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.

public class Greetings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        System.out.println("Greetings " + name);
    }
}

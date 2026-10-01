package assignmentsolutions.flowofprogram;

// Take a number as input and print its multiplication table.

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");

        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number : ");

        int num2 = sc.nextInt();

        int ans = num1 * num2;

        System.out.println("The multiplication of "+ num1 + " and " + num2 + " is "+ ans);

    }
}

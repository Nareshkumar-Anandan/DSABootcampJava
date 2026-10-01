package assignmentsolutions.firstjava;

//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n ; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;


        }

    }

}

package assignmentsolutions.firstjava;

// Input currency in rupees and output in USD.

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the Indian rupee : ");
        double inr = sc.nextDouble();
        double oneusd = 95.73;
        double usd = inr / oneusd;

        System.out.println(usd);

    }
}

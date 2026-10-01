package assignmentsolutions.conditionalLoops.Intermediate;
//Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. \
// The list terminates when the user enters a zero.

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativeSum = 0;
        int sumOfpositivesum = 0;
        int sumofOddSum = 0;
        while (true){
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            if(num == 0){
                break;
            } else if (num < 0) {
                negativeSum += num;
            }else {
                if(num % 2 == 0){
                    sumOfpositivesum += num;
                }else {
                    sumofOddSum += num;
                }
            }
        }
        System.out.println("The negative sum is : " + negativeSum);
        System.out.println("The Positive even sum is : " + sumOfpositivesum);
        System.out.println("The Positive odd sum is : " + sumofOddSum);
    }
}

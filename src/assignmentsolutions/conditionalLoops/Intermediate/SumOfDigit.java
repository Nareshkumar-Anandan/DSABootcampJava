package assignmentsolutions.conditionalLoops.Intermediate;

//Sum Of A Digits Of Number


import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp != 0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("Sum of the digit is " + sum);
    }
}

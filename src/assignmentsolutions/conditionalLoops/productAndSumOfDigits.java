package assignmentsolutions.conditionalLoops;

//[Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)

import java.util.Scanner;

public class productAndSumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input of the number : ");
        int n = sc.nextInt();
        System.out.println("The subtraction of product and sum of digit is : " + subtractProductSum(n));

    }
    public static int subtractProductSum(int n){
        int temp = n;
        int subtract =0;
        int product = 1;
        int sum = 0;

        while (temp > 0){
            int digit = temp % 10;
            product *= digit;
            sum += digit;

            temp /= 10;

        }
        subtract = product - sum;

        return subtract;
    }


}

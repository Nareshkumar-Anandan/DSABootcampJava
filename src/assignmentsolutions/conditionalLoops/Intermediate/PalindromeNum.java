package assignmentsolutions.conditionalLoops.Intermediate;


// Find if a number is palindrome or not

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int reversed = 0;
        while (temp != 0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if(num == reversed){
            System.out.println("The given number is palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}

package assignmentsolutions.firstjava;

// To find Armstrong Number between two given number.

import java.util.Scanner;

public class ArmstrongNumbettwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = sc.nextInt();

        System.out.println("The Armstrong numbers are : ");

        for (int num = num1; num < num2 ; num++) {

            int original = num;

            int temp = original;
            int count = 0;
            while(temp > 0){
                count ++ ;
                temp /= 10;
            }
            temp = original;
            int sum = 0 ;
            while (temp > 0){
                int digit = temp % 10;

                int power = 1;
                for (int i = 0; i <count ; i++) {
                    power *= digit;
                }
                sum += power;
                temp /= 10;

            }
            if(original == sum){
                System.out.println(sum);
            }

        }
    }
}

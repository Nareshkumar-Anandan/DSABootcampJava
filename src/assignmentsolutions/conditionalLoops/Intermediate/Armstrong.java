package assignmentsolutions.conditionalLoops.Intermediate;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Armstrong number : ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0){
            count ++;
            temp = temp / 10;
        }
        int sum = 0 ;
        int original = n;
        while (original != 0){
            int digit = original % 10;

            int power = 1;
            for (int i = 0; i <count ; i++) {
                power *= digit;
            }
            sum += power;
            original /= 10;

        }
        if(n == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}

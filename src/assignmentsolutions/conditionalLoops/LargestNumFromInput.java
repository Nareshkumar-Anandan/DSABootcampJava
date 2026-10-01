package assignmentsolutions.conditionalLoops;

//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestNumFromInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest  = 0;
        while (true){
            System.out.println("Enter the number to find the largest or zero to stop : ");
            int n = sc.nextInt();

            if (n == 0){
                break;
            }
            if( largest <= n){
                largest = n;
            }

        }
        System.out.println("Largest number : " + largest);
    }
    
}

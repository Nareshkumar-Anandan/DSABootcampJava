package assignmentsolutions.conditionalLoops;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers
//    (HINT: while loop)
public class SumOfallNumbertillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter the number or zero to stop : ");
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            sum += n;

        }
        System.out.println("Total : " + sum);
    }

}

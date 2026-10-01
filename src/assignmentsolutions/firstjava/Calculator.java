package assignmentsolutions.firstjava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        char check = sc.next().charAt(0);
        int c =0;

        if(check == '+'){
            c = a + b;
            System.out.println("Ans " + c);
        } else if (check == '-') {
            c = a - b;
            System.out.println(c);
        } else if (check == '*') {
            c = a * b;
            System.out.println(c);
        }else {
            c = a / b;
            System.out.println(c);
        }
    }

}

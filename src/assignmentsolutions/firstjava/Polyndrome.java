package assignmentsolutions.firstjava;

// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Polyndrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String original = sc.nextLine();
        
        String reversed = "" ;

        for (int i = original.length() - 1 ; i >= 0 ; i--) {
            reversed += original.charAt(i);
        }
        if(original.equalsIgnoreCase(reversed)){
            System.out.println("The Given Number is polyndrome");
        }else {
            System.out.println("The Given Number is Not a polyndrome");
        }



    }
}

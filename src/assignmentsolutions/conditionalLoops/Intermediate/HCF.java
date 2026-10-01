package assignmentsolutions.conditionalLoops.Intermediate;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int LCM = a;
        System.out.println("LCM : " + a);
        double HCF = (double) num1 * num2/LCM;
        System.out.println("HCF : " + HCF);
    }
}

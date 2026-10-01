package assignmentsolutions.conditionalLoops;

//Addition of two numbers
import java.util.Scanner;
public class AddtwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int n2 = sc.nextInt();

        System.out.println(addTwoNumbers(n1,n2));
    }
    public static int addTwoNumbers(int a , int b){
        int add = a + b;
        return add;
    }
}

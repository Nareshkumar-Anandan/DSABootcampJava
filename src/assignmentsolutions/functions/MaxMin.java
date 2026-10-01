package assignmentsolutions.functions;
// Define two methods to print the maximum and
// the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Max(a,b,c);
        int min = Min(a,b,c);
        System.out.println("The Maximum Number : "+ max);
        System.out.println("The Minimum Number : "+ min);
    }
    public static int Max(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
    public static int Min(int a, int b, int c) {

        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        return min;
    }
}

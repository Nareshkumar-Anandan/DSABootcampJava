package assignmentsolutions.flowofprogram;

//

import java.util.Scanner;

public class Xtostop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.println("Enter a number or x to stop : ");
            String value = sc.next();

            if(value.equals("x")){
                break;
            }
            int num = 0;
            for (int i = 0; i <value.length() ; i++) {
                num =num * 10 + (value.charAt(i) - '0');
            }
            sum += num;

        }
        System.out.println("The sum of the entered numbers are " + sum);



    }
    }


package assignmentsolutions.conditionalLoops.Intermediate;

// Calculate Discount Of Product

import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Product Rate : ");
        int mrp = sc.nextInt();
        System.out.println("Enter the value of Discount : ");
        int discount = sc.nextInt();

        double discountPrice = (double) (mrp * discount) / 100;
        System.out.println("The discountPrice is : " + discountPrice);

        double finalPrice = mrp - discountPrice;

        System.out.println("The product rate after discount is : " + finalPrice);

    }
}

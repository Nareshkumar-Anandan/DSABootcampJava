package assignmentsolutions.conditionalLoops.Intermediate;

//Calculate the Electricity Bill

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Unit Which was used by the customer : ");

        int units = sc.nextInt();
        double bill = electricityBill(units);
        System.out.println("The Total Amount is : " + bill);

    }
    public static double electricityBill(int units) {
        double billAmount = 0;

        // TIER 1: Consumption is 500 units or less (Highly Subsidized)
        if (units <= 500) {
            // First 200 units are free
            if (units <= 200) {
                billAmount = 0;
            }
            // 201 to 400 units slab (Charged at ₹4.70/unit)
            else if (units <= 400) {
                billAmount = (units - 200) * 4.70;
            }
            // 401 to 500 units slab (Charged at ₹6.30/unit)
            else {
                billAmount = (200 * 4.70) + ((units - 400) * 6.30);
            }
        }
        // TIER 2: Consumption is ABOVE 500 units (Subsidy drops, rates increase)
        else {
            // Only the first 100 units remain free.

            // Slab 101 to 400 units (₹4.70/unit)
            billAmount += (300 * 4.70);

            // Slab 401 to 500 units (₹6.30/unit)
            billAmount += (100 * 6.30);

            // Slab 501 to 600 units (₹8.40/unit)
            if (units <= 600) {
                billAmount += (units - 500) * 8.40;
            } else {
                billAmount += (100 * 8.40);

                // Slab 601 to 800 units (₹9.45/unit)
                if (units <= 800) {
                    billAmount += (units - 600) * 9.45;
                } else {
                    billAmount += (200 * 9.45);

                    // Slab Above 800 units (₹11.00+ depending on exact slab)
                    billAmount += (units - 800) * 11.05;
                }
            }
        }

        // Optional real-world additions:
        // In TN, a small fixed charge (approx ₹30-₹45) and a minor fuel adjustment
        // charge (~₹0.20 per unit) are also added to the final total.

        return billAmount;
    }


}

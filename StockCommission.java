
/**
 * This program calculates the total cost of purchasing stock,
 * including a commission fee defined as a constant.
 *
 * @author Chaz Hoang
 * @version (1.0)
 * @since 2/22/25
 */

import java.util.Scanner;

public class StockCommission {
    public static void main(String[] args) {
        // Scanner for reading numbers
        Scanner input = new Scanner(System.in);

        // Commission rate constant (2%)
        final double COMMISSION_RATE = 0.02;

        // Ask the user for info
        System.out.print("Enter number of shares purchased: ");
        int shares = input.nextInt();

        System.out.print("Enter price per share: ");
        double price = input.nextDouble();

        // Calculate three
        double stockCost = shares * price;
        double commission = stockCost * COMMISSION_RATE;
        double totalCost = stockCost + commission;

        // Show result
        System.out.println("\nTotal cost of shares are: $" + stockCost);
        System.out.println("Commission cost is: $" + commission);
        System.out.println("Total Cost is: $" + totalCost);
    }
}

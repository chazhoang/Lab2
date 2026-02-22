/**
 * This program asks the user for their first, middle, and last names,
 * and displays their full name with initials
 *
 * @author Chaz Hoang
 * @version (1.0)
 * @since 2/22/26
 */

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for their name info
        System.out.print("Enter your first name: ");
        String first = input.nextLine();

        System.out.print("Enter your middle name: ");
        String middle = input.nextLine();

        System.out.print("Enter your last name: ");
        String last = input.nextLine();

        // Extract the first character of each name
        char firstInit = first.charAt(0);
        char middleInit = middle.charAt(0);
        char lastInit = last.charAt(0);

        // Print out names
        System.out.println("\nMy name is: " + first + " " + middle + " " + last);
        System.out.println("My initials are: " + firstInit + middleInit + lastInit);
    }
}

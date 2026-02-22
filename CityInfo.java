/**
 * This program asks the user for a city name and displays
 * its length, uppercase version, lowercase version, and first character.
 *
 * @author Chaz Hoang
 * @version (1.0)
 * @since 2/21/26
 */

import java.util.Scanner;

public class CityInfo {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for city name
        System.out.print("Enter a city: ");
        String city = input.nextLine();

        // Display city facts
        System.out.println("\nThe city entered has: " + city.length() + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + city.charAt(0));
    }
}

/**
 * Demonstrates floating point imprecision with very large numbers.
 *
 * @author Chaz Hoang
 * @version 2/15/26
 */
public class Imprecision
{
    public static void main(String[] args)
    {
        // declare variables
        double x, y, z;

        // assign values
        x = 12345.6789e200;
        y = 1 / x;
        z = x * y;

        // display results
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z (x*y) is: " + z);
        System.out.println("The value of 1 - z is: " + (1 - z));
    }
}

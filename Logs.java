/*
* The Logs program allows the user to calculate
* the amount of maple logs that can be put inside their truck.
*
* @author  Daria Bernice Calitis
* @version 1.0
* @since   2022-09-13
*/

// Import Scanner
import java.util.Scanner;

/**
* .Class constructor Logs.
*/
final class Logs {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Logs() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Create Scanner Object
        final Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the maple logs (m): ");

        // Gets the length of the logs
        final float logLength = scan.nextFloat();

        // Constants
        final int WEIGHT_CAPACITY = 1100;
        final int LOG_DENSITY = 20;

        // Calculates the number of logs that could fit in the truck
        final float numberOfLogs =
            WEIGHT_CAPACITY / LOG_DENSITY / logLength;

        // Prints out the result
        System.out.printf("%d logs can fit into the truck",
            Math.round(numberOfLogs)
        );

        System.out.println("\n\nDone.");
    }
}

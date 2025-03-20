package s03fundamentos.exercises.services;

import java.util.Scanner;

/**<p>
 * Service class that implements the functionality for each exercise.
 * </p>
 * This class contains methods that perform the actual operations for
 * each menu option/exercise.
 */
public class MenuService {

    private final Scanner sc;

    /**
     * Constructs a MenuService with the specified Scanner object
     *
     * @param sc The scanner for reading user inputs
     */
    public MenuService(Scanner sc) {
        this.sc = sc;
    }

    /**<p>
     * Converts a temperature from Fahrenheit to Celsius.
     * </p>
     * Prompts the user for a temperature in Fahrenheit,
     * converts it to Celsius, and displays the result.
     */
    public void convertFahrenheitToCelsius() {
        System.out.print("Temperature in Fahrenheit: ");

        while (!sc.hasNextDouble()) {
            showInvalidInputMessage();
            System.out.print("Temperature in Fahrenheit: ");
            sc.next();
        }

        double fahrenheit = sc.nextDouble();
        sc.nextLine();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%,.2f Fº = %,.2f Cº%n%n", fahrenheit, celsius);
    }

    /**<p>
     * Converts a temperature from Celsius to Fahrenheit.
     * </p>
     * Prompts the user for a temperature in Celsius,
     * converts it to Fahrenheit, and displays the result.
     */
    public void convertCelsiusToFahrenheit() {
        System.out.print("Temperature in Celsius: ");

        while (!sc.hasNextDouble()) {
            showInvalidInputMessage();
            System.out.print("Temperature in Celsius: ");
            sc.next();
        }

        double celsius = sc.nextDouble();
        sc.nextLine();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%,.2f Cº = %,.2f Fº%n%n", celsius, fahrenheit);

    }

    public void showInvalidInputMessage() {
        System.out.println("Invalid input. Please try again.");
    }
}

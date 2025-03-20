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

    /**
     * <p>
     *  Calculates the BMI (Body Mass Index) of a person
     * </p>
     * Prompts the user for the weight and height values,
     * then calculates the BMI and displays the result
     */
    public void calculateBMI() {
        System.out.print("Height in meters: ");

        while (!sc.hasNextDouble()) {
            showInvalidInputMessage();
            System.out.print("Height in meters: ");
            sc.next();
        }
        double height = sc.nextDouble();

        System.out.print("Weight in kilograms: ");
        while (!sc.hasNextDouble()) {
            showInvalidInputMessage();
            System.out.print("Weight in kilograms: ");
            sc.next();
        }
        double weight = sc.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.printf("A %.2f m tall person, with %.2f kg weight has a BMI of %.2f%n\n",
                height, weight, bmi);
    }

    /**
     * <p>
     *  Calculates the square and cube of a single value
     * </p>
     * Prompts the user for a value, then calculates and
     * displays the square and cube results
     */
    public void calculateSquareAndCube() {
        System.out.print("Type a value: ");

        while (!sc.hasNextDouble()) {
            showInvalidInputMessage();
            System.out.print("Type a value: ");
            sc.next();
        }

        double value = sc.nextDouble();
        double square = Math.pow(value, 2);
        double cube = Math.pow(value, 3);

        System.out.printf("%,.2f² = %,.2f%n", value, square);
        System.out.printf("%,.2f³ = %,.2f%n%n", value, cube);
    }


    public void showInvalidInputMessage() {
        System.out.println("Invalid input. Please try again.");
    }
}

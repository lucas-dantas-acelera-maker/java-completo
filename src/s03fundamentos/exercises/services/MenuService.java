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
        double fahrenheit = getValidDoubleInput("Temperature in Fahrenheit: ");
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
        double celsius = getValidDoubleInput("Temperature in Celsius: ");
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
        double height = getValidDoubleInput("Height in meters: ");
        double weight = getValidDoubleInput("Weight in kilograms: ");

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
        double value = getValidDoubleInput("Type a value: ");
        double square = Math.pow(value, 2);
        double cube = Math.pow(value, 3);

        System.out.printf("%,.2f² = %,.2f%n", value, square);
        System.out.printf("%,.2f³ = %,.2f%n%n", value, cube);
    }

    /**
     * <p>
     *  Calculates the area of a triangle
     * </p>
     * Prompts the user for base and height values,
     * then calculates and displays the triangle's area
     */
    public void calculateTriangleArea() {
        double base = getValidDoubleInput("Triangle's base: ");
        double height = getValidDoubleInput("Triangle's height: ");
        double area = (base * height) / 2;

        System.out.printf("%,.2f base and %,.2f height triangle area: %,.2f%n%n", base, height, area);
    }

    /**
     * <p>
     *  Solves a quadratic equation
     * </p>
     * Prompts the user for a, b and c values,
     * calculates the discriminant, applies the bhaskara's formula
     * and then prints the result
     */
    public void solveQuadraticEquation() {
        double a = getValidDoubleInput("A value: ");
        double b = getValidDoubleInput("B value: ");
        double c = getValidDoubleInput("C value: ");

        // Get discriminant
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        // Bhaskara formula
        double x1 = (Math.pow(b, 2) + Math.sqrt(discriminant)) / 2 * a;
        double x2 = (Math.pow(b, 2) - Math.sqrt(discriminant)) / 2 * a;

        if (discriminant >= 0) {
            System.out.printf("Quadratic equation: %n");
            System.out.printf("%,.2f + %,.2f + %,.2f = 0%n", a, b, c);
            System.out.printf("Discriminant: %,.2f%n", discriminant);
            System.out.printf("x1 = %,.2f%n", x1);
            System.out.printf("x2 = %,.2f%n%n", x2);
        } else {
            System.out.printf("Discriminant: %,.2f%n", discriminant);
            System.out.println("Negative discriminant quadratic equations have no real x's values\n");
        }

    }

    private double getValidDoubleInput(String input) {
        System.out.print(input);
        while (!sc.hasNextDouble()) {
            showInvalidInputMessage();
            System.out.print(input);
            sc.next();
        }
        return sc.nextDouble();
    }

    public void showInvalidInputMessage() {
        System.out.println("Invalid input. Please try again.");
    }
}

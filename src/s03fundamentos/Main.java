package s03fundamentos;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("==================JAVA CALCULATOR START==================");
            boolean isRunning = true;

            while (isRunning) {
                System.out.println("Enter expression (e.g., 10.5 + 15, 5 * 2)");
                System.out.print("Type 'exit' to quit: ");
                String expression = sc.nextLine();

                if (expression.trim().equalsIgnoreCase("exit")) {
                    isRunning = false;
                    System.out.println("==================JAVA CALCULATOR CLOSE==================");
                    continue;
                }

                String[] parts = expression.split(" ");
                if (parts.length != 3) {
                    System.out.println("Invalid input format: " + expression);
                    System.out.println("Please, use blank spaces as separator.\n");
                    continue;
                }

                try {
                    double x = Double.parseDouble(parts[0]);
                    String operator = parts[1];
                    double y = Double.parseDouble(parts[2]);
                    Double res = null;

                    switch (operator) {
                        case "+" -> res = Calculator.add(x, y);
                        case "-" -> res = Calculator.subtract(x, y);
                        case "*" -> res = Calculator.multiply(x, y);
                        case "/" -> res = Calculator.divide(x, y);
                        default -> System.out.println("Only +, -, / and * operators are valid.\n");
                    }

                    if (res != null) {
                        System.out.printf("%s = %,.2f%n%n", expression, res);
                    }

                } catch (NumberFormatException e) {
                    System.out.printf("Invalid number format. %s%n%n", e.getMessage());
                }
            }
        }
    }

    public static class Calculator {
        public static Double add(Double x, Double y) {
            return x + y;
        }

        public static Double multiply(Double x, Double y) {
            return x * y;
        }

        public static Double subtract(Double x, Double y) {
            return x - y;
        }

        public static Double divide(Double x, Double y) {
            if (y == 0) {
                System.out.println("Error: Division by zero is not allowed.\n");
                return null;
            }
            return x / y;
        }
    }
}

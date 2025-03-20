package s03fundamentos.exercises.application;

import s03fundamentos.exercises.controllers.MenuController;
import s03fundamentos.exercises.models.Menu;
import s03fundamentos.exercises.models.MenuOption;
import s03fundamentos.exercises.services.MenuService;
import s03fundamentos.exercises.views.MenuView;

import java.util.Locale;
import java.util.Scanner;

/**<p>
 * Main application class that initializes the menu system and adds menu options
 * for various exercises.
 * </p>
 * This class sets up the application components using dependency injection and
 * configures the menu options available to users.
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {

            Menu menu = new Menu();
            MenuView menuView = new MenuView();
            MenuController menuController = new MenuController(menu, menuView, sc);
            MenuService menuService = new MenuService(sc);

            MenuOption op1 = new MenuOption(
                    1, "Convert Fahrenheit to Celsius", menuService::convertFahrenheitToCelsius
            );

            MenuOption op2 = new MenuOption(
                    2, "Convert Celsius to Fahrenheit",menuService::convertCelsiusToFahrenheit
            );

            menu.addMenuOption(op1);
            menu.addMenuOption(op2);

            menuController.startMenu();
        }
    }
}

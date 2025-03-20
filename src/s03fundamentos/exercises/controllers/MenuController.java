package s03fundamentos.exercises.controllers;

import s03fundamentos.exercises.models.Menu;
import s03fundamentos.exercises.models.MenuOption;
import s03fundamentos.exercises.views.MenuView;

import java.util.Scanner;

/**<p>
 * Controller class that handles user interaction with the menu.
 * </p>
 * This class manages the menu loop, processes user input, and executes
 * the selected menu options.
 */
public class MenuController {
    private final Menu menu;
    private final MenuView menuView;
    Scanner sc;

    /**
     * Constructs a MenuController with the specified menu and view.
     *
     * @param menu The menu containing available options
     * @param menuView The view for displaying the menu
     */
    public MenuController(Menu menu, MenuView menuView, Scanner sc) {
        this.menu = menu;
        this.menuView = menuView;
        this.sc = sc;
    }

    /**<p>
     * Starts the menu interaction loop.
     * </p>
     * Displays the menu, processes user input, and executes selected options
     * until the user chooses to exit.
     */
    public void startMenu() {
        System.out.println("==============BASIC CONCEPTS EXERCISES START==============");
        int option;

        do {
            menuView.displayMenu(menu);

            while (!sc.hasNextInt()) {
                sc.next();
                menuView.showInvalidOption();
                menuView.displayMenu(menu);
            }

            option = sc.nextInt();

            if (option == 0) {
                System.out.println("==============BASIC CONCEPTS EXERCISES CLOSE==============");
                break;
            }

            MenuOption selectedOption = menu.getMenuOptionById(option);

            if (selectedOption != null) {
                selectedOption.execute();
            } else {
                menuView.showInvalidOption();
            }
        } while (true);

    }
}

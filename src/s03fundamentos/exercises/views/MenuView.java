package s03fundamentos.exercises.views;

import s03fundamentos.exercises.models.Menu;
import s03fundamentos.exercises.models.MenuOption;

import java.util.List;

/**<p>
 * View class responsible for displaying the menu and user interface messages.
 *</p>
 * This class handles all output to the console related to menu navigation,
 * including displaying menu options and error messages.
 */
public class MenuView {
    /**
     * Displays the menu with all available options.
     * <p>
     * Shows the exit option (0) and all exercise options from the menu.
     * </p>
     * @param menu The menu object containing all available options
     */
    public void displayMenu(Menu menu) {
        List<MenuOption> options = menu.getOptions();

        System.out.println("0 - Exit ");
        for (MenuOption op : options) {
            System.out.println(op);
        }
        System.out.print("Type the desired option: ");
    }

    /**
     * Displays an error message when the user selects an invalid menu option.
     */
    public void showInvalidOption() {
        System.out.println("Invalid option! Please try again.\n");
    }
}

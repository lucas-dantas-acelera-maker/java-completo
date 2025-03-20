package s03fundamentos.exercises.models;

import java.util.ArrayList;
import java.util.List;

/**<p>
 * Entity class representing the application menu.
 * </p>
 * This class manages a collection of menu options and provides
 * methods to access and manipulate them.
 */
public class Menu {
    private final List<MenuOption> options = new ArrayList<>();

    /**
     * Gets the list of all menu options.
     *
     * @return List of menu options
     */
    public List<MenuOption> getOptions() {
        return options;
    }

    /**
     * Adds a new option to the menu.
     *
     * @param option The menu option to add
     */
    public void addMenuOption(MenuOption option) {
        options.add(option);
    }

    /**
     * Retrieves a menu option by its ID.
     *
     * @param id The ID of the menu option to find
     * @return The menu option with the specified ID, or null if not found
     */
    public MenuOption getMenuOptionById(Integer id) {
        return options.stream()
                .filter(option -> option.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

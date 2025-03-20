package s03fundamentos.exercises.models;

/**<p>
 * Entity class representing a single menu option.
 *</p>
 * This class encapsulates the information and behavior for a menu option,
 * including its ID, display text, and the action to execute when selected.
 */
public class MenuOption {
    private final Integer id;
    private final String text;
    private final Runnable action;

    /**
     * Constructs a new MenuOption with the specified parameters.
     *
     * @param id Unique identifier for the menu option
     * @param text Display text for the menu option
     * @param action Action to execute when this option is selected
     */
    public MenuOption(Integer id, String text, Runnable action) {
        this.id = id;
        this.text = text;
        this.action = action;
    }

    /**
     * Gets the ID of this menu option.
     *
     * @return The menu option ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * Executes the action associated with this menu option.
     */
    public void execute() {
        action.run();
    }

    /**
     * Returns a string representation of the menu option.
     *
     * @return A string in the format "id - text"
     */
    @Override
    public String toString() {
        return id + " - " + text;
    }
}

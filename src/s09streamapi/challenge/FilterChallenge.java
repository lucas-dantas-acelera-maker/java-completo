package s09streamapi.challenge;

import s09streamapi.challenge.entities.Person;
import s09streamapi.challenge.utils.StringOps;

import java.util.Arrays;
import java.util.List;

public class FilterChallenge {
    public static void main(String[] args) {
        /*
        * Create 2 lambda expressions to use in 2 different filter() methods
        * Apply a map() in the end
        * */

        try {
            List<Person> people = Arrays.asList(
                    new Person("Lucas", 24, "m"),
                    new Person("Carol", 21, "f"),
                    new Person("Carlos", 15, "m"),
                    new Person("Rae", 27, "other"),
                    new Person("Gustavo", 26, "M"),
                    new Person("Guilherme", 15, "m"),
                    new Person("Malu", 8, "f"),
                    new Person("Sara", 13, "f")
            );

            System.out.println("Original list: ");
            people.forEach(System.out::println);

            System.out.println("---------------------------------");
            System.out.println("18+ non-male uppercased name people: ");
            people.stream().filter(person -> person.getAge() >= 18)
                    .filter(person -> !person.getGender().equalsIgnoreCase("m"))
                    .map(person -> StringOps.uppercase.apply(person.getName()))
                    .forEach(System.out::println);

        } catch (RuntimeException e) {
            System.out.printf("Error: %s%n", e.getMessage());
        }

    }
}

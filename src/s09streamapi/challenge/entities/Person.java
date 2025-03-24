package s09streamapi.challenge.entities;

public class Person {
    private String name;
    private Integer age;
    private String gender;

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        if (validateGender(gender)) {
            this.gender = gender;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getName() + " - "
                + getAge() + " years old"
                + " - Gender: " + getGender().toUpperCase();
    }

    public boolean validateGender(String gender) {
        if (gender.equalsIgnoreCase("m")) {
            return true;
        }

        if (gender.equalsIgnoreCase("f")) {
            return true;
        }

        if (gender.equalsIgnoreCase("other")) {
            return true;
        }

        throw new IllegalArgumentException("Invalid gender option. Enter 'M', 'F', or 'Other'");
    }
}

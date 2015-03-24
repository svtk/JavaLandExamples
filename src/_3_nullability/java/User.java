package _3_nullability.java;

import org.jetbrains.annotations.Nullable;

public class User {
    private final String firstName;
    private final String lastName;
    private final Integer age;

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Nullable
    public Integer getAge() {
        return age;
    }
}
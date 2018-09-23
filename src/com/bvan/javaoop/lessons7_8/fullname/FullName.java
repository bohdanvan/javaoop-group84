package com.bvan.javaoop.lessons7_8.fullname;

/**
 * @author bvanchuhov
 */
public class FullName {

    private final String firstName;
    private final String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "name='" + firstName + '\'' +
                ", surname='" + lastName + '\'' +
                '}';
    }
}

package com.bvan.javaoop.lessons7_8.fullname;

/**
 * @author bvanchuhov
 */
public class IllegalFirstNameException extends IllegalFullNameException {

    public IllegalFirstNameException() {
    }

    public IllegalFirstNameException(String message) {
        super(message);
    }
}

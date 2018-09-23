package com.bvan.javaoop.lessons7_8.fullname;

/**
 * @author bvanchuhov
 */
public class IllegalLastNameException extends IllegalFullNameException {

    public IllegalLastNameException() {
    }

    public IllegalLastNameException(String message) {
        super(message);
    }
}

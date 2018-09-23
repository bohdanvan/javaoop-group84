package com.bvan.javaoop.lessons7_8.fullname;

/**
 * @author bvanchuhov
 */
public class FullNameParserImpl implements FullNameParser {

    @Override
    public FullName parse(String s) throws IllegalFullNameException {
        String[] words = s.split(" ");
        if (words.length != 2) {
            throw new IllegalFullNameException("illegal format: should be <firstName> <lastName>");
        }

        String firstName = words[0];
        if (!NameValidator.isName(firstName)) {
            throw new IllegalFirstNameException();
        }

        String lastName = words[1];
        if (!NameValidator.isName(lastName)) {
            throw new IllegalLastNameException();
        }

        return new FullName(firstName, lastName);
    }
}

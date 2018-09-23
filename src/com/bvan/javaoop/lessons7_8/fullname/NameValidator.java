package com.bvan.javaoop.lessons7_8.fullname;

/**
 * @author bvanchuhov
 */
public class NameValidator {

    public static boolean isName(String s) {
        if (s.isEmpty()) {
            return false;
        }
        char firstChar = s.charAt(0);
        if (!Character.isUpperCase(firstChar)) {
           return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isAlphabetic(ch)) {
                return false;
            }
        }

        return true;
    }
}

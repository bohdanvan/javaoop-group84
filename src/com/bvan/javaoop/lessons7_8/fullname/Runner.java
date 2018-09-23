package com.bvan.javaoop.lessons7_8.fullname;

import java.util.logging.Logger;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        FullNameParser parser = new FullNameParserImpl();

        try {
            FullName fullName = parser.parse("Taras Ivaniv 1");
            System.out.println(fullName);
        }  catch (IllegalFirstNameException e) {
            System.out.println("Error: illegal first name");
            e.printStackTrace();
        } catch (IllegalLastNameException e) {
            System.out.println("Error: illegal last name");
            e.printStackTrace();
        } catch (IllegalFullNameException e) {
            System.out.println("Error: illegal last name");
            e.printStackTrace();
        }

        System.out.println("Goodbye");
    }
}

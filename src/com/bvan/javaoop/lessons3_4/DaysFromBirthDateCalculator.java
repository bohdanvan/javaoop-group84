package com.bvan.javaoop.lessons3_4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * @author bvanchuhov
 */
public class DaysFromBirthDateCalculator {

    public static void main(String[] args) {
        long days = daysFromBirthDateCalculator("1828-08-28");
        System.out.println("You lived " + days + " days.");

    }

    public static long daysFromBirthDateCalculator(String s) {
        LocalDate birthday = LocalDate.parse(s);
        LocalDate today = LocalDate.now();
        return birthday.until(today, DAYS);
    }
}

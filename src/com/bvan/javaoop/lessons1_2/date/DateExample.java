package com.bvan.javaoop.lessons1_2.date;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author bvanchuhov
 */
public class DateExample {

    public static void main(String[] args) {
        // Java 8, immutable
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // --------

        LocalDate now = LocalDate.now();
        LocalDate nowYearAgo = now.minusYears(1);
        DayOfWeek dayOfWeek = nowYearAgo.getDayOfWeek();
        System.out.println(dayOfWeek.getValue());

        System.out.println(LocalDate.now()
                .minusYears(1)
                .getDayOfWeek()
                .getValue()
        );
    }
}

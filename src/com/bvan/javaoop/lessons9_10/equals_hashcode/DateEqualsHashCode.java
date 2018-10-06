package com.bvan.javaoop.lessons9_10.equals_hashcode;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class DateEqualsHashCode {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2018, 9, 29);

        System.out.println(d1.equals(d2)); // true
        System.out.println(d1.hashCode()); // 4133469
        System.out.println(d2.hashCode()); // 4133469

        System.out.println(new Object().hashCode());
    }
}

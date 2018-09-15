package com.bvan.javaoop.lessons5_6.factorial;

import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class FactorialRunner {

    public static void main(String[] args) {
        try {
            BigInteger res = Factorial.factorial(-10);
            System.out.println(res);
        } catch (IllegalStateException e) {
            System.out.println("Illegal State: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " + e.getMessage());
        } catch (RuntimeException e) {

        } finally {
            System.out.println("Finally");
        }
        System.out.println("Bye");
    }
}

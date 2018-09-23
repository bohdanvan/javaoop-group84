package com.bvan.javaoop.lessons7_8.benchmark;

/**
 * @author bvanchuhov
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        String name = "Taras";
        int age = 50;

        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        StringBuilder sb = new StringBuilder()
                .append("Hello, I'm ")
                .append(name)
                .append(", ")
                .append(age)
                .append(" years old");
        String s = sb.toString();
    }
}

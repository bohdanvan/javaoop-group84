package com.bvan.javaoop.lessons11_12.multithreading.runnable;

import com.bvan.javaoop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class RunnableLambdaCreation {

    public static void main(String[] args) {
        new Thread(() -> ThreadUtils.println("Hello")).start();
        ThreadUtils.println("Goodbye");
    }
}

package com.bvan.javaoop.lessons11_12.multithreading.runnable;

import com.bvan.javaoop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class RunnableAnonymousCreation {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadUtils.println("Hello");
            }
        }).start();
        ThreadUtils.println("Goodbye");
    }
}

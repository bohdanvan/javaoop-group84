package com.bvan.javaoop.lessons11_12.multithreading.runnable;

import com.bvan.javaoop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class RunnableCreation {

    public static void main(String[] args) {
        new Thread(new Task()).start();
        ThreadUtils.println("Goodbye");
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        ThreadUtils.println("Hello");
    }
}

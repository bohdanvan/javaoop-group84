package com.bvan.javaoop.lessons11_12.multithreading.threadextension;

import com.bvan.javaoop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class ThreadExtensionCreation {

    public static void main(String[] args) {
        new MyThread().start();
        ThreadUtils.println("Goodbye");
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        ThreadUtils.println("Hello");
    }
}

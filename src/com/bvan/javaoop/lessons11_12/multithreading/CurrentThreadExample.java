package com.bvan.javaoop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class CurrentThreadExample {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("1: " + thread.getName());

        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                System.out.println("2: " + thread.getName());
            }
        }).start();
    }

}

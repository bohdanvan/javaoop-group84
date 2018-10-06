package com.bvan.javaoop.lessons11_12.multithreading.iterrupted;

import com.bvan.javaoop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class FactorialRunner {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new FactorialTask(1_000_000));
        thread.start();

        Thread.sleep(3000);

        thread.interrupt();

        ThreadUtils.println("Main is finished");
    }
}

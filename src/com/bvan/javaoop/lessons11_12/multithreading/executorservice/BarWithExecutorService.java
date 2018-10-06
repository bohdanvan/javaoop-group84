package com.bvan.javaoop.lessons11_12.multithreading.executorservice;

import com.bvan.javaoop.lessons11_12.multithreading.Drinker;
import com.bvan.javaoop.lessons11_12.multithreading.ThreadUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author bvanchuhov
 */
public class BarWithExecutorService {

    public static void main(String[] args) throws InterruptedException {
        ThreadUtils.println("Bar is opened");

        ExecutorService executorService =
                Executors.newFixedThreadPool(2); // factory class

        for (int drinkerId = 1; drinkerId <= 3; drinkerId++) {
            Runnable drinker = new Drinker(drinkerId);
            executorService.submit(drinker);
        }

        executorService.shutdown();

        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);

        ThreadUtils.println("Bar is closed");
    }
}

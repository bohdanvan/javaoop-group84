package com.bvan.javaoop.lessons11_12.multithreading.iterrupted;

import com.bvan.javaoop.lessons11_12.multithreading.ThreadUtils;

import java.math.BigInteger;

/**
 * n! = 1 * 2 * 3 * ... * n, n >= 0
 * 3! = 6
 * 0! = 1
 *
 * @author bvanchuhov
 */
public class FactorialTask implements Runnable {

    private final int n;

    public FactorialTask(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative n: " + n);
        }
        this.n = n;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100000000L);
        } catch (InterruptedException e) {
            lastAction();
            return;
        }

        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));

            if (i % 10_000 == 0) {
                ThreadUtils.println("i = " + i);

                if (Thread.currentThread().isInterrupted()) {
                    lastAction();
                    return;
                }
            }
        }
        ThreadUtils.println("res = " + res);
    }

    private void lastAction() {
        ThreadUtils.println("Hasta la vista");
    }
}

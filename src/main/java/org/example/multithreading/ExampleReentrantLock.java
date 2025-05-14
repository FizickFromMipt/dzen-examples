package org.example.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExampleReentrantLock {
    private int counter = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // захватываем блокировку
        try {
            counter++;
        } finally {
            lock.unlock(); // обязательно освобождаем!
        }
    }
    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        ExampleReentrantLock example = new ExampleReentrantLock();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter: " + example.getCounter()); // Должен быть 2000
    }
}

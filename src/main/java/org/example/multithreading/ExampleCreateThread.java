package org.example.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExampleCreateThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread1 = new Thread(myRunnable);

        myThread.start();
        myThread1.start();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> System.out.println("Task via executor"));
        executor.shutdown();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Running in MyThread");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Running in MyRunnable");
    }
}

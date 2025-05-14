package org.example.multithreading;

public class ExampleVirtualThread {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            System.out.println("Running in a virtual thread: " + Thread.currentThread());
        });

        System.out.println("Main thread: " + Thread.currentThread());
    }
}

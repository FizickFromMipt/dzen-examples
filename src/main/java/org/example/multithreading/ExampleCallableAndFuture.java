package org.example.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExampleCallableAndFuture {
    public static void main(String[] args) throws Exception {
        // Создаем пул из одного потока
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Создаем задачу, которая возвращает результат
        Callable<Integer> task = () -> {
            System.out.println("Задача выполняется в потоке: " + Thread.currentThread().getName());
            Thread.sleep(1000); // имитируем долгую работу
            return 42; // возвращаем результат
        };

        // Отправляем задачу на выполнение
        Future<Integer> future = executor.submit(task);

        System.out.println("Главный поток может что-то делать параллельно...");

        // Получаем результат (блокирующий вызов)
        Integer result = future.get();

        System.out.println("Результат из Callable: " + result);

        executor.shutdown();
    }
}

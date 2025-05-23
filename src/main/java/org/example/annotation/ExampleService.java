package org.example.annotation;

public class ExampleService {

    @Todo("Переименовать переменную для лучшей читаемости")
    public String str;

    @Todo(value = "Переименовать метод для лучшей читаемости", author = "Петров К.", priority = Todo.Priority.HIGH)
    public void test() {
        System.out.println("Тестовый метод");
    }
}

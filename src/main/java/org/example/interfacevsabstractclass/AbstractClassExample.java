package org.example.interfacevsabstractclass;

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal dog = new Dog("Бобик");

        dog.makeSound();
    }
}

// Тут мы сосзаем описания для царства животных и наделяем их общими свойствами
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}

// Тут мы определяем Собак к царству животных, что собственно и логично )
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println("Лай собаки по имени " + name);
    }
}
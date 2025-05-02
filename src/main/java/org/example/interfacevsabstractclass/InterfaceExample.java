package org.example.interfacevsabstractclass;

public class InterfaceExample {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable airplane = new Airplane();

        bird.fly();
        airplane.fly();
    }
}

// Давайте опишем контракт, согласно которому мы можем научить объект летать
interface Flyable {
    void fly();
}

// Пусть у ряд неких птиц умеет летать (без уточненя деталей из зоологии)
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}

// Но свойство летать есть не только у плиц
// Тут то и видно особенность - контракт определяет поведение, а не природу объекта
class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }
}
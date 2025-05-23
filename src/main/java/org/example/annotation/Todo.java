package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для пометки TODO-задач в коде.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
public @interface Todo {
    String value();       // Описание задачи
    String author() default ""; // Кто должен сделать
    Priority priority() default Priority.MEDIUM;

    enum Priority {
        LOW, MEDIUM, HIGH
    }
}
package org.example.aspect;

import org.example.aspect.service.ServiceExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppExample {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppExample.class, args);
        ServiceExample service = context.getBean(ServiceExample.class);
        service.doWork();
    }
}

package com.learnspringboot.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(AopApplication.class, args);
//        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(AopApplication.class,User.class,Greetings.class);
//        context.refresh();

        User u = context.getBean(User.class);

        u.setFname("Rohin");
        u.setLname("Agrawal");
        u.show();
    }

}

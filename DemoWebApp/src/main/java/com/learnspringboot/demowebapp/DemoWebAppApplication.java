package com.learnspringboot.demowebapp;

import com.learnspringboot.demowebapp.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.learnspringboot.demowebapp.utils.Constants.Gender.MALE;

@SpringBootApplication
public class DemoWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoWebAppApplication.class, args);
//        User user = new User("Rohin", MALE);
//        System.out.println(user.getName());
    }

}

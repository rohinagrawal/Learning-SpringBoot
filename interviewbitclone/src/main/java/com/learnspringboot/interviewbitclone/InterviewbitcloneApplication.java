package com.learnspringboot.interviewbitclone;

import com.learnspringboot.interviewbitclone.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.learnspringboot.interviewbitclone.utils.Constants.Gender.MALE;

@SpringBootApplication
public class InterviewbitcloneApplication {

    public static void main(String[] args) {

        SpringApplication.run(InterviewbitcloneApplication.class, args);

//        User user = new User("Rohin",MALE);
//        System.out.println(user.getName());
    }

}

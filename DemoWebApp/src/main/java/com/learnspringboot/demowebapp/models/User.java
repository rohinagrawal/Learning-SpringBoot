package com.learnspringboot.demowebapp.models;

import com.learnspringboot.demowebapp.utils.Constants;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class User {
//    @Generate
    private UUID uuid;
    private String name;
    private Constants.Gender gender;

    public User(String name, Constants.Gender gender){
        this.uuid= UUID.randomUUID();
//        Or We can put a @Generator annotation over uuid which would generate a uuid
        this.name=name;
        this.gender=gender;
    }
}

package com.learnspringboot.demowebapp.models;

import com.learnspringboot.demowebapp.utils.Constants;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class TeachingAssistant {
    private String name;
    private Constants.Gender gender;
    private UUID uuid;
    private String college;

    public TeachingAssistant(String name, Constants.Gender gender,String college) {
        this.name = name;
        this.gender = gender;
        this.uuid = UUID.randomUUID();
        this.college=college;
    }
}

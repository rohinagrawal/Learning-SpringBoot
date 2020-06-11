package com.learnspringboot.testingwebapp.controllers;

import com.learnspringboot.testingwebapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @RequestMapping ("/greeting")
    public @ResponseBody String greeting(){
        return greetingService.greeting();
    }
}

package com.learnspringboot.demowebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping ("/")
    public @ResponseBody String Greeting(){
        return "<h1> Hello World to Demo WebApp</h1>";
    }
}

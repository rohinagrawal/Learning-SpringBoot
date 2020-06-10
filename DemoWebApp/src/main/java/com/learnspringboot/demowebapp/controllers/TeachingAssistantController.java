package com.learnspringboot.demowebapp.controllers;

import com.learnspringboot.demowebapp.models.TeachingAssistant;
import com.learnspringboot.demowebapp.services.TeachingAssistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.learnspringboot.demowebapp.utils.Constants.TA_END_POINT;
@RestController
@RequestMapping (TA_END_POINT)
public class TeachingAssistantController {
    private TeachingAssistantService taService;

    @Autowired
    private TeachingAssistantController (TeachingAssistantService taService){

        this.taService=taService;
    }

    @PostMapping
    public TeachingAssistant createTA (@RequestBody TeachingAssistant ta){

        return taService.createTA(ta);
    }
}

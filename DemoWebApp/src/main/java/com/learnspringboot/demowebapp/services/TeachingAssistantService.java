package com.learnspringboot.demowebapp.services;

import com.learnspringboot.demowebapp.models.TeachingAssistant;
import com.learnspringboot.demowebapp.repository.TeachingAssistantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeachingAssistantService {
    private TeachingAssistantRepository taRepository;

    @Autowired
    private TeachingAssistantService(TeachingAssistantRepository taRepository){

        this.taRepository=taRepository;
    }

    public TeachingAssistant createTA (TeachingAssistant ta){

        return taRepository.createTA(ta);
    }
}

package com.learnspringboot.demowebapp.repository;

import com.learnspringboot.demowebapp.models.TeachingAssistant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TeachingAssistantRepositoryImpl implements TeachingAssistantRepository{

    private List<TeachingAssistant> TAdatabase= new ArrayList<>();

    @Override
    public TeachingAssistant createTA(TeachingAssistant ta) {

        TeachingAssistant createdTA = new TeachingAssistant(ta.getName(),ta.getGender(),ta.getCollege());
        TAdatabase.add(createdTA);
        return createdTA;
    }
}

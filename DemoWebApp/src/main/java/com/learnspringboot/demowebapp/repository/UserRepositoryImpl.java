package com.learnspringboot.demowebapp.repository;

// Impl stands for Implementation (Standard in Spring Community)

import com.learnspringboot.demowebapp.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository ("inMemory")
public class UserRepositoryImpl implements UserRepository {

    private List<User> userDatabase = new ArrayList<>();

    @Override
    public User createUser(User user) {
//        We will create a new user as it is not necessary that the passed object to the database
//        is same as the object returned from database.

        User createdUser = new User(user.getName(), user.getGender());
        userDatabase.add(createdUser);
        return createdUser;
    }

    @Override
    public Optional<User> getUserByID(UUID id) {
        return userDatabase
            .stream()
            .filter(user -> user.getUuid().equals(id))
            .findFirst();
    }
}
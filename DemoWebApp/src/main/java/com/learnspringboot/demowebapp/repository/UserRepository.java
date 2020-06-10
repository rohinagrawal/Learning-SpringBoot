package com.learnspringboot.demowebapp.repository;

import com.learnspringboot.demowebapp.models.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    User createUser(User user);
    Optional<User> getUserByID (UUID id);
}

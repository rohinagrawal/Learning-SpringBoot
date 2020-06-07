package com.learnspringboot.interviewbitclone.repository;

import com.learnspringboot.interviewbitclone.models.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    User createUser(User user);
    Optional<User> getUserByID (UUID id);
}

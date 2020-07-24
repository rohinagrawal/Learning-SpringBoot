package dev.rohin.practice.service;

import dev.rohin.practice.dto.PaymentFormDto;
import dev.rohin.practice.model.User;

public interface UserService {

    public User addUser(PaymentFormDto paymentFormDto);
}

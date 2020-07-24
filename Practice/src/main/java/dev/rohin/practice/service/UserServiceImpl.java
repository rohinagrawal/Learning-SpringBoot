package dev.rohin.practice.service;

import dev.rohin.practice.dto.PaymentFormDto;
import dev.rohin.practice.model.User;
import dev.rohin.practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(PaymentFormDto paymentFormDto) {
        User user = userRepository.findByEmail(paymentFormDto.getEmail());

        if (user == null) {
            user = new User();

            user.setName(paymentFormDto.getName());
            user.setContactNumber(paymentFormDto.getContactNumber());
            user.setEmail(paymentFormDto.getEmail());

        }
        return user;
    }
}

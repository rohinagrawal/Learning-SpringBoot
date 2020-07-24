package dev.rohin.practice.controller;

import dev.rohin.practice.dto.PaymentFormDto;
import dev.rohin.practice.model.Card;
import dev.rohin.practice.model.User;
import dev.rohin.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PaymentController {

    @Autowired
    UserService userService;

    @GetMapping("/payment")
    public String paymentForm(Model model){
        model.addAttribute("paymentFormDetails", new PaymentFormDto());
        return "paymentForm.html";
    }

    @PostMapping("/payment")
    public String initiatePayment(@ModelAttribute PaymentFormDto paymentFormDto){
        User user = userService.addUser(paymentFormDto);
        List<Card> cards = user.getCards();
        return "result";
    }
}

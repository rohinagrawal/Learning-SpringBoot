package dev.rohin.practice.controller;

import dev.rohin.practice.dto.PaymentFormDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {

    @GetMapping("/payment")
    public String paymentForm(Model model){
        model.addAttribute("paymentForm", new PaymentFormDto());
        return "paymentForm";
    }

    @PostMapping("/payment")
    public String initiatePayment(@ModelAttribute PaymentFormDto paymentFormDto){

        return "result";
    }
}

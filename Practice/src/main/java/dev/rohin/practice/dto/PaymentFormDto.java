package dev.rohin.practice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter
@Getter
public class PaymentFormDto {

    private String name;

    private String email;

    private String contactNumber;
}

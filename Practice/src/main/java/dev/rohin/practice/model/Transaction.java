package dev.rohin.practice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "transactions")
@Entity
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private int amount;

    @ManyToOne
    private Card card;

    @ManyToOne
    private  User user;
}

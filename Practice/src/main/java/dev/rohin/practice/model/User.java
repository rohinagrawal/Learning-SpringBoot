package dev.rohin.practice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String contactNumber;

    private String email;

    @ManyToMany
    @JoinTable(name = "user_card",joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
                           inverseJoinColumns = @JoinColumn(name = "card_id", referencedColumnName = "id"))
    private List<Card> cards;
}

package com.example.jpaexampl.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ToString
@Getter
@Entity
public class User {

    // == fields ==
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String role;

    // == constructors ==
    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    protected User() {
    }

}


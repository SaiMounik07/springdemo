package com.demo.spring.springDemo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String userEmail;
    @OneToMany(mappedBy = "user")
    @JsonBackReference
    List<Product> products = new ArrayList<>();
    public User(String name, String mail) {
    }

    public User() {

    }
}

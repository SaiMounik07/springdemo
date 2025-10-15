package com.demo.spring.springDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private Integer userId;
    private String userName;
    private String userEmail;
}

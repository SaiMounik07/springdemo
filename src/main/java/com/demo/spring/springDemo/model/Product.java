package com.demo.spring.springDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Data
public class Product {
    @Id
    private Integer id;
    private String name;
    private Double price;
}

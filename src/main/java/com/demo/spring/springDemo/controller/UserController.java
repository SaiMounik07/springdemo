package com.demo.spring.springDemo.controller;

import com.demo.spring.springDemo.model.Product;
import com.demo.spring.springDemo.model.User;
import com.demo.spring.springDemo.repository.ProductRepo;
import com.demo.spring.springDemo.repository.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepos userRepository;

    @Autowired
    private ProductRepo productRepository;

    // Create user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Create product under user
    @PostMapping("/{userId}/products")
    public Product addProduct(@PathVariable Long userId, @RequestBody Product product) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        product.setUser(user);
        return productRepository.save(product);
    }

    // Get all users with products
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

package com.demo.spring.springDemo.controller;


import com.demo.spring.springDemo.model.Product;
import com.demo.spring.springDemo.model.User;
import com.demo.spring.springDemo.repository.ProductRepo;
import com.demo.spring.springDemo.repository.UserRepos;
import com.demo.spring.springDemo.view.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/getProductsByUserId/{userId}")
    public List<Product> getProductsByUserId(@PathVariable Long userId) {
        return productService.getProductsByUserId(userId);
    }


}

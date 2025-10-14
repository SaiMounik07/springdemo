package com.demo.spring.springDemo.controller;

import com.demo.spring.springDemo.model.Product;
import com.demo.spring.springDemo.view.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.List;

@RestController
public class DemoController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }
    @PostMapping("/addProduct")
    public boolean addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @PutMapping("/updateProduct/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product){
        return  productService.updateProduct(id, product);
    }



}
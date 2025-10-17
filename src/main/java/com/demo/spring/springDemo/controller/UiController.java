package com.demo.spring.springDemo.controller;

import com.demo.spring.springDemo.model.Product;
import com.demo.spring.springDemo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UiController {
    @Autowired
    ProductRepo productRepo;

    @GetMapping("/hello")
    public String viewProducts( Model model) {
        model.addAttribute("hello","Hello CSE");
        return "Hello";
    }
    @GetMapping("/displayProducts")
    public String displayProducts( Model model) {
        model.addAttribute("products",productRepo.findAll());
        return "productlist";
    }
    @GetMapping("/saveProduct")
    public String saveProduct( Model model){
        model.addAttribute("product",new Product());
        return "AddProduct";
    }
    @PostMapping("/save")
    public String saveProductToDB(@ModelAttribute Product product){
        productRepo.save(product);
        return "redirect:/displayProducts";

    }

}

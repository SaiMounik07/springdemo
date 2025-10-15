package com.demo.spring.springDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UiController {

    @GetMapping("/hello")
    public String viewProducts( Model model) {
        model.addAttribute("hello","Hello CSE");
        return "Hello";
    }
}

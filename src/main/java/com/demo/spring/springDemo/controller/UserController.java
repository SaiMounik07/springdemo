package com.demo.spring.springDemo.controller;

import com.demo.spring.springDemo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @PostMapping("/addUser")
    public List<User> addUser(@RequestBody  User user) {
        return userService.addUser(user);
    }
}

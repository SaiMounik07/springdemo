package com.demo.spring.springDemo.repository;

import com.demo.spring.springDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User, Long> {


}



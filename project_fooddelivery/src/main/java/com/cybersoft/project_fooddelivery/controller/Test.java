package com.cybersoft.project_fooddelivery.controller;

import com.cybersoft.project_fooddelivery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class Test {
    @Autowired
    UserRepository userRepository;
    @PostMapping("")
    public Object getAllUser(){
       return userRepository.findAll();
    }
}



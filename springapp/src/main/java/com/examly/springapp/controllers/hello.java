package com.examly.springapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping("/")
    public String helloWrod(){
        return "Welcome to my First page!!";
    }
}

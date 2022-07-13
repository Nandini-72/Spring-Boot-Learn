package com.dailySpringLearn.SpringTutorial1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloWorld(){
        return "Welcome Nandini to spring boot learning";
    }
}

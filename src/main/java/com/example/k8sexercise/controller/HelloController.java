package com.example.k8sexercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/sayHello")
    public String sayHello() {
        return "Hello world!!!";
    }

}

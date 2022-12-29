package com.example.k8sexercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/sayHello")
    public String sayHello(@RequestParam String language) {
        String result = "Hello world!!!";
        if (language.equalsIgnoreCase("spanish")){
            result = "Hola mundo!!!";
        }else if (language.equalsIgnoreCase("french")){
            result = "Salut monde!!!";
        }else if (language.equalsIgnoreCase("italian")){
            result = "Ciao mondo!!!";
        }
        return result;
    }

}

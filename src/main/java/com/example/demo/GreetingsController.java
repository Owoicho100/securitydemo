package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("Feature changes for PR!");
        System.out.println("New changes is awesome!");
        return "Hello, World!";
    }

    @GetMapping("/hi")
    public String sayHi(){
        System.out.println("It's a new day!");
        return "Hello, World!";
    }
}

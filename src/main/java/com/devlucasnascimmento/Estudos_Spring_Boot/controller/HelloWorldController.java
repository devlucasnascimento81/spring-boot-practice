package com.devlucasnascimmento.Estudos_Spring_Boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/about")
    public String about(){
        return "API developed by Lucas Nascimento - learning system for spring boot";
    }

    @GetMapping("/stats")
    public String stats(){
        return "System is online - version 1.0";
    }

}

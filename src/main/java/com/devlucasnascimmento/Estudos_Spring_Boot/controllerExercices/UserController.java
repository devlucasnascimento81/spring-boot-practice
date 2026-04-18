package com.devlucasnascimmento.Estudos_Spring_Boot.controllerExercices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable Long id){
        return "Searching for user with ID: "+id;
    }
    @GetMapping("/users")
    public String getUserByEmail(@RequestParam String email){
        return "Searching for user with email: "+ email;
    }
}

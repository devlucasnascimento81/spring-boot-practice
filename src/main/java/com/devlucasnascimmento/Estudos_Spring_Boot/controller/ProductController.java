package com.devlucasnascimmento.Estudos_Spring_Boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String getProductsByName(@RequestParam String name ){
        return "Searching for product with ID: " + name;
    }
}

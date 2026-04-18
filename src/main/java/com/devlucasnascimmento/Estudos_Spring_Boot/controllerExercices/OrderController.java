package com.devlucasnascimmento.Estudos_Spring_Boot.controllerExercices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public String getOrderByName(@RequestParam(required = false) String name){

        if (name != null) {
            return "Filtering by name: "+ name;
        }
        return "Listing all products";
    }


    @GetMapping("/orders/{id}")
    public String getOrderById(@PathVariable Long id){
        return "Searching for order id: "+id;
    }


}

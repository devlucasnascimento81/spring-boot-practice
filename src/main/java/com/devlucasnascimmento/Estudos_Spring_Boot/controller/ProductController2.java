package com.devlucasnascimmento.Estudos_Spring_Boot.controller;


import com.devlucasnascimmento.Estudos_Spring_Boot.model.ProductModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController2 {

    @GetMapping("/productss/{id}")
    public ResponseEntity <ProductModel> getProductById(@PathVariable Long id) {
        ProductModel  product = new ProductModel(01,"notebook",3500.00);
        if (product != null) {
            return ResponseEntity.ok(product);
        }
        return ResponseEntity.notFound().build();

    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductModel>> getAllProducts(){
        List<ProductModel> products = new ArrayList<>();

        products.add(new ProductModel(1L, "Notebook",3500.00));
        products.add(new ProductModel(2L, "Mouse",150.00));
        products.add(new ProductModel(3L, "Keyboard",250.00));

        return ResponseEntity.ok(products);

    }
}

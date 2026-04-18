package com.devlucasnascimmento.Estudos_Spring_Boot.model;

public class ProductModel {

    private long id;

    private String name;

    private Double price;

    public ProductModel(long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}

package com.hz;

public class Product {

    private String _name;
    private double _price;

    public Product(double price, String name) {
        _price = price;
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public double getPrice() {
        return _price;
    }

}

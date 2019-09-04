package com.hz;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> _products;

    public ShoppingCart() {
        this._products = new ArrayList<Product>();
    }

    public void addToCart(Product product) {
        this._products.add(product);
    }

    public void removeFromCart(Product product) {
        this._products.remove(product);
    }

    public int getNumberOfProducts() {
        int size = this._products.size();
        return size;
    }

    public Product[] getAll() {
        int size = this._products.size();
        return this._products.toArray(new Product[size]);
    }

    public double getTotalPrice() {
        double total = 0;
         for(Product product:getAll()) {
             total += product.getPrice();
         }

         return total;
    }


}

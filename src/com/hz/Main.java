package com.hz;

import discount.Calculator;
import discount.Context;

public class Main {

    public static void main(String[] args) {

        // Butter
        Product butter = new Butter(1);
        // Apple syrup
        Product appleSyrup = new AppleSyrup(2);
        // Toothpaste
        Product toothPaste = new ToothPaste(1.5);
        // Bread
        Product bread = new Bread(1.1);

        Context context = new Context(false);

        Calculator calc = new Calculator(context);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addToCart(butter);

        shoppingCart.addToCart(appleSyrup);

        shoppingCart.addToCart(toothPaste);

        shoppingCart.addToCart(bread);

        double discount = calc.getTotalDiscount(shoppingCart);

        System.out.println("Uw winkelwagen:");
        System.out.println("---------------------------");
        for(Product product:shoppingCart.getAll()) {
            System.out.println(product.getName());
        }
        System.out.println("Totaal aantal producten: " + shoppingCart.getNumberOfProducts());
        System.out.printf("Totaalbedrag: € %.2f\n", shoppingCart.getTotalPrice());
        System.out.printf("Prijs na korting: € %.2f\n", discount);
        System.out.printf("U bespaart: € %.2f\n", (shoppingCart.getTotalPrice() - discount));

    }
}

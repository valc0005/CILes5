package discount;

import com.hz.Product;
import com.hz.ShoppingCart;

public class Calculator {

    // accepteert productarray
    Product[] _products;

    // berekent totale korting
    public double getTotalDiscount(ShoppingCart shoppingCart) {
        return shoppingCart.getTotalPrice() * 0.8;
    }

}

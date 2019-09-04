package discount;

import com.hz.ShoppingCart;

public class Calculator {

    private Context _context;

    public Calculator(Context context) {
        _context = context;
    }

    // berekent totale korting
    public double getTotalDiscount(ShoppingCart shoppingCart) {
        if (_context.getIsAfterEight()) {
            return shoppingCart.getTotalPrice();
        } else {
            return shoppingCart.getTotalPrice() * 0.8;
        }
    }

}

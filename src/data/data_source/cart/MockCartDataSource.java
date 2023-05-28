package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public class MockCartDataSource extends CartDataSource{            // Источник данных для корзины ("Шуточный")
    private ArrayList<CartItem> cartItems = new ArrayList<>();     // список продуктов из корзины

    @Override
    public ArrayList<CartItem> getCartItems() {         // получить список продуктов из корзины
        return cartItems;
    }

    @Override
    public void addToCart(Product product, int count) {       // добавить в корзину
        cartItems.add(new CartItem(product, count));

    }
}

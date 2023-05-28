package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public abstract class CartDataSource {
    public abstract ArrayList<CartItem> getCartItems();               // получить список продуктов из корзины
    public abstract void addToCart(Product product, int count);      // добавить в корзину
}

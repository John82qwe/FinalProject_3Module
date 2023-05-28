package data.models;

public class CartItem {                   // товары в корзине
    public final Product product;    // продукт
    public final int count;          // количество товаров

    public CartItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }
}

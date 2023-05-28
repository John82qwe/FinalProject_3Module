package view;

import data.models.CartItem;
import data.models.Product;
import data.service.ShopService;

import java.util.ArrayList;

public class CartView extends AppView{                        // отображение корзины
    public final ShopService shopService;
    public CartView(ShopService shopService) {
        super("Cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {                               // Особый метод action, который отображает уникальную для окна информацию(Выводит окно)
        ArrayList<CartItem> cart = shopService.getCartItems();           // запрашиваем корзину
        for (CartItem item : cart){                                 // проходим по корзине
            System.out.println(item.count + " - " + item.product.title);      // выводим количество и название продуктов
        }
        System.out.println();
    }


}

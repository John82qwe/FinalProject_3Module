package view;

import controllers.AddToCartController;
import data.service.ShopService;

import java.util.ArrayList;

public class AddToCartView extends AppView{             // отображение при добавлении товара в корзину
    final ShopService shopService;
    public AddToCartView(ShopService shopService) {
        super("Add to cart", new ArrayList());
        this.shopService = shopService;
    }
    @Override
    public void action() {     // Особый метод action, который отображает уникальную для окна информацию(Выводит окно)
        AddToCartController addToCartController = new AddToCartController(shopService);
            if (addToCartController.addToCart()) {                            // если получилось добавить в корзину
                System.out.println("Success");                              // выводим получилось
            } else {
                System.out.println("Failure");                               // иначе поражение
            }
        }


}

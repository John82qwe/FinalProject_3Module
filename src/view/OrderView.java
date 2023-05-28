package view;

import controllers.OrderViewController;
import data.service.ShopService;

import java.util.ArrayList;

public class OrderView extends AppView{             // отображение заказов
    public final ShopService shopService;

    public OrderView(ShopService shopService) {
        super("Ordering", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {          // Особый метод action, который отображает уникальную для окна информацию(Выводит окно)
        OrderViewController orderViewController = new OrderViewController(shopService);
        if (orderViewController.createOrder()){               // Создаем новый заказ, если заказ успешно создался выводим "Success", иначе "Fail"
            System.out.println("Success");
        }
        else {
            System.out.println("Fail");
        }

    }
}

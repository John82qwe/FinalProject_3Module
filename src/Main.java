import controllers.ShopController;
import data.data_source.cart.CartDataSource;
import data.data_source.cart.MockCartDataSource;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.catalog.MockCatalogDataSource;
import data.data_source.order.MockOrderDataSource;
import data.data_source.order.OrderDataSource;
import data.models.Order;
import data.service.ShopService;
import view.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CatalogDataSource catalogDataSource = new MockCatalogDataSource();    // вызываю источник данных для каталога
        CartDataSource cartDataSource = new MockCartDataSource();            // вызываю источник данных для корзины
        OrderDataSource orderDataSource = new MockOrderDataSource();         // вызываю источник данных для заказа
        ShopService shopService = new ShopService(cartDataSource, catalogDataSource, orderDataSource);   // создаем shopService(управляющий класс), который управляет всеми данными программы

        AddToCartView addToCartView = new AddToCartView(shopService);          // отображение информации при добавлении в корзину
        CartView cartView = new CartView(shopService);                        // отображение информации корзины
        OrderView orderView = new OrderView(shopService);                     // отображение заказов

        ArrayList<AppView> catalogChildren = new ArrayList<>();                // Создаю ArrayList детей каталога
        catalogChildren.add(addToCartView);
        CatalogView catalogView = new CatalogView(shopService, catalogChildren);          // отображение каталога

        ArrayList<AppView> mainChildren = new ArrayList<>();          // Создаем ArrayList детей
        mainChildren.add(catalogView);
        mainChildren.add(cartView);
        mainChildren.add(orderView);
        MainView mainView = new MainView(mainChildren);                  // Создаем mainView


        new ShopController(mainView, shopService).run();                      // запуск программы
    }
}
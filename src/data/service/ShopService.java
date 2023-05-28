package data.service;

import data.data_source.cart.CartDataSource;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.order.OrderDataSource;
import data.models.CartItem;
import data.models.Order;
import data.models.Product;

import java.util.ArrayList;

public class ShopService {                // Сервис для обработки данных
    final CartDataSource cartDataSource;        // Хранилище данных корзины
    final CatalogDataSource catalogDataSource;     // Хранилище данных каталога
    final OrderDataSource orderDataSource;         // Хранилище данных заказов

    public ShopService(CartDataSource cartDataSource, CatalogDataSource catalogDataSource, OrderDataSource orderDataSource) {
        this.cartDataSource = cartDataSource;
        this.catalogDataSource = catalogDataSource;
        this.orderDataSource = orderDataSource;
    }
    public ArrayList<Product> getCatalog() {     // Возвращает каталог товаров
        return catalogDataSource.getCatalog();
    }
    public ArrayList<CartItem> getCartItems() {     // Возвращает список товаров из корзины
        return cartDataSource.getCartItems();
    }
    public boolean addToCart(String productID, int count){      // добавление в корзину
        ArrayList<Product> catalog = getCatalog();             // получаем каталог
        for (Product p : catalog){                             // проходим по нему и сравниваем
            if (p.id.equals(productID) && p.available){             // если id продукта, который ввел пользователь такой же(он есть в каталоге) и он доступен
                cartDataSource.addToCart(p, count);            // то добавляем его в корзину, если мы добавили возвращаем true, иначе false
                return true;
            }
        }
        return false;
    }
    public boolean createOrder (String name, String phone, String address,      // создать новый заказ
                             String paymentType, String deliveryTime){
        ArrayList<CartItem> cart = getCartItems();      // запрашиваем корзину (получаем корзину)
        Order newOrder = new Order(name, phone, address,     // создаем новый заказ
                paymentType, deliveryTime, cart);
        orderDataSource.createOrder(newOrder);            // заносим созданный заказ в хранилище данных orderDataSource
        return true;
    }

}

package data.data_source.order;

import data.models.Order;

public abstract class OrderDataSource {           //Источник данных для заказа
    public abstract Order getOrder();      // получить заказ
    public abstract void createOrder(Order order);   // создать заказ
}

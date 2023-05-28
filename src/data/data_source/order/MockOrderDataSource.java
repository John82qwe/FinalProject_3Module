package data.data_source.order;

import data.models.Order;

public class MockOrderDataSource extends OrderDataSource{     // Источник данных для заказа ("Шуточный")
    private Order order;

    @Override
    public Order getOrder() {           // получить заказ
        return order;
    }

    @Override
    public void createOrder(Order order) {      //создать заказ
        this.order = order;
    }
}

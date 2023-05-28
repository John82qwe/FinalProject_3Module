package data.models;

import java.util.ArrayList;

public class Order {                   // заказ
    public final  String name;           // Имя покупателя
    public final  String phone;          // № телефона
    public final  String address;         // адрес доставки
    public final  String paymentType;      // тип оплаты
    public final  String deliveryTime;       // время доставки

    public Order(String name, String phone, String address,
                 String paymentType, String deliveryTime, ArrayList<CartItem> cartItems) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.paymentType = paymentType;
        this.deliveryTime = deliveryTime;
        this.cartItems = cartItems;
    }

    public final ArrayList<CartItem> cartItems;

}

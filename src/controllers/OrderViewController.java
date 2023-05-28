package controllers;

import data.service.ShopService;

import java.util.Scanner;

public class OrderViewController {
    public OrderViewController(ShopService shopService) {
        this.shopService = shopService;
    }

    public final ShopService shopService;

    public boolean createOrder(){           // Метод для создания заказов
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");      // просим пользователя ввести его имя
        String name = sc.nextLine();
        System.out.println("Enter your phone: ");      // номер телефона
        String phoneNumber = sc.nextLine();
        System.out.println("Enter your address: ");      // адрес
        String address = sc.nextLine();
        System.out.println("Enter paymentType: ");      // тип оплаты
        String paymentType = sc.nextLine();
        System.out.println("Enter deliveryTime: ");      // время доставки
        String deliveryTime = sc.nextLine();
        return shopService.createOrder(name,phoneNumber, address, paymentType, deliveryTime);
    }
}

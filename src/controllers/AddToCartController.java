package controllers;

import data.service.ShopService;

import java.util.Scanner;

public class AddToCartController {
    public AddToCartController(ShopService shopService) {
        this.shopService = shopService;
    }

    public final ShopService shopService;
    public boolean addToCart(){                   // добавление в корзину
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id: ");           // запрашиваем id продукта
        String productID = sc.nextLine();
        System.out.println("Enter count: ");                // запрашиваем количество продуктов
        int countOfProducts = sc.nextInt();
        return shopService.addToCart(productID, countOfProducts);      // возвращает boolean true если получилось добавить в корзину, иначе false

    }

}

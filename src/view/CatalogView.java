package view;

import data.models.Product;
import data.service.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView{        // Отображение каталога
    final ShopService shopService;

    public CatalogView(ShopService shopService, ArrayList<AppView> children) {
        super("Catalog", children);
        this.shopService = shopService;
    }

    @Override
    public void action() {            // Особый метод action, который отображает уникальную для окна информацию(Выводит окно)
        ArrayList<Product> catalog = shopService.getCatalog();   // получаем каталог
        for (Product p : catalog){     // проходим по каталогу
            System.out.println(p.id + " " + p.title + " " + p.price);    // выводим id товара, его название и стоимость
        }
        System.out.println();
    }

}


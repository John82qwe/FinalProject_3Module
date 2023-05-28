package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSource extends CatalogDataSource{           // Источник данных для каталога ("Шуточный")
    @Override
    public ArrayList<Product> getCatalog(){       // Возвращает список из продуктов
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("id1", "Iphone 14 pro max", "Its revolution Jonny!",
                145000000, true));
        products.add(new Product("id2", "Iphone 13 pro max", "Its not revolution Jonny!",
                135000000, true));
        products.add(new Product("id3", "Iphone 12 pro max", "Its not revolution Jonny!",
                125000000, true));
        products.add(new Product("id4", "Iphone 11 pro max", "Its not revolution Jonny!",
                115000000, true));
        return products;
    }

}

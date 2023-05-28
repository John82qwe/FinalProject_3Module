package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public abstract class CatalogDataSource {    // Источник данных для каталога
    public abstract ArrayList<Product> getCatalog();    // возвращает список из продуктов
}


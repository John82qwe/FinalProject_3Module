package data.models;

public class Product {                 // товар

    public final String id;            // id товара
    public final String title;         // название товара
    public final String description;            // описание товара
    public final int price;                      // цена товара
    public final boolean available;              // наличие товара


    public Product(String id, String title, String description, int price, boolean available) {
         this.id = id;
         this.title = title;
         this.description = description;
         this.price = price;
         this.available = available;                                                             
     }


}

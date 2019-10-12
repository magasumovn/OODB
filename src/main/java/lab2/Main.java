package lab2;

import lab1.Product;
import lab1.Shop;
import lab1.Worker;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shop> shops = DataBase.load();
        List<Product> products = DataBase.loadProductList();

        Product product = ShopUtils.findProductByName(products, "Огурец");
        if (product != null) {
            product.setCost(50.0);
        }

        ShopUtils.sortProductsByName(products).forEach(System.out::println);
        DataBase.saveProduct(products);

        for (Shop shop : shops) {
            shop.setProducts(products);
            System.out.println(shop);
        }

        Shop shop = ShopUtils.findShopByName(shops, "Магнит1");

        if (shop != null) {
            Worker worker = new Worker("Арсений", "vpupkin777@inbox.ru", 200047, "Консультант");
            shop.addWorker(worker);
        }

        ShopUtils.sortShopsByName(shops).forEach(System.out::println);

        DataBase.saveShop(shops);
    }
}

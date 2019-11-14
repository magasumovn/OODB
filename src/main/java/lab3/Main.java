package lab3;

import lab1.Shop;
import lab1.Worker;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection collection = DataBase.load();

        if (collection != null) {
            printShops(collection.getShops());
        }

        if (collection != null) {
            List<Shop> sortedShops = ShopUtils.sortShopsByName(collection.getShops());
            printShops(sortedShops);
        }

        if (collection != null) {
            Shop shop = ShopUtils.findShopByName(collection.getShops(), "магнит");
            Worker worker = new Worker("Worker", "2", 85353, "Boss");
            shop.addWorker(worker);

            DataBase.save(collection);
        }
    }

    private static void printShops(List<Shop> shops) {
        for (Shop s : shops) {
            System.out.println(s);
        }
    }
}

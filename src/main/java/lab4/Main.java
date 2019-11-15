package lab4;

import lab1.Shop;
import lab1.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shop> shops = Utils.loadJson();

        if (shops != null) {
            for (Shop shop : shops) {
                System.out.println(shop);
            }
        }

        shops = Utils.loadJsonb();

        if (shops != null) {
            for (Shop shop : shops) {
                System.out.println(shop);
            }
        }

        Shop shop = Utils.loadByName("Магнит1");

        if (shop != null) {
            Worker worker = new Worker("Worker", "2", 85353, "Boss");
            shop.addWorker(worker);
            shop.setName("пятерочка");

            Utils.save(new ArrayList<Shop>() {{
                add(shop);
            }});
        }
    }
}

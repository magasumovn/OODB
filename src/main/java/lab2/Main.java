package lab2;

import lab1.Shop;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Shop> shops = LoadDB.load();
        for (Shop shop : shops) {
            shop.setProducts(LoadDB.loadProductList());
            System.out.println(shop);
        }
    }
}

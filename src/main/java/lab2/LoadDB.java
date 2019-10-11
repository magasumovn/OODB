package lab2;

import com.google.gson.Gson;
import lab1.Product;
import lab1.Shop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class LoadDB {

    public static List<Shop> load() {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/lab2/Shop.json"))) {
            Shop[] shops = new Gson().fromJson(reader, Shop[].class);

            return Arrays.asList(shops);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Product> loadProductList() {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/lab2/Product.json"))) {
            Product[] products = new Gson().fromJson(reader, Product[].class);

            return Arrays.asList(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

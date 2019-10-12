package lab2;

import com.google.gson.Gson;
import lab1.Product;
import lab1.Shop;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;


public class DataBase {

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

    public static void saveShop(List<Shop> shops) {
        String shopAsJason = new Gson().toJson(shops);

        try (OutputStream output = new FileOutputStream("src/main/java/lab2/Shop.json")) {
            output.write(shopAsJason.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveProduct(List<Product> products) {
        String shopAsJason = new Gson().toJson(products);

        try (OutputStream output = new FileOutputStream("src/main/java/lab2/Product.json")) {
            output.write(shopAsJason.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

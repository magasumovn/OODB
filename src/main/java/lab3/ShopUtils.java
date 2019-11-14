package lab3;

import lab1.Shop;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopUtils {
    public static Shop findShopByName(List<Shop> shops, String name) {
        return shops.stream().filter(shop -> shop.getName().equals(name)).findFirst().orElse(null);
    }

    public static List<Shop> sortShopsByName(List<Shop> shops) {
        return shops.stream().sorted(Comparator.comparing(Shop::getName)).collect(Collectors.toList());
    }
}

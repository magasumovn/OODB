package lab4;

import com.google.gson.Gson;
import lab1.Shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {
    public static boolean save(List<Shop> shops) {
        if (shops != null && shops.size() > 0) {
            Gson gson = new Gson();
            Connection connection = DBConnection.getConnection();

            try {
                PreparedStatement statement = connection.prepareStatement("insert into shops (content, contentb) values (cast(? as json), cast(? as jsonb))");
                for (Shop shop : shops) {
                    String bankAsJson = gson.toJson(shop);

                    statement.setString(1, bankAsJson);
                    statement.setString(2, bankAsJson);

                    statement.addBatch();
                }
                int[] count = statement.executeBatch();

                System.out.println(Arrays.stream(count).sum() + " records added!");

                statement.close();
                return true;
            } catch (SQLException e) {
                return false;
            }
        }
        return false;
    }

    public static List<Shop> loadJson() {
        return load("select content from shops");
    }

    public static List<Shop> loadJsonb() {
        return load("select contentb from shops");
    }

    public static Shop loadByName(String name) {
        List<Shop> shops = load("select contentb from shops where contentb->>'name'='" + name + "'");

        if (shops != null) {
            return shops.get(0);
        }

        return null;
    }

    private static List<Shop> load(String query) {
        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(query);

            long start = System.nanoTime();
            ResultSet rs = statement.executeQuery();
            long finish = System.nanoTime();

            System.out.printf(query.contains("contentb") ? "Jsonb: %d\n" : "Json: %d\n", (finish - start));

            List<Shop> shops = new ArrayList<>();
            while (rs.next()) {
                Shop shop = new Gson().fromJson(rs.getString(1), Shop.class);
                shops.add(shop);
            }

            return shops;
        } catch (SQLException e) {
            return null;
        }
    }
}

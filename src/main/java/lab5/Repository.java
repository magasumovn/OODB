package lab5;

import lab5.Objects.Customer;
import lab5.Objects.Order;
import lab5.Objects.Shop;
import lab5.Objects.Worker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static final String URL = "jdbc:postgresql://localhost:5432/oodb";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "12345";

    public Repository() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Shop> findAll() {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            List<Shop> result = new ArrayList<>();

            PreparedStatement statement = connection.prepareStatement("SELECT" +
                    " id," +
                    " (shop).shop_name," +
                    " (shop).shop_address," +
                    " (shop).phone," +
                    " (shop).email," +
                    " (((shop).worker).worker).person_name as worker_name," +
                    " (((shop).worker).worker).email as worker_email," +
                    " (((shop).worker).worker).phone as worker_phone," +
                    " ((shop).worker).worker_position as worker_position," +
                    " (((shop).customer).customer).person_name as customer_name," +
                    " (((shop).customer).customer).email as customer_email," +
                    " (((shop).customer).customer).phone as customer_phone," +
                    " ((shop).customer).payment as customer_payment," +
                    " (((shop).customer).customer_order).order_id as customer_customer_order_order_id," +
                    " (((shop).customer).customer_order).product as customer_customer_order_product," +
                    " (((shop).customer).customer_order).quanitity as customer_customer_order_quanitity," +
                    " (((shop).customer).customer_order).cost as customer_customer_order_cost" +
                    " FROM shops_type");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Shop shop = new Shop(
                        rs.getInt("id"),
                        rs.getString("shop_name"),
                        rs.getString("shop_address"),
                        rs.getInt("phone"),
                        rs.getString("email")
                );

                Order order = new Order(
                        rs.getInt("customer_customer_order_order_id"),
                        rs.getString("customer_customer_order_product"),
                        rs.getInt("customer_customer_order_quanitity"),
                        rs.getInt("customer_customer_order_cost")
                );

                Customer customer = new Customer(
                        rs.getString("customer_name"),
                        rs.getString("customer_email"),
                        rs.getInt("customer_phone"),
                        rs.getString("customer_payment")
                );
                customer.setOrder(order);

                Worker worker = new Worker(
                        rs.getString("worker_name"),
                        rs.getString("worker_email"),
                        rs.getInt("worker_phone"),
                        rs.getString("worker_position")
                );

                shop.setCustomer(customer);
                shop.setWorker(worker);

                result.add(shop);
            }

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void deleteShopByName(String name) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM shops_type WHERE (shop).shop_name = ?");
            statement.setString(1, name);

            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Shop addShop(Shop shop) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(
                    "insert into shops_type (" +
                            "shop.shop_name," +
                            "shop.shop_address," +
                            "shop.phone," +
                            "shop.email," +
                            "shop.worker.worker.person_name," +
                            "shop.worker.worker.email," +
                            "shop.worker.worker.phone," +
                            "shop.worker.worker_position," +
                            "shop.customer.customer.person_name," +
                            "shop.customer.customer.email," +
                            "shop.customer.customer.phone," +
                            "shop.customer.payment," +
                            "shop.customer.customer_order.order_id," +
                            "shop.customer.customer_order.product," +
                            "shop.customer.customer_order.quanitity," +
                            "shop.customer.customer_order.cost) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, shop.getShopName());
            statement.setString(2, shop.getAddress());
            statement.setInt(3, shop.getPhone());
            statement.setString(4, shop.getEmail());
            statement.setString(5, shop.getWorker().getPersonName());
            statement.setString(6, shop.getWorker().getEmail());
            statement.setInt(7, shop.getWorker().getPhone());
            statement.setString(8, shop.getWorker().getWorkerPosition());
            statement.setString(9, shop.getCustomer().getPersonName());
            statement.setString(10, shop.getCustomer().getEmail());
            statement.setInt(11, shop.getCustomer().getPhone());
            statement.setString(12, shop.getCustomer().getPayment());
            statement.setInt(13, shop.getCustomer().getOrder().getorderId());
            statement.setString(14, shop.getCustomer().getOrder().getProduct());
            statement.setInt(15, shop.getCustomer().getOrder().getQuantity());
            statement.setInt(16, shop.getCustomer().getOrder().getCost());

            statement.executeUpdate();

            ResultSet generatedKey = statement.getGeneratedKeys();
            if (generatedKey.next()) {
                shop.setId(generatedKey.getInt(1));
            } else {
                throw new SQLException("Creating shop failed");
            }

            return shop;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean updateShop(Shop shop) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement(
                    "update shops_type set " +
                            "shop.worker.worker.person_name = ?," +
                            "shop.worker.worker.email = ?," +
                            "shop.worker.worker.phone = ?," +
                            "shop.worker.worker_position = ?," +
                            "shop.customer.customer.person_name = ?," +
                            "shop.customer.customer.email = ?," +
                            "shop.customer.customer.phone = ?," +
                            "shop.customer.payment = ?," +
                            "shop.customer.customer_order.order_id = ?," +
                            "shop.customer.customer_order.product = ?," +
                            "shop.customer.customer_order.quanitity = ?," +
                            "shop.customer.customer_order.cost = ? where (shop).shop_name=?");
            statement.setString(1, shop.getWorker().getPersonName());
            statement.setString(2, shop.getWorker().getEmail());
            statement.setInt(3, shop.getWorker().getPhone());
            statement.setString(4, shop.getWorker().getWorkerPosition());
            statement.setString(5, shop.getCustomer().getPersonName());
            statement.setString(6, shop.getCustomer().getEmail());
            statement.setInt(7, shop.getCustomer().getPhone());
            statement.setString(8, shop.getCustomer().getPayment());
            statement.setInt(9, shop.getCustomer().getOrder().getorderId());
            statement.setString(10, shop.getCustomer().getOrder().getProduct());
            statement.setInt(11, shop.getCustomer().getOrder().getQuantity());
            statement.setInt(12, shop.getCustomer().getOrder().getCost());
            statement.setString(13, shop.getShopName());

            statement.executeUpdate();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

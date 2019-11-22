package lab5;

import lab5.Objects.Customer;
import lab5.Objects.Order;
import lab5.Objects.Shop;
import lab5.Objects.Worker;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Repository repo = new Repository();
        List<Shop> shops = repo.findAll();

        for (Shop shop : shops) {
            System.out.println(shop);
            System.out.println("----------------------------------------------------");
        }
        System.out.println("___________________________________________________________");

        repo.deleteShopByName("Пятурочка");

        shops = repo.findAll();
        for (Shop shop : shops) {
            System.out.println(shop);
            System.out.println("----------------------------------------------------");
        }
        System.out.println("___________________________________________________________");

        Shop newShop= new Shop(
                "Пятерочка",
                "Пушкина",
                432790,
                "shop1@gmail.com"
        );

        Customer customer = new Customer(
                "Хаматянов",
                "mail@gmail.com",
                8900,
                "Card"

        );

        Order order = new Order(
                1214,
                "Компьютер",
                1,
                100000
        );

        Worker worker = new Worker(
                "Игорь",
                "worker@mail.ru",
                8900,
                "Manager"
        );
        customer.setOrder(order);
        newShop.setCustomer(customer);
        newShop.setWorker(worker);

        System.out.println(repo.addShop(newShop));

        System.out.println("___________________________________________________________");

        customer.setPayment("Cash");

        repo.updateShop(newShop);

        shops = repo.findAll();
        for (Shop shop : shops) {
            System.out.println(shop);
            System.out.println("----------------------------------------------------");
        }
        System.out.println("___________________________________________________________");
    }
}

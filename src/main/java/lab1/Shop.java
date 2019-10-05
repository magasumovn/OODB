package lab1;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String address;
    private int phone;
    private String email;
    private List<Worker> workers = new ArrayList<>(); // список сотрудников
    private List<Customer> customers = new ArrayList<>(); // список заказчиков
    public static List<Product> products = new ArrayList<>(); // каталог товаров

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addWorker (Worker worker) {
        if (!workers.contains(worker)) {
            workers.add(worker);
        }
    }

    public void addClient (Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }

    public void addProduct(Product product) {
        if (!products.contains(product)) {
            products.add(product);
        }
    }
}

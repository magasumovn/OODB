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

    private static List<Product> products = new ArrayList<>(); // каталог товаров

    public static List<Product> getProducts() {
        return products;
    }

    public static void setProducts(List<Product> products) {
        Shop.products = products;
    }

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

    @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Shop { name = '" + name + "', address = '" + address + ", phone = " + phone + ", email = " + email + "\nworkers: [\n");
            for (Worker worker : workers) {
                sb.append(worker.toString() + "\n");
            }
            sb.append("]\ncustomers: [\n");
            for (Customer customer : customers) {
                sb.append(customer.toString() + "\n");
            }
            sb.append("]\nproducts: [\n");
            for (Product product : products) {
                sb.append(product.toString() + "\n");
            }
            sb.append("]\n}");
            return sb.toString();
    }
}

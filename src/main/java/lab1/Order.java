package lab1;

import java.time.LocalDateTime;

public class Order {
    private int ID; // номер заказа
    private Customer customer; // имя заказчика
    private Product product; // название товара
    private int quantity; // количество товара
    private double cost;
    private LocalDateTime date;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.date = LocalDateTime.now();
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "lab1.Order{" +
                "ID=" + ID +
                ", customerName='" + customer + '\'' +
                ", productName='" + product + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", date=" + date +
                '}';
    }
}

package lab1;

import javax.xml.bind.annotation.XmlElement;

public class Order {
    private int ID; // номер заказа
    private Customer customer; // имя заказчика
    private Product product; // название товара
    private int quantity; // количество товара
    private double cost;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public Order() {
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

    @XmlElement(name = "id")
    public int getID() {
        return ID;
    }

    @XmlElement(name = "customer")
    public Customer getCustomer() {
        return customer;
    }

    @XmlElement(name = "product")
    public Product getProduct() {
        return product;
    }

    @XmlElement(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    @XmlElement(name = "cost")
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "lab1.Order{" +
                "ID=" + ID +
                ", customerName='" + customer + '\'' +
                ", productName='" + product + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}

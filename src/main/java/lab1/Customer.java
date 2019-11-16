package lab1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private List<Order> orders = new ArrayList<>();

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Customer(String name, String email, int phone) {
        super(name, email, phone);
    }

    public Customer() {
    }

    public void createOrder(Product product, int quantity) {
        Order order = new Order(this, product, quantity);
        if (Worker.confirmOrder(order) != null) {
            orders.add(order);
        }
    }


    @XmlElementWrapper(name = "orders")
    @XmlElement(name = "order")
    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}

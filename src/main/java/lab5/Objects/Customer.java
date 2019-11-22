package lab5.Objects;


public class Customer extends Person {
    private String payment;
    private Order order;

    public Customer(String name, String email, int phone, String payment, Order order) {
        super(name, email, phone);
        this.payment = payment;
        this.order = order;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "payment='" + payment + '\'' +
                ", order=" + order +
                ", personName='" + personName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}

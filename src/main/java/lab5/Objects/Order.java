package lab5.Objects;

public class Order {
    private int orderId;
    private String product;
    private int quantity;
    private int cost;

    public Order(int orderId, String product, int quantity, int cost) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
    }

    public int getorderId() {
        return orderId;
    }

    public void setorderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + orderId +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}

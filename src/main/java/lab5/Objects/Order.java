package lab5.Objects;

public class Order {
    private int ID;
    private String product;
    private int quantity;
    private double cost;

    public Order(int ID, String product, int quantity, double cost) {
        this.ID = ID;
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}

package lab1;

public class Product {
    private int ID; // артикул
    private String productName;
    private double cost;

    public Product(int ID, String productName, double cost) {
        this.ID = ID;
        this.productName = productName;
        this.cost = cost;
    }

    public int getID() {
        return ID;
    }

    public String getProductName() {
        return productName;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", productName='" + productName + '\'' +
                ", cost=" + cost +
                '}';
    }
}

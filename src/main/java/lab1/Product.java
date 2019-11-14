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

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    //@XmlElement(name = "id")
    public int getID() {
        return ID;
    }

    //@XmlElement(name = "name")
    public String getProductName() {
        return productName;
    }

    //@XmlElement(name = "cost")
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

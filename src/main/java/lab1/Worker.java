package lab1;

public class Worker extends Person {
    String position;

    public Worker(String name, String passport, int phone) {
        super(name, passport, phone);
    }

    public static Order confirmOrder(Order order) {
        for (Product product : Shop.getProducts()) {
            if (product.getProductName().equals(order.getProduct().getProductName())) {
                order.setID(product.getID());
                order.setCost(product.getCost());
                return order;
            }
        }
        return null;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "{" +
                "position='" + position + ", " +
                super.toString() +
                '}';
    }
}

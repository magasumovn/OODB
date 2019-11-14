package lab1;

public class Worker extends Person {
    String position;

    public Worker() {

    }

    public Worker(String name, String email, int phone, String position) {
        super(name, email, phone);
        this.position = position;

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

    @Override
    public String toString() {
        return "{" +
                "position='" + position + ", " +
                super.toString() +
                '}';
    }
}

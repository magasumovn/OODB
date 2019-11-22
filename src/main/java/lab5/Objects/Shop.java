package lab5.Objects;

public class Shop {
    private String shopName;
    private String address;
    private int phone;
    private String email;
    private Worker worker;
    private Customer customer;

    public Shop(String shopName, String address, int phone, String email, Worker worker, Customer customer) {
        this.shopName = shopName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.worker = worker;
        this.customer = customer;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", worker=" + worker +
                ", customer=" + customer +
                '}';
    }
}

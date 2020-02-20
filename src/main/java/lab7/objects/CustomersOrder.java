package lab7.objects;

import lab7.annotations.Column;
import lab7.annotations.Entity;
import lab7.annotations.Id;
import lab7.annotations.ManyToOne;

@Entity
public class CustomersOrder {
    @Id
    private Long id;
    @Column
    private String product;
    @Column
    private Long quantity;
    @Column
    private Long cost;
    @Column
    @ManyToOne
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

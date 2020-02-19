package lab7.objects;

import lab7.annotations.Column;
import lab7.annotations.Entity;
import lab7.annotations.Id;

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

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
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
}

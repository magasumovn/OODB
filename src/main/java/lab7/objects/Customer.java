package lab7.objects;


import lab7.annotations.Column;
import lab7.annotations.Entity;
import lab7.annotations.Id;
import lab7.annotations.OneToMany;

import java.util.List;

@Entity
public class Customer extends Person {

    @Id
    private Long id;

    @Column
    private String payment;

    @Column
    @OneToMany
    private List<CustomersOrder> customersOrders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public List<CustomersOrder> getCustomersOrders() {
        return customersOrders;
    }

    public void setCustomersOrders(List<CustomersOrder> customersOrders) {
        this.customersOrders = customersOrders;
    }
}

package lab7.objects;


import lab7.annotations.Column;
import lab7.annotations.Entity;
import lab7.annotations.Id;
import lab7.annotations.OneToMany;

@Entity
public class Customer extends Person {

    @Id
    private Long id;

    @Column
    private String payment;

    @Column
    @OneToMany
    private CustomersOrder customersOrder;

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

    public CustomersOrder getCustomersOrder() {
        return customersOrder;
    }

    public void setCustomersOrder(CustomersOrder customersOrder) {
        this.customersOrder = customersOrder;
    }
}

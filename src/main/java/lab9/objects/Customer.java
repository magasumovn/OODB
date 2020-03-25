package lab9.objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer extends Person {

    @Id
    private Long id;
    private String payment;
    @OneToMany
    private List<CustomersOrder> customersOrder;

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

    public List<CustomersOrder> getCustomersOrder() {
        return customersOrder;
    }

    public void setCustomersOrder(List<CustomersOrder> customersOrder) {
        this.customersOrder = customersOrder;
    }
}

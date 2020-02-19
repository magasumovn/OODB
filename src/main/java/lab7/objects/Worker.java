package lab7.objects;

import lab7.annotations.Column;
import lab7.annotations.Entity;
import lab7.annotations.Id;
import lab7.annotations.ManyToOne;

@Entity
public class Worker extends Person {
    @Id
    private Long id;

    @Column
    private String position;

    @Column
    @ManyToOne
    private Shop shop;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setposition(String position) {
        this.position = position;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}

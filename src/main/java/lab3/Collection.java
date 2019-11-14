package lab3;

import lab1.Shop;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "shops")
public class Collection {
    private List<Shop> shops;

    public Collection() {
    }


    @XmlElement(name = "shop")
    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

    public void addShop(Shop shop) {
        shops.add(shop);
    }
}

package lab1;

import javax.xml.bind.annotation.XmlElement;

public class Person {
    String name;
    String email;
    int phone;

    public Person(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "email")
    public String getEmail() {
        return email;
    }

    @XmlElement(name = "phone")
    public int getPhone() {
        return phone;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone;
    }
}

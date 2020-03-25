package lab9.objects;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {
    @Column
    private String personName;
    @Column
    private String email;
    @Column
    private Long phone;

    public String getPersonName() {
        return personName;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPersonName(String name) {
        this.personName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}

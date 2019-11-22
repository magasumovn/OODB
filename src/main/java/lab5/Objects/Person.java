package lab5.Objects;

public class Person {
    String personName;
    String email;
    int phone;

    public Person(String name, String email, int phone) {
        this.personName = name;
        this.email = email;
        this.phone = phone;
    }

    public String getPersonName() {
        return personName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPersonName(String name) {
        this.personName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "name='" + personName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone;
    }
}

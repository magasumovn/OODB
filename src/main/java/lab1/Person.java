package lab1;

public class Person {
    String name;
    String email;
    int phone;

    public Person(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
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

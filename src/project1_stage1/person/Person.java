package project1_stage1.person;
//24. Класс Person содержит поле‑объект Address. Создайте экземпляр и выведите его toString().

public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "name: " + name + ", address: " + address.toString();
    }
}

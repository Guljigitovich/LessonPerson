package Classes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int id;
    private BigDecimal money;

    public Person(String name, LocalDate dateOfBirth, int id, BigDecimal money) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "PersonService{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", id=" + id +
                ", money=" + money +
                '}';
    }
}

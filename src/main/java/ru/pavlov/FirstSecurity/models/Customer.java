package ru.pavlov.FirstSecurity.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCustomer;

    @Size(min = 2, max = 30, message = "bounds: 2-30")
    @NotEmpty(message = "name could not be empty")
    @Column(name = "name")
    private String name;

    @Size(min = 2, max = 30, message = "bounds: 2-30")
    @NotEmpty(message = "last name could not be empty")
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "role")
    private String role;

    @Size(min = 2, max = 50, message = "bounds: 2-30")
    @NotEmpty(message = "username could not be empty")
    @Column(name = "username")
    private String username;

    @NotEmpty(message = "password could not be empty")
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "owner")
    private List<Order> items;

    public Customer(){}

    public Customer(String name, String lastName, String username) {
        this.name = name;
        this.lastName = lastName;
        this.username = username;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getItems() {
        return items;
    }

    public void setItems(List<Order> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

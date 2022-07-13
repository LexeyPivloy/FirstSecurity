package ru.pavlov.FirstSecurity.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Order")
public class Order {

    @Id
    @Column(name="id_order")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrder;

    @Column(name="address")
    private String address;

    @Column(name="receiver")
    private String receiver;

    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer owner;

    @ManyToMany(mappedBy = "orders")
    private List<Cloth> items;

    public Order() {
    }

    public Order(String address, String receiver, String status) {
        this.address = address;
        this.receiver = receiver;
        this.status = status;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Cloth> getItems() {
        return items;
    }

    public void setItems(List<Cloth> items) {
        this.items = items;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}

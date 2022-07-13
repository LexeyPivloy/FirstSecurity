package ru.pavlov.FirstSecurity.dto;

import ru.pavlov.FirstSecurity.models.Cloth;
import ru.pavlov.FirstSecurity.models.Customer;

import javax.persistence.*;
import java.util.List;

public class OrderDTO {

    private int idOrder;

    private String address;

    private String receiver;

    private String status;

    private Customer owner;

    private List<Cloth> items;

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

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public List<Cloth> getItems() {
        return items;
    }

    public void setItems(List<Cloth> items) {
        this.items = items;
    }
}

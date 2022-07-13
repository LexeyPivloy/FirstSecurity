package ru.pavlov.FirstSecurity.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "cloth")
public class Cloth {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCloth;

    @Column(name="name")
    private String itemName;


    @Column(name="image")
    private String image;


    @Column(name="description")
    private String description;


    @Column(name="price")
    @Min(value = 0)
    private BigDecimal price;


    @Column(name="size")
    private String size;


    @Column(name="gender")
    private String gender;

    @Column(name="color")
    private String color;

    @ManyToMany
    @JoinTable(
            name = "order_cloth",
            joinColumns = @JoinColumn(name = "cloth_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private List<Order> orders;

    public Cloth() {
    }

    public Cloth(String itemName, String image, String description, BigDecimal price, String size, String gender, String color) {
        this.itemName = itemName;
        this.image = image;
        this.description = description;
        this.price = price;
        this.size = size;
        this.gender = gender;
        this.color = color;
    }

    public int getIdCloth() {
        return idCloth;
    }

    public void setIdCloth(int idCloth) {
        this.idCloth = idCloth;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }



    @Override
    public String toString() {
        return "Cloth{" +
                "idCloth=" + idCloth +
                ", itemName='" + itemName + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

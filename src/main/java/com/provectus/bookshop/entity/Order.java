package com.provectus.bookshop.entity;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "order_seggen")
    @SequenceGenerator(name = "order_seggen", sequenceName = "order_seq")
    private Long orderId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "quantity_books")
    private Integer quantityBooks;

    public Order() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getQuantityBooks() {
        return quantityBooks;
    }

    public void setQuantityBooks(Integer quantityBooks) {
        this.quantityBooks = quantityBooks;
    }
}

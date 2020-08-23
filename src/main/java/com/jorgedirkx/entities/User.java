package com.jorgedirkx.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="user")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany
    private List<InvoiceIn> invoiceInList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

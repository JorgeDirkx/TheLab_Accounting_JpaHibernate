package com.jorgedirkx.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoicein")
public class InvoiceIn {

    @Id
    @GeneratedValue
    private int id;
    private String service;
    private int amount;
    private Date date;
    private String paid;

    @ManyToOne
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "InvoiceIn{" +
                "id=" + id +
                ", service='" + service + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", paid='" + paid + '\'' +
                '}';
    }

}

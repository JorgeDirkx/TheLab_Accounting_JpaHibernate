package com.jorgedirkx.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="invoiceout")
public class InvoiceOut {

    @Id
    @GeneratedValue
    private int id;
    private String client;
    private int amount;
    @Column(name="date_invoice_")
    private Date date;
    private String received;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
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

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    @Override
    public String toString() {
        return "InvoiceOut{" +
                "id=" + id +
                ", client='" + client + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", received='" + received + '\'' +
                '}';
    }
}

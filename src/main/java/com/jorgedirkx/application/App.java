package com.jorgedirkx.application;

import com.jorgedirkx.entities.InvoiceIn;
import com.jorgedirkx.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

import static javax.persistence.Persistence.*;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("accounting_db");
        EntityManager em = emf.createEntityManager();

        InvoiceIn invoicIn1 = new InvoiceIn();
        invoicIn1.setAmount(150);
        invoicIn1.setPaid("yes");
        invoicIn1.setService("internet");

        User user1 = new User();
        user1.setName("Jorge");

        invoicIn1.setUser(user1);

        em.getTransaction().begin();
        em.persist(invoicIn1);
        em.getTransaction().commit();


        em.close();
        emf.close();


    }
}

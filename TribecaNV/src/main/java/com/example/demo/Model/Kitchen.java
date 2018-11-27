package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kitchen")
public class Kitchen {

    @Id
    private int id;
    private String kitchen_name;

    public Kitchen() {
    }

    public Kitchen(int id, String kitchen_name) {
        this.id = id;
        this.kitchen_name = kitchen_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKitchen_name() {
        return kitchen_name;
    }

    public void setKitchen_name(String kitchen_name) {
        this.kitchen_name = kitchen_name;
    }
}

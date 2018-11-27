package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "renters")
public class Renter {

    @Id
    private int id;
    private String renters_name;

    public Renter() {
    }

    public Renter(int id, String renters_name) {
        this.id = id;
        this.renters_name = renters_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRenters_name() {
        return renters_name;
    }

    public void setRenters_name(String renters_name) {
        this.renters_name = renters_name;
    }
}

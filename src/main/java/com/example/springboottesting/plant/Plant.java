package com.example.springboottesting.plant;

<<<<<<< HEAD
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "plant")
=======
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//import org.hibernate.annotations.Table;
import org.json.JSONArray;
import org.json.JSONException;
//import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="plant")
>>>>>>> es100-6
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String genus;
    @Size(min = 3, max = 20)
    private String subfamily;
    private String distribution;

    public Plant() { }

    public Plant(int id, String genus, String subfamily, String distribution) {
        super();
        this.id = id;
        this.genus = genus;
        this.subfamily = subfamily;
        this.distribution = distribution;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSubfamily() {
        return subfamily;
    }

    public void setSubfamily(String subfamily) {
        this.subfamily = subfamily;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }
}

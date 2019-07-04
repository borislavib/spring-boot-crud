package com.example.springboottesting.plant;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plant {

    @Id
    private String id; // Int ?
    private String genus;
    private String subfamily;
    private String distribution;

    public Plant() { }

    public Plant(String id, String genus, String subfamily, String distribution) {
        super();
        this.id = id;
        this.genus = genus;
        this.subfamily = subfamily;
        this.distribution = distribution;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

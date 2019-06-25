package com.example.springboottesting.plant;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class Plant {

    private String id;
    private String genus;
    private String subfamily;
    private ArrayList<String> distribution = new ArrayList<String>() {
//        {
//            add("Europe");
//            add("Asia");
//            add("America");
//        }
    }; ;

    public Plant() { }

    public Plant(String id, String genus, String subfamily, ArrayList<String> distribution) {
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

    public ArrayList<String> getDistribution() {
        return distribution;
    }

    public void setDistribution(ArrayList<String> distribution) throws JSONException {
        // this.distribution.add(distribution);


        this.distribution = distribution;

        JSONArray jsonArray = new JSONArray(distribution);
        List<String> list = new ArrayList<String>();
        for (int i=0; i<jsonArray.length(); i++) {
            list.add(jsonArray.getString(i));

        }
    }
}

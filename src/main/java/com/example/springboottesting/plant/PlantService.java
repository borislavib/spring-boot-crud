package com.example.springboottesting.plant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlantService {


    @Autowired
    private PlantRepository plantRepository;


    public List<Plant> getAllPlants() {
        List<Plant> plants = new ArrayList<>();
        plantRepository.findAll()
                .forEach(plants::add);
        return plants;
    }

    public Plant getPlant(String id) {

        List<Plant> plants = new ArrayList<>();
        plantRepository.findAll()
                .forEach(plants::add);

        for (int i = 0; i < plants.size(); i++) {
            Plant t = plants.get(i);

            if (t.getId().equals(id)) {
                return t;
            }
        }

        return null;

    }

    public void addPlant(Plant plant) {
        plantRepository.save(plant);
    }

    public void updatePlant(String id, Plant plant) {
        plantRepository.save(plant);
    }

    public void deletePlant(String id) {
        plantRepository.deleteById(id);
    }

}

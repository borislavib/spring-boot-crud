package com.example.springboottesting.plant;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class PlantService {

    private List<Plant> plants = new ArrayList<>(Arrays.asList(
        new Plant("1", "Nolina", "Nolinoideae", new ArrayList<>(Arrays.asList("S America", "Europe"))),
        new Plant("2", "Nerium", "Apocynoideae", new ArrayList<>(Arrays.asList("S America", "Worldwide"))),
        new Plant("3", "Spathiphyllum", "Monsteroideae", new ArrayList<>(Arrays.asList("S America", "Asia")))
    ));

    public List<Plant> getAllPlants() {
        return plants;
    }

    public Plant getPlant(String id) {
       return plants.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void updatePlant(String id, Plant plant) {

        for (int i = 0; i < plants.size(); i++) {
            Plant t = plants.get(i);

            if (t.getId().equals(id)) {
                plants.remove(i);
                plants.set(i, plant);
                return;
            }
        }
    }

    public void deletePlant(String id) {
        plants.removeIf(t -> t.getId().equals(id));
    }

}

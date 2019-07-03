package com.example.springboottesting.plant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlantService {


    @Autowired
    private PlantRepository plantRepository;
//
//    private List<Plant> plants = new ArrayList<>(Arrays.asList(
//        new Plant("1", "Nolina", "Nolinoideae", new ArrayList<>(Arrays.asList("S America", "Europe"))),
//        new Plant("2", "Nerium", "Apocynoideae", new ArrayList<>(Arrays.asList("S America", "Worldwide"))),
//        new Plant("3", "Spathiphyllum", "Monsteroideae", new ArrayList<>(Arrays.asList("S America", "Asia")))
//    ));
//
//    public List<Plant> getAllPlants() {
//        return plants;
//    }
//
//    public Plant getPlant(String id) {
//       return plants.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//    }
//
//    public void addPlant(Plant plant) {
//        plants.add(plant);
//    }
//
//    public void updatePlant(String id, Plant plant) {
//
//        for (int i = 0; i < plants.size(); i++) {
//            Plant t = plants.get(i);
//
//            if (t.getId().equals(id)) {
//                plants.remove(i);
//                plants.set(i, plant);
//                return;
//            }
//        }
//    }
//
//    public void deletePlant(String id) {
//        plants.removeIf(t -> t.getId().equals(id));
//    }

    public List<Plant> getAllPlants() {
        List<Plant> plants = new ArrayList<>();
        plantRepository.findAll()
                .forEach(plants::add);
        return plants;
    }

    public Plant getPlant(String id) {
//        return  plantRepository.findById(id).get();

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

package com.example.springboottesting.plant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class PlantController {

    @Autowired
    private PlantService plantService;

    @RequestMapping("/plants")
    public List<Plant> getAllPlants() {
        return plantService.getAllPlants();
    }

    @RequestMapping("/plants/{id}")
    public Plant getPlant(@PathVariable String id) {
        return plantService.getPlant(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/plants")
    public void addPlant(@RequestBody Plant plant) {
        plantService.addPlant(plant);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/plants/{id}")
    public void updatePlant(@RequestBody Plant plant, @PathVariable String id) {
        plantService.updatePlant(id, plant);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/plants/{id}")
    public void deletePlant(@PathVariable String id) {
        plantService.deletePlant(id);
    }
}

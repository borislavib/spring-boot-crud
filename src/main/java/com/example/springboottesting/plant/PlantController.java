package com.example.springboottesting.plant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class PlantController {

    @Autowired
    private PlantService plantService;

    @RequestMapping("/")
    public String welcome() {
        return plantService.welcome();
    }

    @RequestMapping("/plants")
    public List<Plant> getAllPlants() {
        return plantService.getAllPlants();
    }

    @RequestMapping("/plants/{id}")
    public Plant getPlant(@PathVariable int id) {
        return plantService.getPlant(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/plants")
    public void addPlant(@RequestBody Plant plant) {
        plantService.addPlant(plant);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/plants/{id}")
    public void updatePlant(@RequestBody Plant plant, @PathVariable int id) {
        plantService.updatePlant(id, plant);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/plants/{id}")
    public void deletePlant(@PathVariable int id) {
        plantService.deletePlant(id);
    }

    @GetMapping("home")
    public String plantsQuote() {
        return "\n" +
                "Plants and plant-eaters co-evolved. And plants aren't the passive partners in the chain of " +
                "terrestrial life. Hence today's Pop Ecology movement is quite wrong in believing that plants are" +
                " happy to fill their role as fodder for herbivores in a harmonious and perfectly balanced" +
                " ecosystem. A birch tree doesn't feel cosmic fulfillment when a moose munches its leaves;" +
                " the tree species, in fact, evolves to fight the moose, to keep the animal's munching lips away" +
                " from vulnerable young leaves and twigs. In the final analysis, the merciless hand of natural" +
                " selection will favor the birch genes that make the tree less and less palatable to the moose in" +
                " generation after generation. No plant species could survive for long by offering itself as" +
                " unprotected fodder.\n" +
                "Robert T. Bakker, The Dinosaur Heresies: A Revolutionary View of Dinosaurs (1986), Longman Scientific & Technical, p. 179" +
                "";
    }
}

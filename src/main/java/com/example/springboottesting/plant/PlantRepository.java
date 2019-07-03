package com.example.springboottesting.plant;

import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant, String> {

}

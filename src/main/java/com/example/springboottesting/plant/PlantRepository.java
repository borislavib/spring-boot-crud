package com.example.springboottesting.plant;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
//public interface PlantRepository extends JpaRepository<Plant, Integer> {
//
//    public Plant findByGenus(String genus);
//}
public interface PlantRepository extends CrudRepository<Plant, Integer> {

}


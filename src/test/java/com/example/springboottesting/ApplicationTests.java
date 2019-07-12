package com.example.springboottesting;

import com.example.springboottesting.plant.Plant;
import com.example.springboottesting.plant.PlantRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public class ApplicationTests {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private PlantRepository plantRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void whenFindByGenus_thenReturnPlant() {
		// given
		Plant plant = new Plant(1,
				"Nolina Beaucarnea recurvata",
				"Nolinoideae",
				"S America");
		entityManager.persist(plant);
		entityManager.flush();
//		Employee alex = new Employee("alex");
//		entityManager.persist(alex);
//		entityManager.flush();
//
//		// when
//		Employee found = employeeRepository.findByName(alex.getName());
//		Plant found =  plant.getGenus();

//		// then
////		assertThat(found.getName())
////				.isEqualTo(alex.getName());
//		boolean res = found.getGenus().equals(plant.getGenus());
//		assertTrue(res);
	}
}

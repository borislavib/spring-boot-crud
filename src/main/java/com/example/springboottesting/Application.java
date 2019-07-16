package com.example.springboottesting;

import com.example.springboottesting.plant.Plant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
//@ComponentScan({"com.example.springboottesting.plant"})
//@EntityScan("com.example.springboottesting")
//@EnableJpaRepositories("com.example.springboottesting")
public class Application implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... strings) throws Exception {

		log.info("Creating tables");

		jdbcTemplate.execute("DROP TABLE plant IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE plant" +
				"(" +
				"id SERIAL, genus VARCHAR(255), subfamily VARCHAR(255), distribution VARCHAR(255))");

		List<Object[]> splitUpNames = Arrays.asList("Nolina", "Nerium", "Spathiphyllum", "Alocasia").stream()
				.map(genus -> genus.split(" "))
				.collect(Collectors.toList());

		// Use a Java 8 stream to print out each tuple of the list
		splitUpNames.forEach(genus -> log.info(String.format("Inserting plant record for %s", genus)));

		// Uses JdbcTemplate's batchUpdate operation to bulk load data
		jdbcTemplate.batchUpdate("INSERT INTO plant(genus, subfamily, distribution) VALUES (?,?,?)", splitUpNames);


		/// int id, String genus, String subfamily, String distribution
		log.info("Querying for plant records where plant = 'Nerium':");
//		jdbcTemplate.query(
////				"SELECT id, genus, subfamily, distribution FROM plant WHERE genus = ?", new Object[] { "Nerium" },
//////				(rs, rowNum) -> new Plant(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
//		).forEach(plant -> log.info(plant.toString()));
	}

}
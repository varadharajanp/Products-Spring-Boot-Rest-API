package com.java;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.java.domain.Config;
import com.java.domain.Product;
import com.java.repository.ConfigRepository;
import com.java.repository.ProductRepository;

@SpringBootApplication
public class ProductsSpringBootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsSpringBootRestApiApplication.class, args);
	}

	@Profile("demo")
	@Bean
	CommandLineRunner initDatabase(ProductRepository prepository, ConfigRepository crepository) {

		return args -> {
			prepository.save(new Product("Product 1", new BigDecimal("15.01"), 10, "PC001"));
			prepository.save(new Product("Product 2", new BigDecimal("25.02"), 10, "PC002"));
			prepository.save(new Product("Product 3", new BigDecimal("35.03"), 10, "PC003"));

			crepository.save(new Config(111, 111, "UNIT 1", "COLOR 1"));
			crepository.save(new Config(222, 222, "UNIT 2", "COLOR 2"));
			crepository.save(new Config(333, 333, "UNIT 3", "COLOR 3"));

		};
	}

}

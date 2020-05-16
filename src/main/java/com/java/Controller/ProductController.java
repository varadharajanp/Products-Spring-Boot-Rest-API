package com.java.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.domain.Product;
import com.java.repository.ProductRepository;

@RestController
@Validated
public class ProductController {

	@Autowired
	private ProductRepository repository;

	@GetMapping("/api/getproductdetails")
	List<Product> findAll() {
		return repository.findAll();
	}
	
	

}

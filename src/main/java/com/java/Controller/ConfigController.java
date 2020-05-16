package com.java.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.domain.Config;
import com.java.repository.ConfigRepository;

@RestController
@Validated
public class ConfigController {

	@Autowired
	private ConfigRepository repository;
	
	@GetMapping("/api/getconfigdetails")
	List<Config> findAll() {
		return repository.findAll();
	}
}

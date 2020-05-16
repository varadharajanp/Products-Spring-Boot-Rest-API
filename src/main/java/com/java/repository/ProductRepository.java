package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

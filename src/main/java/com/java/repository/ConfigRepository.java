package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.domain.Config;

public interface ConfigRepository extends JpaRepository<Config, Long> {

}

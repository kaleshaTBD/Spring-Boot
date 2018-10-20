package com.jpa.bootjpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpa.bootjpa.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
	

}

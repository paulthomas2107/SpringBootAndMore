package com.pault.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pault.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
	
	

}

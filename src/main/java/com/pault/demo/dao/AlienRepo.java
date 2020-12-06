package com.pault.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pault.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
	
	List<Alien> findByTech(String tech);

	List<Alien> findByAge(int age);
	
	List<Alien> findByAgeGreaterThan(int age);
	
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech);
	
	

}

package com.wpl.dao;

import org.springframework.stereotype.Component;

import com.wpl.model.Trips;

import java.util.List;

@Component
public interface TripsDAO {
  
    List<Trips> findAll();
    
    Trips findByuserid(String userid);
    
    List<Trips> findByCid(int i);
    
    Trips save(Trips trips);
    
    Trips delete(Trips trips);

	Trips create(Trips trips);

	Trips update(Trips trips);

	Trips delete(int id);

	Trips findByuserid(int id);
   
}
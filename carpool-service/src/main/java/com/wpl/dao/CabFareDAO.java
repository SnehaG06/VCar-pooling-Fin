package com.wpl.dao;
import org.springframework.stereotype.Component;

import com.wpl.model.CabFare;

import java.util.List;
@Component
public interface CabFareDAO {
    
	List<CabFare> findAll();
    
    CabFare save(CabFare fare);
    
    CabFare findByuserId(int userId);

	CabFare update(CabFare fare);
}

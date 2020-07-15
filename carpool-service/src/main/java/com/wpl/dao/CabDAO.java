package com.wpl.dao;
import org.springframework.stereotype.Component;

import com.wpl.model.Cab;

import java.util.List;
@Component
public interface CabDAO {
List<Cab> findAll();
    
    List<Cab> findByCompnyId(String CompnyId);
    
    Cab save(Cab cab);
    
    Cab findBycid(int cid);

	Cab update(Cab cab);
}

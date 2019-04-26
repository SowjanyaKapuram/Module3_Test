package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.model.TDSDetails;
@Repository
@Component("tdsDao")    //mapping with the object in service  
@ComponentScan("com")

public class TDSDaoImpl implements TDSDao {
	@PersistenceContext
	EntityManager entityManager;
	public 	TDSDetails getById( int id) {
		 
		TDSDetails tdsDetails =entityManager.find(TDSDetails.class, id);
		return tdsDetails;
	}

}

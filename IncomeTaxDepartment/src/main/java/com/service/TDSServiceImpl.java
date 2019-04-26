package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.TDSDao;
import com.model.TDSDetails;

@Service
@Transactional
@Component("tdsService")    // mapping with the object created in controller
public class TDSServiceImpl implements TDSService {

	@Autowired
	TDSDao tdsDao;
	
	 
	public TDSDetails getById(int id) {
		 
		return tdsDao.getById(id);
	}

}

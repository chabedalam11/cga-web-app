package com.mpc.cga.api.service;


import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpc.cga.api.entity.C001sec;
import com.mpc.cga.api.repo.C001secRepository;




@Service("c001secService")
public class C001secServiceImpl implements C001secService{
	private static final Logger log = LoggerFactory.getLogger(C001secServiceImpl.class);
	private static final String TAG ="PosDetailsServiceImpl :: {} ";

	@Autowired
	private C001secRepository c001secRepository;
	
	@Override
	public boolean saveC001sec(C001sec obj) {
		try {
			c001secRepository.save(obj);
			return true;
		}catch (Exception e) {
			log.error(TAG,e.getMessage());
		}
		return false;
	}

	@Override
	public List<C001sec> findAllC001sec() {
		List<C001sec> posDetailss = new ArrayList<C001sec>();
		try {
			posDetailss =  c001secRepository.findAll();
		}catch (Exception e) {
			log.error(TAG,e.getMessage());
		}
		return posDetailss;
	}

	@Override
	public boolean deleteC001sec(C001sec obj) {
		try {
			c001secRepository.delete(obj);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	
}

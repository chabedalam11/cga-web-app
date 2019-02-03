package com.mpc.cga.api.service;

import java.util.List;

import com.mpc.cga.api.entity.C001sec;


public interface C001secService {
	public boolean saveC001sec(C001sec obj);
	public List<C001sec> findAllC001sec();
	public boolean deleteC001sec(C001sec obj);
}

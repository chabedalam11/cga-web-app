package com.mpc.cga.api.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpc.cga.api.entity.C001sec;

@Repository("c001secRepository")
public interface C001secRepository extends JpaRepository<C001sec, Integer> {
	C001sec findById(int id);
}

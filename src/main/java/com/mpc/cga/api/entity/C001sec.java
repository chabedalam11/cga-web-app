package com.mpc.cga.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "c001sec")
public class C001sec {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;

	@Column(name = "abbre")
	private String abbre;

	@Column(name = "elabo")
	private String elabo;


	public C001sec() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAbbre() {
		return abbre;
	}


	public void setAbbre(String abbre) {
		this.abbre = abbre;
	}


	public String getElabo() {
		return elabo;
	}


	public void setElabo(String elabo) {
		this.elabo = elabo;
	}
	
	
}

package com.example.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ord_id;
	
	private String ord_name;
	
	private String ord_email;

	public int getOrd_id() {
		return ord_id;
	}

	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}

	public String getOrd_name() {
		return ord_name;
	}

	public void setOrd_name(String ord_name) {
		this.ord_name = ord_name;
	}

	public String getOrd_email() {
		return ord_email;
	}

	public void setOrd_email(String ord_email) {
		this.ord_email = ord_email;
	}

	public order(int ord_id, String ord_name, String ord_email) {
		super();
		this.ord_id = ord_id;
		this.ord_name = ord_name;
		this.ord_email = ord_email;
	}

	public order() {
		super();
		// TODO Auto-generated constructor stub
	}


}

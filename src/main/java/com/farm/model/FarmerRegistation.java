package com.farm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class FarmerRegistation { 
	
	@Id
	private int id;
	private String name;
	private String password;
	private String mobileNumber;
	private String address;
	private String gender;
	
	public FarmerRegistation(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	
	

}

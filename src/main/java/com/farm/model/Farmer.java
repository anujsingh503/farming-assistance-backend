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
public class Farmer {

	@Id
	private int id;
	private String name;
	private String mobileNumber;
	private String dddress;
	private String farmingArea;
	private String cropsRate;
	
	public Farmer(String name, String mobileNumber, String dddress, String farmingArea, String cropsRate) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.dddress = dddress;
		this.farmingArea = farmingArea;
		this.cropsRate = cropsRate;
	}
}

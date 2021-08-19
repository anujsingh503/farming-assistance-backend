package com.farm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Farmer {

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

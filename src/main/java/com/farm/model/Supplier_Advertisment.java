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
public class Supplier_Advertisment {
	
	@Id
	private int s_cropId;
	private String s_cropName;
	private String s_cropImage;
	private String s_cropQuantity;

}

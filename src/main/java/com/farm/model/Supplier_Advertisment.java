package com.farm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Supplier_Advertisment {
	
	private int s_cropId;
	private String s_cropName;
	private String s_cropImage;
	private String s_cropQuantity;

}

package com.farm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Supplier_CorpReceived {
	
	private int s_cropId;
	private String s_supplierName;
	private String s_cropName;
	private String s_quantity;
	private String s_cropPrice;

}

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
public class Supplier_CorpReceived {
	
	@Id
	private int s_cropId;
	private String s_supplierName;
	private String s_cropName;
	private String s_quantity;
	private String s_cropPrice;
	

}

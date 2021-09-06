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
public class FarmerCorpAdevertisement {  
	
   @Id
   private int corpId;
   private String suplpierName;
   private String corpName;
   private String corpQuantity;
   private String corpPrice;

}

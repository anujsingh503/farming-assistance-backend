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
public class Supplier_Registation { 
	
	@Id
	private int s_id;
	private String name;
	private String password;
	private String s_mobileNumber;
	private String s_address;
	private String s_gender;
	private byte[] s_profile_image;
	

}

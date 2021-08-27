package com.farm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Supplier_Registation { 
	
	private int s_id;
	private String s_name;
	private String s_password;
	private String s_mobileNumber;
	private String s_address;
	private String s_gender;
	private byte[] s_profile_image;
	

}

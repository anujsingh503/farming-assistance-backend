package com.farm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.dao.FarmerCorpAdevertisementRepository;
import com.farm.model.FarmerCorpAdevertisement;

@Service
public class FarmerCorpAdevertisementServiceImpl implements FarmerCorpAdevertisementService  {
	
	
	@Autowired
	private FarmerCorpAdevertisementRepository farmerCorpAdevertisementRepository;
	
	public String farmerCorpPost(FarmerCorpAdevertisement farmerCorpAdevertisement)
	{
		
		farmerCorpAdevertisementRepository.save(farmerCorpAdevertisement);
		return null;
	}

}

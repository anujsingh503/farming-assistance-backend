package com.farm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.dao.FarmingTipsRepository;
import com.farm.model.FarmingTips;

@Service
public class FarmingTipsServiceImpl implements FarmingTipsService {
	
	
	@Autowired
	private FarmingTipsRepository farmingTipsRepository;
	
	public String createTips(FarmingTips farmingTips)
	{
		farmingTipsRepository.save(farmingTips);
		return null;
	}

}

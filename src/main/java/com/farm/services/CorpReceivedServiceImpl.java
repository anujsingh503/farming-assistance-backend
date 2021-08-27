package com.farm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.dao.CorpReceivedRepository;
import com.farm.model.Supplier_CorpReceived;

@Service
public class CorpReceivedServiceImpl implements CorpReceivedService {
	
	@Autowired
	private CorpReceivedRepository corpReceivedRepository;
	
	public String corpReceived(Supplier_CorpReceived supplier_CorpReceived)
	{
		corpReceivedRepository.save(supplier_CorpReceived);
		return null;
	}

}

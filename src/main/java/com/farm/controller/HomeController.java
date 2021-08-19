package com.farm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@RequestMapping(value="/record",method = RequestMethod.POST,produces ="application/json" )
	public String dashboardRecord()
	{
		
		return "";
	}

}

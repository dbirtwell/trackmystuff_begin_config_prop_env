package com.dbirtwell.trackmystuff.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbirtwell.trackmystuff.config.ConfigProperties;

@RestController
@RequestMapping("/trackmystuff")
public class ConfigController {
	
	@Autowired
	private ConfigProperties configProperties;
	
	@GetMapping("")
	public String getHome() {
		return "Current Active Profile: " + 
				configProperties.getActiveProfile();
	}
	
	@RequestMapping("/message")
	public Map dynamicConfiguration() {
	    // Not the best practice to use a map to store different types!
	    Map map = new HashMap();
	    map.put("message", configProperties.getMessage());
	    //map.put("number", configuration.getNumber());
	    //map.put("key", configuration.isValue());
	    return map;
	}

}

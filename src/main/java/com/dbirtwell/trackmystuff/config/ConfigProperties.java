package com.dbirtwell.trackmystuff.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author dbirtwell
 * A class to wire application properties to a Configuration Object
 *
 */
@Configuration
@ConfigurationProperties
public class ConfigProperties {
 	@Value("${spring.profiles.active}") 
	private String activeProfile;
 	
 	@Value("${app.message}") 
	private String message;	

	public String getActiveProfile() {
		return activeProfile;
	}

	public String getMessage() {
		return message;
	}
}
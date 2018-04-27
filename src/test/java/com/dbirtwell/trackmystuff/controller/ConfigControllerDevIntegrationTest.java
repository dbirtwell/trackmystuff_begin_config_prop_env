package com.dbirtwell.trackmystuff.controller;

import static org.hamcrest.CoreMatchers.containsString;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.dbirtwell.trackmystuff.Application;

@ActiveProfiles({"dev"})
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,
	webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConfigControllerDevIntegrationTest {
	
	private static final String LOCAL_HOST =
			"http://localhost:";
	
	@LocalServerPort
	private int port;
	
	private TestRestTemplate template = new TestRestTemplate();
	
	@Test
	public void configControllerHomeTest() throws Exception {
		String responseStringPiece = "Current Active Profile: dev";
		
		ResponseEntity<String> response = template
				.getForEntity(createURL("/trackmystuff"), String.class);
		assertThat(response.getBody(), containsString(responseStringPiece));
	}	
	
	@Test
	public void configControllerMessageTest() throws Exception {
		
		// <200,{"message":"\"Message from Development Properties\""},{Content-Type=[application/json;charset=UTF-8], Transfer-Encoding=[chunked], Date=[Fri, 27 Apr 2018 16:07:01 GMT]}>
		String responseStringPiece = "Message from Development Properties";
		
		ResponseEntity<String> response = template
				.getForEntity(createURL("/trackmystuff/message"), String.class);
		assertThat(response.getBody(), containsString(responseStringPiece));
	}
	
	private String createURL(String uri) {
		return LOCAL_HOST + port + uri;
	}	

}

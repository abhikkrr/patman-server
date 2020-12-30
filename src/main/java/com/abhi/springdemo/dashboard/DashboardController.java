package com.abhi.springdemo.dashboard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class DashboardController {
	
	@GetMapping(path = "/dashboard")
	public ResponseEntity<List<String>> dashboardInfo(){
		
		List<String> list = new ArrayList<>();
		ResponseEntity<List<String>> responseEntity = new ResponseEntity<List<String>>(list,HttpStatus.OK);
		return responseEntity;
		
/*for learning*/
		/* 12345*/
		
		/* for testing purpose */
		/*working of pull */
	}

}

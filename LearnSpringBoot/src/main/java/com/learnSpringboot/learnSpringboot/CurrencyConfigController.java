package com.learnSpringboot.learnSpringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//[
// 
// 
// 
// ]

//courses
//course :id ,name , author

@RestController
public class CurrencyConfigController {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retriveAllCourses(){
		
		return configuration;
	}

	
}

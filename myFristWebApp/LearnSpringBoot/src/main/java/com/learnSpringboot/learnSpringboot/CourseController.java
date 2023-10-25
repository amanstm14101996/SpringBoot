package com.learnSpringboot.learnSpringboot;

import java.util.Arrays;
import java.util.List;

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
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses(){
		
		return Arrays.asList(
				
				new Course(1,"Learn Aws", "Aman"),
				new Course(2,"Learn Aws1", "Raj"),
				new Course(3,"Learn Aws2", "Raj1")
				);
	}

	
}

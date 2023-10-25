package com.learnSpringboot.learnSpringboot.course.springDataJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSpringboot.learnSpringboot.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course,  Long>{
	
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
	

}

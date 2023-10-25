package com.learnSpringboot.learnSpringboot.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learnSpringboot.learnSpringboot.course.Course;
import com.learnSpringboot.learnSpringboot.course.jpa.CourseJPARepository;
import com.learnSpringboot.learnSpringboot.course.springDataJPA.CourseSpringDataJPARepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseSpringDataJPARepository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"learn AWS","Raj"));
		repository.save(new Course(2,"learn Azure","Raj"));
		repository.save(new Course(3,"learn Spring","Raj"));
		repository.save(new Course(4,"learn Kubernetes","Raj"));
		repository.deleteById((long) 1);
		repository.findById((long) 3);
		System.out.println("2------------------------------------------" +repository.findById((long) 3));
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("Raj"));
		System.out.println(repository.findByAuthor(""));
		System.out.println(repository.findByName("learn Kubernetes"));
	}

}

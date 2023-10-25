package com.learnSpringboot.learnSpringboot.course.jpa;

import org.springframework.stereotype.Repository;

import com.learnSpringboot.learnSpringboot.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {
	
//	@Autowired --- instead of Autowired @PersistenceContext
	@PersistenceContext
	private EntityManager entity;
	
	public void insert(Course course) {
		entity.merge(course);
	}

	public Course findById(long id) {
		return entity.find(Course.class, id);
	}
	
	public void deleteById(long id) {
		Course course = entity.find(Course.class, id);
		entity.remove(course);
	}
}

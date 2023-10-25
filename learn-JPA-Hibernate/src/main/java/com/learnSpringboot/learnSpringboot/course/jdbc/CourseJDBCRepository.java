package com.learnSpringboot.learnSpringboot.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learnSpringboot.learnSpringboot.course.Course;

@Repository
public class CourseJDBCRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
				insert into course (id, name, author)
				values(?,?,?);
			""";
	
	private static String DELETE_QUERY_BY_ID = 
			"""
//				insert into course (id, name, author)
//				values(?,?,?);
				delete from course where id = ?;
			""";
	
	private static String SELECT_QUERY_BY_ID = 
			"""
				select * from course where id = ?;
			""";
	
	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
	
	public void insert(Course course) {
		springJdbcTemplate.update
		(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
	}

	public void deletebyId(long id) {
		springJdbcTemplate.update
		(DELETE_QUERY_BY_ID,id);
	}
	
	public Course findById(long id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY_BY_ID, new BeanPropertyRowMapper<>(Course.class), 2);

	}
}

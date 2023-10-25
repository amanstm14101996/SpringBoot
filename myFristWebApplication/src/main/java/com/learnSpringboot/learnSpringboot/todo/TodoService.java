package com.learnSpringboot.learnSpringboot.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo(1, "in28min", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(1, "in28min", "Learn Devops", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(1, "in28min", "Learn Full Stack Development", LocalDate.now().plusMonths(3), false));
		
	}
	
	public List<Todo> findByUser(String userName){
		
		return todos;
	}

}

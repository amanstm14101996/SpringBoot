package com.learnSpringboot.learnSpringboot.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	
	

	@Autowired
	private TodoService service;
	
//	public TodoController(TodoService service) {
//		super();
//		this.service = service;
//	}


	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		
		List<Todo> todos = service.findByUser("in28min");
		model.put("todos", todos);
		return "listTodos";
	}
}

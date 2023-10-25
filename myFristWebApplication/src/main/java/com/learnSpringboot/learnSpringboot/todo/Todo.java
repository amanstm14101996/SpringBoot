package com.learnSpringboot.learnSpringboot.todo;

import java.time.LocalDate;


public class Todo {
	
	private int id;
	private String userName;
	private String description;
	private LocalDate date;
	private boolean done;
	
	
	public Todo(int id, String userName, String description, LocalDate date, boolean done) {
		super();
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.date = date;
		this.done = done;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public boolean isDone() {
		return done;
	}


	public void setDone(boolean done) {
		this.done = done;
	}


	@Override
	public String toString() {
		return "Todo [id=" + id + ", userName=" + userName + ", description=" + description + ", date=" + date
				+ ", done=" + done + "]";
	}

}

package com.ubiqcoding.core.beans;

import java.util.Date;

public class ToDo {
	
	//what is my to do app going to have? 
	long ID;
	String title;
	String description;
	Date dateCreated;
	Date dueDate;
	
	//constructor
	public ToDo() {
		System.out.println("New To Do Created");
	}
	
	public ToDo(String title) {
		System.out.println("New To Do: " + title);
	}
	
	//methods for to do
	void addToDo() {
		
	}
	
	void deleteToDo() {
		
	}
	
	void addDescription() {
		
	}
	
	void completeToDo() {
		
	}
	
	/*
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	*/

}

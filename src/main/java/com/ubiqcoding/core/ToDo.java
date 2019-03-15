package com.ubiqcoding.core;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class ToDo {
	
	//what is my to do app going to have? 
	private static int ID = 101;
	
	@NotNull
	private String title;
	
	@Size(max=160)
	private String description;
	
	@DateTimeFormat(iso=ISO.DATE)
	private Date dateCreated;
	
	private Date dueDate;
	
	public ToDo() {
		System.out.println("New To Do created");
	}
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		this.ID = ID;
	}
	
	@NotNull 
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

}

package com.hw2.model.dto;

public class Employee extends Person{

	public String position;
	
	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}
	
	@Override
	public String getInfo() {
		return "";
	}





}
